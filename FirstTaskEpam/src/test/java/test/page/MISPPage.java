package test.page;

import com.codeborne.selenide.Selenide;

public class MISPPage {
    public String getUserName() {
        return Selenide.$x("//h6[@data-test = 'profile-name']").getText();
    }
}
