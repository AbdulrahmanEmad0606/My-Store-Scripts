package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private WebDriver driver;
    private By emailAddress = By.id("email");
    private By password = By.id("passwd");
    private By submitBtn = By.id("SubmitLogin");
    public LoginPage(WebDriver driver){
        this.driver=driver;
    }
    public void setEmailAddress(String email){
        driver.findElement(emailAddress).sendKeys(email);
    }
    public void setPassword(String myPassword){
        driver.findElement(password).sendKeys(myPassword);
    }
    public MyAccountPage loginButton(){
       driver.findElement(submitBtn).click();
       return new MyAccountPage(driver);
    }
}
