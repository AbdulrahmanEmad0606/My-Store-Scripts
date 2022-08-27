package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PaymentPage {
    private final WebDriver driver;
    private final By paymentMethod = By.cssSelector(".bankwire");

    public PaymentPage(WebDriver driver) {
        this.driver = driver;
    }

    public PaymentPageConfirm confirm() {
        driver.findElement(paymentMethod).click();
        return new PaymentPageConfirm(driver);
    }

}
