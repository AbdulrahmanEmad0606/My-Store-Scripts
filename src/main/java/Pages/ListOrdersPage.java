package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class ListOrdersPage {
    private final WebDriver driver;
    private final By hoveredLink = By.xpath("//*[@id=\"block_top_menu\"]/ul/li[2]/a");
    private final By summerDress = By.xpath("//*[@id=\"block_top_menu\"]/ul/li[2]/ul/li[3]/a");

    private By orders = By.tagName("tr");
    public ListOrdersPage(WebDriver driver){
        this.driver=driver;
    }

    public int getOrdersCount(){
        List<WebElement> orderElements=  driver.findElements(orders);
        return orderElements.size();
    }
    // create order cycle

    public int getOrdersCountAfterCreatingNewOrder(){
        List<WebElement> orderElements=  driver.findElements(orders);
        return orderElements.size();
    }
    public SummerDressesPage hoverOverDresses() {
        Actions actions=new Actions(driver);
        WebElement element=driver.findElement(hoveredLink);
        actions.moveToElement(element).perform();
        driver.findElement(summerDress).click();
        return new SummerDressesPage(driver);
    }
}
