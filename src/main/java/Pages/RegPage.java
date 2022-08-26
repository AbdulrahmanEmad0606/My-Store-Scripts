package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RegPage {
    private WebDriver driver;
    private By gender1 = By.id("id_gender2");
    private By customerFirstName = By.id("customer_firstname");
    private By customerLastName = By.id("customer_lastname");
    private By password = By.id("passwd");
    private By daysDropDown = By.id("days");
    private By monthsDropDown = By.id("months");
    private By yearsDropDown = By.id("years");
    private By newsLetterCheck =By.id("newsletter");

    // set location variables
    private By addressFirstName = By.id("firstname");
    private By addressLastName = By.id("lastname");
    private By company = By.id("company");
    private By address = By.id("address1");
    private By addressInput2=By.id("address2");
    private By city = By.id("city");
    private By state = By.id("id_state");
    private By postCode = By.id("postcode");
    private By country = By.id("id_country");
    private By additionalInfo = By.id("other");
    private By phone = By.id("phone");
    private By mobilePhone = By.id("phone_mobile");
    private By alias = By.id("alias");
    private By submitBtn = By.id("submitAccount");
    public RegPage(WebDriver driver){
        this.driver=driver;
    }
    public void setPersonalData
            (String fName,String lName,String myPassword){
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.presenceOfElementLocated(gender1));
            driver.findElement(gender1).click();
        driver.findElement(customerFirstName).sendKeys(fName);
        driver.findElement(customerLastName).sendKeys(lName);
        driver.findElement(password).sendKeys(myPassword);
       driver.findElement(newsLetterCheck).click();
    }
    public void selectDay(String option){
        Select select=new Select(driver.findElement(daysDropDown));
        select.selectByValue(option);
    }
    public void selectMonth(String option){
        Select select=new Select(driver.findElement(monthsDropDown));
        select.selectByValue(option);
    }
    public void selectYear(String option){
        Select select=new Select(driver.findElement(yearsDropDown));
        select.selectByValue(option);
    }
    public void setAddressesAndCompany(String addFname,String addLname,String addCompany,String addLine1,String addLin2){
        driver.findElement(addressFirstName).sendKeys(addFname);
        driver.findElement(addressLastName).sendKeys(addLname);
        driver.findElement(company).sendKeys(addCompany);
        driver.findElement(address).sendKeys(addLine1);
        driver.findElement(addressInput2).sendKeys(addLin2);
    }
    public void setAddresses
            (String myCity,String myState,String myCode,
             String myCountry,String myInfo,String HomePhone,
             String mobilePhone1,String myAlias){
        driver.findElement(city).sendKeys(myCity);
        Select selectState=new Select(driver.findElement(state));
        selectState.selectByValue(myState);
        driver.findElement(postCode).sendKeys(myCode);
        Select selectCountry=new Select(driver.findElement(country));
        selectCountry.selectByValue(myCountry);
        driver.findElement(additionalInfo).sendKeys(myInfo);
        driver.findElement(phone).sendKeys(HomePhone);
        driver.findElement(mobilePhone).sendKeys(mobilePhone1);
        driver.findElement(alias).sendKeys(myAlias);
    }






    //    public void setAddressData
//            (String address1,String address2,String companyName,String myAddress,String addressLine2,String myCity,String myState,
//             String myPostalCode,String myCountry,String info,String myMobPhone,String myPhone,String myAlias
//             ){
//        clearText("firstname");
//        driver.findElement(addressFirstName).sendKeys(address1);
//        clearText("lastname");
//        driver.findElement(addressLastName).sendKeys(address2);
//        clearText("company");
//        driver.findElement(company).sendKeys(companyName);
//        clearText("address1");
//        driver.findElement(address).sendKeys(myAddress);
//        clearText("address2");
//        driver.findElement(addressInput2).sendKeys(addressLine2);
//        clearText("city");
//        driver.findElement(city).sendKeys(myCity);
//        Select selectState=new Select(driver.findElement(state));
//        selectState.selectByVisibleText(myState);
//        clearText("postcode");
//        driver.findElement(postCode).sendKeys(myPostalCode);
//        Select selectCountry=new Select(driver.findElement(country));
//        selectCountry.selectByVisibleText(myCountry);
//        clearText("other");
//        driver.findElement(additionalInfo).sendKeys(info);
//        clearText("phone");
//        driver.findElement(phone).sendKeys(myPhone);
//        clearText("phone_mobile");
//        driver.findElement(mobilePhone).sendKeys(myMobPhone);
//        clearText("alias");
//        driver.findElement(alias).sendKeys(myAlias);
//
//    }
    // clear text
    private void clearText(String Element){
        driver.findElement(By.id(Element)).clear();
    }
   public MyAccountPage submitBtn(){
        driver.findElement(submitBtn).click();
        return new MyAccountPage(driver);
   }
}
