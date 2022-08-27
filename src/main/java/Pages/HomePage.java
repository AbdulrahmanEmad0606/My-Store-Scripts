package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
    private final WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public AuthPage clickLoginBtn() {
        driver.findElement(By.linkText("Sign in")).click();
        return new AuthPage(driver);
    }

    public void ClickAction(String link) {
        driver.findElement(By.linkText(link)).click();
    }
}
