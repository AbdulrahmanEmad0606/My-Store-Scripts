package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PaymentPageConfirm {
    private final WebDriver driver;
    private final By proceed5 = By.cssSelector("#cart_navigation button");

    public PaymentPageConfirm(WebDriver driver) {
        this.driver = driver;
    }

    public ConfirmOrderPage confirm() {
        driver.findElement(proceed5).click();
        return new ConfirmOrderPage(driver);
    }
}
