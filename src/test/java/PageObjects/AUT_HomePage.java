package PageObjects;

import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import utils.HelperUtils;
import utils.PropertyUtils;

public class AUT_HomePage extends BasePage{

	@FindBy(xpath="//div[text()='TV, Appliances, Electronics']")
	public WebElement tvApplianceElectronicsLink;
	
	@FindBy(xpath="//a[@id='nav-hamburger-menu']")
	public WebElement hamburgerLink;

	@FindBy(xpath="//a[text()='Televisions']")
	public WebElement televisionsLink;

	@FindBy(xpath="//div[@id='hmenu-content']")
	public WebElement hemMenu;
	
	@FindBy(id="twotabsearchtextbox")
	public WebElement searchInputBox;

	public AUT_HomePage(WebDriver driver){
		super(driver);
	}
	
	public void openUrl(){
		//Visit the application URL
		driver.get(PropertyUtils.getProperty("app.url"));
	  }
	public void clickHamburgerLink(){
		HelperUtils.explcitWaitUntilVisible(driver,hamburgerLink);
		hamburgerLink.click();

	}
	
	public void clickOnTvApplianceElectronicsLink(){
		//Click on TV and Appliance Electronics link
		HelperUtils.explcitWaitUntilVisible(driver,hemMenu);
		HelperUtils.scrollToElement(driver,tvApplianceElectronicsLink);
		tvApplianceElectronicsLink.click();
	}

	public void clickOnTelevisionsLink(){
		//Click on Televisions link
		HelperUtils.explcitWaitUntilVisible(driver,televisionsLink);
		televisionsLink.click();
	}

	public void verifyTelevisionsLink() {
		//Verify if user is on correct page
		String currentUrl = driver.getCurrentUrl();
		Assert.assertTrue(currentUrl.contains("television"));
	}
	
	public void clickOnSearchInputBox(){
		//Click on Televisions link
		HelperUtils.explcitWaitUntilVisible(driver,searchInputBox);
		searchInputBox.click();
	}
	
	public void searchForItem(){
		//Click on Televisions link
		HelperUtils.explcitWaitUntilVisible(driver,searchInputBox);
		searchInputBox.sendKeys(PropertyUtils.getProperty("item")+Keys.ENTER);
	}
}
