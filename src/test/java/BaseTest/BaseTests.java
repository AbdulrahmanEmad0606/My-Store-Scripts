package BaseTest;

import Pages.HomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertTrue;

public class BaseTests {
    private WebDriver driver;
    protected String email="erere33r222@ff.com";
    protected String password="123456";
    protected HomePage homePage;
    @BeforeClass
    public void setUpChromeDriver(){
        System.setProperty("webdriver.chrome.driver", "Resources/chromedriver.exe");
        driver=new ChromeDriver();
        driver.get("http://automationpractice.com/index.php");
        homePage =new HomePage(driver);
        driver.manage().window().maximize();
    }
}
