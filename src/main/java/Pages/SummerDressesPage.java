package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SummerDressesPage {
    private final WebDriver driver;
    private final By size = By.id("layered_id_attribute_group_3");
    private final By color = By.id("layered_id_attribute_group_13");
    private final By loadSize = By.id("layered_ajax_loader");
    private final By loadColor = By.cssSelector("#center_column ul p");
    private final By item = By.xpath("//*[@id=\"center_column\"]/ul/li/div/div[1]/div");
    private final By addToCartButton = By.xpath("//*[@id=\"center_column\"]/ul/li[1]/div/div[2]/div[2]/a[1]");
    private final By proceedCheckoutPage = By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a/span");

    public SummerDressesPage(WebDriver driver) {
        this.driver = driver;
    }

    public OrderSummaryPage filterDress() {
        driver.findElement(size).click();
        waitForAction(loadSize);
        driver.findElement(color).click();
        waitForAction(loadColor);
        Actions actions = new Actions(driver);
        WebElement itemElement = driver.findElement(item);
        actions.moveToElement(itemElement).perform();
        driver.findElement(addToCartButton).click();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(proceedCheckoutPage)));
        driver.findElement(proceedCheckoutPage).click();
        return new OrderSummaryPage(driver);
    }

    private void waitForAction(By element) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.invisibilityOf(driver.findElement(element)));
    }

}
