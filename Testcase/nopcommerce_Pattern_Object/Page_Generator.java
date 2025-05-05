package nopcommerce_pattern_object;

import PatternObject.HomePageObject;
import PatternObject.LoginPageObject;
import PatternObject.RegisterPageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class Level_Patter_Object {
    WebDriver driver;

    private HomePageObject homePage;
    private LoginPageObject loginPage;
    private RegisterPageObject registerPage;

    @BeforeClass
    public void beforeClass(){
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.get("https://demo.nopcommerce.com/");

        homePage = new HomePageObject();
    }

    @Test
    public void TC_01_User_homePage(){
        homePage.clickToRegisterLink();

        registerPage = new RegisterPageObject();
    }

    @Test
    public void TC_02_User_registerPage(){
        registerPage.selectToGenderMale();
        registerPage.inputToFirstnameTextbox();
        registerPage.inputToLastnameTextbox();
        registerPage.inputToEmailTextbox();
        registerPage.inputToCompanyNameTextbox();
        registerPage.inputToPasswordTextbox();
        registerPage.inputToConfirmPasswordTextbox();
        registerPage.clickToRegisterLink();
        registerPage.textConfirmRegisterSuccess();
        registerPage.clickToLogoutLink();

        homePage.clickToLoginLink();

        loginPage = new LoginPageObject();

    }

    @Test
    public void TC_03_User_loginPage(){
        loginPage.inputToEmailTextbox();
        loginPage.inputToPasswordTextbox();
        loginPage.clickToLoginLink();
    }

    @AfterClass
    public void afterClass(){
        driver.quit();
    }
}
