package test.page;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import model.User;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.$;

public class BasePage {
    private final SelenideElement fieldToEnterLogin = $(By.name("login"));
    private final SelenideElement fieldToEnterPassword = $(By.name("password"));

    public BasePage openHomePage(String url) {
        Selenide.open(url);
        return this;
    }

    public MISPPage enterLoginAndPassword(User testUser) {
        fieldToEnterLogin.setValue(testUser.getUserName()).pressTab();
        fieldToEnterPassword.setValue(testUser.getPassword()).pressEnter();
        return new MISPPage();
    }
}
