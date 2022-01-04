package test;

import driver.DriverSingleton;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import utils.TestListener;

@Listeners({TestListener.class})
public abstract class CommonConditions {

    @BeforeClass(alwaysRun = true)
    public void browserSetUp() {
        DriverSingleton.getWebDriver();
    }

    @AfterClass(alwaysRun = true)
    public void browserTearDown() {
        DriverSingleton.closeWebDriver();
    }
}




