package test;

import driver.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import utils.TestListener;

@Listeners({TestListener.class})
public abstract class CommonConditions {
    protected WebDriver webDriver;
    protected static final String HOMEPAGE_URL = "https://misp-dev1.by2.epm-chrt.projects.epam.com/login";
    protected static final String expectedResult = "Иванов И. И.";

    @BeforeClass(alwaysRun = true)
    public void browserSetUp() {
        webDriver = DriverSingleton.getWebDriver();
    }

    @AfterClass(alwaysRun = true)
    public void browserTearDown() {
        DriverSingleton.closeWebDriver();
    }
}




