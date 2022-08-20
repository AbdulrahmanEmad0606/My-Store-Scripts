package BaseTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertTrue;

public class BaseTests {
    private WebDriver driver;
    @Test
    public void setUpChromeDriver(){
        System.setProperty("webdriver.chrome.driver", "Resources/chromedriver.exe");
        driver=new ChromeDriver();
        driver.get("http://automationpractice.com/index.php");
        driver.manage().window().maximize();
        assertTrue(driver.getTitle().contains("My Store"));
    }
}
