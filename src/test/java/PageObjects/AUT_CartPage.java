package PageObjects;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import utils.HelperUtils;
import utils.PropertyUtils;

public class AUT_CartPage extends BasePage{

	@FindBy(xpath="//input[@id='add-to-cart-button']")
	public WebElement cartButton;
	
	@FindBy(xpath="//*[@id=\"attachDisplayAddBaseAlert\"]/span")
	public WebElement cartItemText;
	
	@FindBy(id="titleSection")
	public WebElement title;
	
	public AUT_CartPage(WebDriver driver){
		super(driver);
	}
	
	public void clickCartButton(){
		HelperUtils.explcitWaitUntilVisible(driver,title);
		HelperUtils.scrollToElement(driver, cartButton);
		HelperUtils.explcitWaitUntilVisible(driver,cartButton);
		cartButton.click();

	}
	
	public void verifyIfItemIsAddedInCart(){
		
		HelperUtils.explcitWaitUntilVisible(driver,cartItemText);
		Assert.assertTrue(cartItemText.isDisplayed());
	}
	
	
	
}
