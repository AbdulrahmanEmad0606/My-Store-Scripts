package LoginTest;

import BaseTest.BaseTests;
import Pages.MyAccountPage;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class LoginTests extends BaseTests {
    @Test
    public void TestLoginSuccessfully(){
      var authPage=homePage.clickLoginBtn();
      authPage.setEmailAddressLogin(email);
      authPage.setPasswordLogin(password);
      MyAccountPage accountPage =  authPage.loginButton();
        assertEquals(accountPage.checkForLoginPage(),"Sign out");
    }
}
