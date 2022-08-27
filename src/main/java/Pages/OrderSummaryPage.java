package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OrderSummaryPage {
    private final WebDriver driver;
    private final By proceed2 = By.xpath("//*[@id=\"center_column\"]/p[2]/a[1]");

    public OrderSummaryPage(WebDriver driver) {
        this.driver = driver;
    }

    public MyAddressesPage addressesPage() {
        driver.findElement(proceed2).click();
        return new MyAddressesPage(driver);
    }
}
