package test;

import model.User;
import org.testng.Assert;
import org.testng.annotations.Test;
import test.page.BasePage;
import service.UserCreation;

public class UserAccessTest extends CommonConditions {

    protected BasePage basePage = new BasePage();
    private static final String HOMEPAGE_URL = "https://misp-dev1.by2.epm-chrt.projects.epam.com";
    private static final String EXPECTED_RESULT = "Иванов И. И.";

    @Test(testName = "MISPTest")
    public void oneCanLoginToMISP() {
        User testUser = UserCreation.withCredentialFromProperty();
        String result = basePage.openHomePage(HOMEPAGE_URL)
                .enterLoginAndPassword(testUser)
                .getUserName();

        Assert.assertEquals(result, EXPECTED_RESULT);
    }
}
