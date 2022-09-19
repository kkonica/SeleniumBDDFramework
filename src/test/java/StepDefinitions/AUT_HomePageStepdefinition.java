package StepDefinitions;

import PageObjects.AUT_HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.DriverUtils;

public class AUT_HomePageStepdefinition {
    AUT_HomePage home = new AUT_HomePage(DriverUtils.getDriver());

    @Given("I open the URL")
    public void i_open_the_url() {
        home.openUrl();
    }

    @When("I click on Hamburger Menu")
    public void i_click_on_hamburger_menu() {
        home.clickHamburgerLink();
    }

    @When("I click on Tv Appliance Electronics link")
    public void i_click_on_Tv_Appliance_Electronics_link() {
        home.clickOnTvApplianceElectronicsLink();
    }

    @When("I click on Televisions link")
    public void i_click_on_televisions_link() {
        home.clickOnTelevisionsLink();
    }


    @Then("I should see televisions link")
    public void i_should_see_televisions_link() {
        home.verifyTelevisionsLink();
    }

    @When("I click on Search input box")
    public void i_click_on_search_input_box() {
        home.clickOnSearchInputBox();
    }

    @When("I search for item")
    public void i_search_for_item() {
        home.searchForItem();
    }

    
}
