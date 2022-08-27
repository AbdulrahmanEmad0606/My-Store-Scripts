package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ConfirmOrderPage {
    private final WebDriver driver;
    private final By confirmationMessage = By.cssSelector(".page-heading");
    private final By backToMyOrders = By.xpath("//*[@id=\"center_column\"]/p/a");

    public ConfirmOrderPage(WebDriver driver) {
        this.driver = driver;
    }

    public ListOrdersPage myOrdersCount() {
        driver.findElement(backToMyOrders).click();
        return new ListOrdersPage(driver);
    }
}
