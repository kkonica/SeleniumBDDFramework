package PageObjects;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.HelperUtils;
import java.util.List;
import java.util.Set;

public class AUT_ProductPage extends BasePage{

	@FindBy(xpath="//span[text()='Samsung']")
	public WebElement samsangTab;
	
	@FindBy(xpath="//select[@id='s-result-sort-select']")
	public WebElement selectDropdown;

	@FindBy(xpath="//div[@data-component-type='s-search-result']//h2/a")
	public List<WebElement> searchResult;

	@FindBy(id="productTitle")
	public WebElement productTitle;

	@FindBy(xpath="//div[@id='feature-bullets']//li/span")
	public List<WebElement> productFeatures;
	
	@FindBy(xpath="//div[@id='feature-bullets']//h1")
	public WebElement aboutThisItem;

	@FindBy(xpath="//span[@class='a-dropdown-prompt']")
	public WebElement sortByType;

	@FindBy(xpath="//div[@data-component-type='s-search-result']//h2/a")
	public List<WebElement> allItemLinks;
	
	public AUT_ProductPage(WebDriver driver){
		super(driver);
	}

	public void clickSamsangTab(){
		//Filter by Samsung brand
		HelperUtils.explcitWaitUntilVisible(driver,samsangTab);
		samsangTab.click();
	}

	public void verifySamsungLink() {
		String currentUrl = driver.getCurrentUrl();
		Assert.assertTrue(currentUrl.contains("Samsung"));
	}

	public void sortFromHighToLow(){
		//Sort the search results from High to Low
		HelperUtils.explcitWaitUntilVisible(driver,selectDropdown);
		Select sortDropdown = new Select(selectDropdown);
		sortDropdown.selectByVisibleText("Price: High to Low");
		HelperUtils.explcitWaitUntilVisible(driver,sortByType);
		Assert.assertEquals(sortByType.getText(),"Price: High to Low");
	}

	public void switchToIndividualProductpage(){
		//Click on second product in sorted list
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElements(searchResult));
		String productTextOnSearchPage= searchResult.get(1).getText();

		String currentWindow = driver.getWindowHandle();

		searchResult.get(1).click();
		Set<String> windowList = driver.getWindowHandles();
		for(String childWindow:windowList) {

			if(!childWindow.equals(currentWindow)) {
				driver.switchTo().window(childWindow);
			}
		}
		HelperUtils.explcitWaitUntilVisible(driver,productTitle);
		Assert.assertEquals(productTextOnSearchPage, productTitle.getText());
	}

	public void printProductFeatures(){
		//Print product features on console
		System.out.println(aboutThisItem.getText());
		for(WebElement feature:productFeatures){
			System.out.println(feature.getText());
		}
	}
}
