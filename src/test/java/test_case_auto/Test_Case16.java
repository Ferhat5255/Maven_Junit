package test_case_auto;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilitis.TestBase;

public class Test_Case16 extends TestBase {

    @Test
    public void name() {
//        1. Launch browser
//        2. Navigate to url 'http://automationexercise.com'
        driver.get("http://automationexercise.com");

//        3. Verify that home page is visible successfully
        WebElement sayfaGorunur = driver.findElement(By.xpath("//div[@class='logo pull-left']"));
        Assert.assertTrue(sayfaGorunur.isDisplayed());

//        4. Click 'Signup / Login' button
        driver.findElement(By.xpath("//*[text()=' Signup / Login']")).click();

//        5. Fill email, password and click 'Login' button


//        6. Verify 'Logged in as username' at top
//        7. Add products to cart
//        8. Click 'Cart' button
//        9. Verify that cart page is displayed
//        10. Click Proceed To Checkout
//        11. Verify Address Details and Review Your Order
//        12. Enter description in comment text area and click 'Place Order'
//        13. Enter payment details: Name on Card, Card Number, CVC, Expiration date
//        14. Click 'Pay and Confirm Order' button
//        15. Verify success message 'Your order has been placed successfully!'
//        16. Click 'Delete Account' button
//        17. Verify 'ACCOUNT DELETED!' and click 'Continue' button
    }
}
