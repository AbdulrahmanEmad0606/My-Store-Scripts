package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RegPage {
    private final WebDriver driver;
    private final By gender1 = By.id("id_gender2");
    private final By customerFirstName = By.id("customer_firstname");
    private final By customerLastName = By.id("customer_lastname");
    private final By password = By.id("passwd");
    private final By daysDropDown = By.id("days");
    private final By monthsDropDown = By.id("months");
    private final By yearsDropDown = By.id("years");
    private final By newsLetterCheck = By.id("newsletter");

    // set location variables
    private final By addressFirstName = By.id("firstname");
    private final By addressLastName = By.id("lastname");
    private final By company = By.id("company");
    private final By address = By.id("address1");
    private final By addressInput2 = By.id("address2");
    private final By city = By.id("city");
    private final By state = By.id("id_state");
    private final By postCode = By.id("postcode");
    private final By country = By.id("id_country");
    private final By additionalInfo = By.id("other");
    private final By phone = By.id("phone");
    private final By mobilePhone = By.id("phone_mobile");
    private final By alias = By.id("alias");
    private final By submitBtn = By.id("submitAccount");

    public RegPage(WebDriver driver) {
        this.driver = driver;
    }

    public void setPersonalData(String fName, String lName, String myPassword) {
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.presenceOfElementLocated(gender1));
        driver.findElement(gender1).click();
        driver.findElement(customerFirstName).sendKeys(fName);
        driver.findElement(customerLastName).sendKeys(lName);
        driver.findElement(password).sendKeys(myPassword);
        driver.findElement(newsLetterCheck).click();
    }

    public void selectDay(String option) {
        Select select = new Select(driver.findElement(daysDropDown));
        select.selectByValue(option);
    }

    public void selectMonth(String option) {
        Select select = new Select(driver.findElement(monthsDropDown));
        select.selectByValue(option);
    }

    public void selectYear(String option) {
        Select select = new Select(driver.findElement(yearsDropDown));
        select.selectByValue(option);
    }

    public void setAddressesAndCompany(String addFname, String addLname, String addCompany, String addLine1, String addLin2) {
        driver.findElement(addressFirstName).sendKeys(addFname);
        driver.findElement(addressLastName).sendKeys(addLname);
        driver.findElement(company).sendKeys(addCompany);
        driver.findElement(address).sendKeys(addLine1);
        driver.findElement(addressInput2).sendKeys(addLin2);
    }

    public void setAddresses(String myCity, String myState, String myCode, String myCountry, String myInfo, String HomePhone, String mobilePhone1, String myAlias) {
        driver.findElement(city).sendKeys(myCity);
        Select selectState = new Select(driver.findElement(state));
        selectState.selectByValue(myState);
        driver.findElement(postCode).sendKeys(myCode);
        Select selectCountry = new Select(driver.findElement(country));
        selectCountry.selectByValue(myCountry);
        driver.findElement(additionalInfo).sendKeys(myInfo);
        driver.findElement(phone).sendKeys(HomePhone);
        driver.findElement(mobilePhone).sendKeys(mobilePhone1);
        driver.findElement(alias).sendKeys(myAlias);
    }

    public MyAccountPage submitBtn() {
        driver.findElement(submitBtn).click();
        return new MyAccountPage(driver);
    }
}
