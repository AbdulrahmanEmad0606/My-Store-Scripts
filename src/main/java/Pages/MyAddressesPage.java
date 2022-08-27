package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MyAddressesPage {
    private final WebDriver driver;
    private final By proceed3 = By.cssSelector("form p button");

    public MyAddressesPage(WebDriver driver) {
        this.driver = driver;
    }

    public ShippingPage shippingPage() {
        driver.findElement(proceed3).click();
        return new ShippingPage(driver);
    }
}
