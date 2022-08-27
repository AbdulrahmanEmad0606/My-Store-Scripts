package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ShippingPage {
    private final WebDriver driver;
    private final By acceptTermsCheck = By.id("cgv");
    private final By proceed4 = By.cssSelector("p button");

    public ShippingPage(WebDriver driver) {
        this.driver = driver;
    }

    public PaymentPage paymentPage() {
        driver.findElement(acceptTermsCheck).click();
        driver.findElement(proceed4).click();
        return new PaymentPage(driver);
    }

}
