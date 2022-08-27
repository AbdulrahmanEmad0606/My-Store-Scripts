package OrderTest;

import BaseTest.BaseTests;
import Pages.MyAccountPage;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class OrderTests extends BaseTests {
    @Test
    public void getOrdersBeforeCreatingNewOne() {
        var authPage = homePage.clickLoginBtn();
        authPage.setEmailAddressLogin(email);
        authPage.setPasswordLogin(password);
        var myAccount = authPage.loginButton();
        var listOrders = myAccount.summaryOrdersPage();
        int ordersBefore = listOrders.getOrdersCount();
        var summerDresses = listOrders.hoverOverDresses();
        var summary = summerDresses.filterDress();
        var setAddress = summary.addressesPage();
        var shipping = setAddress.shippingPage();
        var payment = shipping.paymentPage();
        var confirmation = payment.confirm();
        var confirmationOrder = confirmation.confirm();
        var listOrdersAfter = confirmationOrder.myOrdersCount();
        int ordersAfter = listOrdersAfter.getOrdersCountAfterCreatingNewOrder();
        assertEquals(ordersBefore + 1, ordersAfter);
    }
}
