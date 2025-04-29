package pageObjects;

import commons.BasePage;
import org.openqa.selenium.WebDriver;
import pageUI.HomePageUI;

public class HomePageObject extends BasePage {

    public HomePageObject(WebDriver driver) {
        this.driver = driver;
    }

    private WebDriver driver;

    //Hàm khởi tạo(constructor function)
    //1- Cùng tên với tên Class
    //2- Không kiểu trả về
    //3- Chạy đầu tiên khi class được gọi
    //4- Có tham số or không
    //5- Không tự define hàm khởi tạo thì JVM sẽ mặc định khởi tạo ra 1 hàm rỗng



    public void clickToRegisterButton() {
        clickToElement(driver, HomePageUI.REGISTER_LINK);
    }

    public void clickToLoginButton() {
        clickToElement(driver, HomePageUI.REGISTER_LINK);
    }

    public void clickToMyAccountButton() {
        clickToElement(driver, HomePageUI.MYACCOUNT_LINK);
    }
}
