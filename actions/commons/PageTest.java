package commons;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;
import java.util.Random;

public class BaseTest {

    private WebDriver driver;
    protected  int generateRandomNumber(){
        return new Random().nextInt(9999);
    }

    protected WebDriver getBrowserDriver(String browserName){
        switch (browserName) {
            case "chrome":
                driver = new ChromeDriver();
                break;
            case "Edge":
                driver = new EdgeDriver();
                break;
            default:
                throw new RuntimeException("Browser name is not valid");
        }

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://demo.nopcommerce.com/");
        return driver;
    }
}
