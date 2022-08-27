package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MyAccountPage {
    private final WebDriver driver;
    private final By account = By.cssSelector(".account span");
    private final By myOrders = By.xpath("//*[@id=\"center_column\"]/div/div[1]/ul/li[1]/a");

    public MyAccountPage(WebDriver driver) {
        this.driver = driver;
    }

    public String checkForPage() {
        return driver.findElement(account).getText();
    }

    public String checkForLoginPage() {
        return driver.findElement(By.linkText("Sign out")).getText();
    }

    public ListOrdersPage summaryOrdersPage() {
        driver.findElement(myOrders).click();
        return new ListOrdersPage(driver);
    }
}
