package pageObjects;

import commons.BasePage;
import org.openqa.selenium.WebDriver;
import pageUI.LoginPageUI;

public class LoginPageObject extends BasePage {

    public LoginPageObject(WebDriver driver) {
        this.driver = driver;
    }

    private WebDriver driver;

    public void inputEmailTextbox(String emailAddress) {
        sendKeyToElement(driver, LoginPageUI.EMAIL_TEXTBOX, emailAddress);
    }

    public void inputPasswordTextbox(String passwword) {
        sendKeyToElement(driver, LoginPageUI.PASSWORD_TEXTBOX, passwword);
    }

    public void clickToLoginButton() {
        clickToElement(driver, LoginPageUI.REGISTER_LINK);
    }
}
