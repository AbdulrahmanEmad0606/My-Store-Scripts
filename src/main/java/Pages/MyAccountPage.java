package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class MyAccountPage {
    private WebDriver driver;
    private By account=By.cssSelector(".account span");
    private By hoveredLink=By.linkText("Dresses");
    private By topMenu=By.id("block_top_menu");
    private By summerDress=By.linkText("Summer Dresses");
    public MyAccountPage(WebDriver driver){
        this.driver=driver;
    }

    public String checkForPage (){
        return driver.findElement(account).getText();
    }
    public String checkForLoginPage (){
        return driver.findElement(By.linkText("Sign out")).getText();
    }
    // Filtration of sold dress
    public SummerDressesPage hoverOverDresses(){
        Actions actions=new Actions(driver);
        actions.moveToElement(driver.findElement(hoveredLink)).perform();
        driver.findElement(summerDress).click();
        return new SummerDressesPage(driver);
    }
}
