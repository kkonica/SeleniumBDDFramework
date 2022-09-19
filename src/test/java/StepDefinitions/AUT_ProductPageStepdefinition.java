package StepDefinitions;

import PageObjects.AUT_ProductPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.DriverUtils;
import utils.HelperUtils;

public class AUT_ProductPageStepdefinition {

    AUT_ProductPage productPage = new AUT_ProductPage(DriverUtils.getDriver());

    @When("I click on samsung tab")
    public void i_click_on_samsung_tab() {
        productPage.clickSamsangTab();
    }

    @Then("Verify samsung link")
    public void verify_samsung_link() {
        productPage.verifySamsungLink();
    }

    @When("search results are sorted by High to low")
    public void search_results_are_sorted_by_High_to_low() {
        productPage.sortFromHighToLow();
    }

    @When("I click on second product in sorted list")
    public void i_click_on_second_product_in_sorted_list() {
        productPage.switchToIndividualProductpage();
    }

    @Then("There should be product features regarding that tv")
    public void there_should_be_product_features_regarding_that_tv() {
        productPage.printProductFeatures();
    }
    
    @When("I click on second item link")
    public void i_click_on_second_item_link() {
    	productPage.switchToIndividualProductpage();
    }

}
