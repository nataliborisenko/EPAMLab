package page;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.WebDriver;
import static com.codeborne.selenide.Selenide.$;

public class MISPPage extends AbstractPage {

    private final SelenideElement lineWithUserName = $("//*[@class='MuiTypography-root jss109 MuiTypography-h6']");

    public MISPPage(WebDriver webDriver) {
        super(webDriver);
    }

    public String getUserName() {
        return lineWithUserName.getText();
    }
}
