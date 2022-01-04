package test;

import model.User;
import org.testng.Assert;
import org.testng.annotations.Test;
import page.BasePage;
import service.UserCreation;

public class UserAccessTest extends CommonConditions {

    @Test(testName = "MISPTest")
    public void OneCan() {
        User testUser = UserCreation.withCredentialFromProperty();
        BasePage basePage = new BasePage(webDriver);
        String result = basePage.openHomePage(HOMEPAGE_URL)
                .enterLoginAndPassword(testUser)
                .getUserName();
        Assert.assertTrue(result.contains(expectedResult));
    }
}
