package StepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import utils.DriverUtils;

public class ServiceHooks {

    @Before
    public void initializeTest() {
        DriverUtils.createDriver();
    }


    @After
    public void afterScenario() {
        DriverUtils.getDriver().quit();
    }

}
