package page;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import model.User;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import static com.codeborne.selenide.Selenide.$;


public class BasePage extends AbstractPage {
    private final SelenideElement fieldToEnterLogin = $(By.name("login"));
    private final SelenideElement fieldToEnterPassword = $(By.name("password"));
    private final SelenideElement buttonForEnter = $("//*[@class='MuiButton-label']");

    public BasePage(WebDriver webDriver) {
        super(webDriver);
    }

    public BasePage openHomePage(String url) {
        Selenide.open(url);
        return this;
    }

    public MISPPage enterLoginAndPassword(User testUser) {
        fieldToEnterLogin.setValue(testUser.getUserName());
        fieldToEnterPassword.setValue(testUser.getPassword());
        buttonForEnter.click();
        return new MISPPage(webDriver);

    }
}
