package RegistrationTest;

import BaseTest.BaseTests;
import Pages.AuthPage;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class RegistrationTestCases extends BaseTests {
    @Test
    public void testRegistration() {
        AuthPage authPage = homePage.clickLoginBtn();
        authPage.setEmail(email);
        var regPage = authPage.registrationPage();
        String fName = "Ahmed";
        String lName = "Mohamed";
        regPage.setPersonalData(fName, lName, password);
        regPage.selectDay("1");
        regPage.selectMonth("2");
        regPage.selectYear("2020");
        regPage.setAddressesAndCompany("addFname", "adddLname", "addCompany", "addLine1", "addLine2");
        regPage.setAddresses("cairo", "2", "12345", "21", "new info", "0101010101", "0215454545", "new alia");
        var account = regPage.submitBtn();
        String profName = fName.concat(" ").concat(lName);
        assertEquals(account.checkForPage(), profName);
    }
}
