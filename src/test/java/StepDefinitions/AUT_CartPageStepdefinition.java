package StepDefinitions;

import PageObjects.AUT_CartPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.DriverUtils;

public class AUT_CartPageStepdefinition {

	AUT_CartPage cart = new AUT_CartPage(DriverUtils.getDriver());
	
	@When("I click on Add to Cart button")
    public void i_click_on_add_to_cart_button() {
        cart.clickCartButton();
    }

    @Then("TV should be added in the cart")
    public void tv_should_be_added_in_the_cart() {
       cart.verifyIfItemIsAddedInCart();
    }
}
