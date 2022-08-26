package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AuthPage {
    private WebDriver driver;
    private By emailInput = By.id("email_create");
    private By submitBtn = By.id("SubmitCreate");
    // for login
    private By emailAddress = By.id("email");
    private By password = By.id("passwd");
    private By submitBtnLogin = By.id("SubmitLogin");
    public AuthPage(WebDriver driver) {
        this.driver = driver;
    }
    public void setEmail(String email){
        driver.findElement(emailInput).sendKeys(email);
    }
    public RegPage registrationPage(){
      driver.findElement(submitBtn).click();
      return new RegPage(driver);
    }
    // for login
    public void setEmailAddressLogin(String email){
        driver.findElement(emailAddress).sendKeys(email);
    }
    public void setPasswordLogin(String myPassword){
        driver.findElement(password).sendKeys(myPassword);
    }
    public MyAccountPage loginButton(){
        driver.findElement(submitBtnLogin).click();
        return new MyAccountPage(driver);
    }
}
