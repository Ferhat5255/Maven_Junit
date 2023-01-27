package test_case_auto;

import com.github.javafaker.Faker;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.network.model.DataReceived;
import org.openqa.selenium.interactions.Actions;
import utilitis.TestBase;

public class Test_Case15 extends TestBase {

    @Test
    public void test15() {
//        1. Launch browser
//        2. Navigate to url 'http://automationexercise.com'
        driver.get("http://automationexercise.com");

//        3. Verify that home page is visible successfully
        WebElement sayfaGorunur = driver.findElement(By.xpath("//div[@class='logo pull-left']"));
        Assert.assertTrue(sayfaGorunur.isDisplayed());

//        4. Click 'Signup / Login' button
        driver.findElement(By.xpath("//*[text()=' Signup / Login']")).click();

//        5. Fill all details in Signup and create account
        driver.findElement(By.xpath("//input[@data-qa='signup-name']")).sendKeys("duru", Keys.TAB, "dur5r@hot.com", Keys.TAB, Keys.ENTER);

//        6. Verify 'ACCOUNT CREATED!' and click 'Continue' button
        WebElement girisGorunur = driver.findElement(By.xpath("//*[text()='Enter Account Information']"));
        Assert.assertTrue(girisGorunur.isDisplayed());

        Actions actions = new Actions(driver);
        Faker faker = new Faker();

        driver.findElement(By.xpath("//*[@id='id_gender1']")).click();

        driver.findElement(By.xpath("//*[@id='password']")).
                sendKeys(faker.internet().password(),
                        Keys.TAB,
                        "12",
                        Keys.TAB,
                        "May",
                        Keys.TAB,
                        "1985",
                        Keys.TAB,
                        Keys.TAB,
                        Keys.TAB,
                        faker.name().firstName(),
                        Keys.TAB,
                        faker.name().lastName(),
                        Keys.TAB,
                        faker.job().seniority(),
                        Keys.TAB,
                        faker.address().streetAddress(),
                        Keys.TAB,
                        faker.address().fullAddress(),
                        Keys.TAB,
                        "Canada",
                        Keys.TAB,
                        faker.address().state(),
                        Keys.TAB,
                        faker.address().city(),
                        Keys.TAB,
                        faker.address().zipCode(),
                        Keys.TAB,
                        faker.phoneNumber().phoneNumber(),
                        Keys.TAB, Keys.ENTER);

                driver.findElement(By.xpath("//*[@class='btn btn-primary']")).click();

        //        7. Verify ' Logged in as username' at top

               // Assert.assertTrue(driver.findElement(By.xpath("//*[text()=' Logged in as ']")).isDisplayed());

//        8. Add products to cart
           WebElement ilkUrun = driver.findElement(By.xpath("(//*[@class='productinfo text-center'])[1]"));

           actions.moveToElement(ilkUrun).perform();

           driver.findElement(By.xpath("(//*[@class='btn btn-default add-to-cart'])[1]")).click();
            driver.findElement(By.xpath("//*[text()='View Cart']")).click();

//        9. Click 'Cart' button
driver.findElement(By.xpath("//*[text()=' Cart']")).click();

//        10. Verify that cart page is displayed
     Assert.assertTrue(driver.findElement(By.xpath("//*[text()='Shopping Cart']")).isDisplayed());


//        11. Click Proceed To Checkout
        driver.findElement(By.xpath("//*[text()='Proceed To Checkout']")).click();

//        12. Verify Address Details and Review Your Order
        WebElement adresGorunur = driver.findElement(By.xpath("//*[text()='Your delivery address']"));
        Assert.assertTrue(adresGorunur.isDisplayed());

//        13. Enter description in comment text area and click 'Place Order'
        driver.findElement(By.xpath("//*[text()='Place Order']")).click();

//        14. Enter payment details: Name on Card, Card Number, CVC, Expiration date
      WebElement kartNo =   driver.findElement(By.xpath("//*[@name='name_on_card']"));

      kartNo.sendKeys("duru",Keys.TAB, "123456",Keys.TAB,"333",Keys.TAB,"12",Keys.TAB, "1234",Keys.TAB, Keys.ENTER);
      waitFor(15);

//        15. Click 'Pay and Confirm Order' button
//        16. Verify success message 'Your order has been placed successfully!'
        assert driver.findElement(By.xpath("//*[@id='success_message']")).isDisplayed();

//        17. Click 'Delete Account' button
        driver.findElement(By.xpath("//*[text()=' Delete Account']")).click();

//        18. Verify 'ACCOUNT DELETED!' and click 'Continue' button
        assert driver.findElement(By.xpath("//*[text()='Account Deleted!']")).isDisplayed();


    }
}
