package test_case_auto;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilitis.TestBase;

public class Test_Case14 extends TestBase {
    @Test
    public void test14() {

//        1. Launch browser
//        2. Navigate to url 'http://automationexercise.com'
        driver.get("http://automationexercise.com");

//        3. Verify that home page is visible successfully
        WebElement sayfaGorunur = driver.findElement(By.xpath("//i[@class='material-icons card_travel']"));
        Assert.assertTrue(sayfaGorunur.isDisplayed());

//        4. Add products to cart
        Actions actions = new Actions(driver);
        WebElement ilkUrun = driver.findElement(By.xpath("(//div[@class='productinfo text-center'])[1]"));
        actions.moveToElement(ilkUrun).perform();

        driver.findElement(By.xpath("(//a[@class='btn btn-default add-to-cart'])[1]")).click();

//        5. Click 'Cart' button
        driver.findElement(By.xpath("//u[text()='View Cart']")).click();

//        6. Verify that cart page is displayed
        WebElement pagGorunur = driver.findElement(By.xpath("//*[text()='Proceed To Checkout']"));
        Assert.assertTrue(pagGorunur.isDisplayed());

//        7. Click Proceed To Checkout
        driver.findElement(By.xpath("//*[text()='Proceed To Checkout']")).click();

//        8. Click 'Register / Login' button
        driver.findElement(By.xpath("//*[text()='Register / Login']")).click();

//        9. Fill all details in Signup and create account
        driver.findElement(By.xpath("//*[@data-qa='signup-name']"))
                .sendKeys("duru", Keys.TAB, "duru1207@duru.com", Keys.TAB, Keys.ENTER);
        driver.findElement(By.id("id_gender1")).click();
        driver.findElement(By.id("password")).sendKeys("12345", Keys.TAB, "5", Keys.TAB, "June", Keys.TAB, "1985"
                , Keys.TAB, Keys.TAB, Keys.TAB, "DURU", Keys.TAB, "BAY", Keys.TAB, "TECH", Keys.TAB
                , "MEMURKENT", Keys.TAB, "CAMLIK", Keys.TAB, "Canada", Keys.TAB, "Karadeniz", Keys.TAB, "ORDU", Keys.TAB, "5555"
                , Keys.TAB, "0506", Keys.TAB, Keys.ENTER);

//        10. Verify 'ACCOUNT CREATED!' and click 'Continue' button
        WebElement accGorunur = driver.findElement(By.xpath("//b[text()='Account Created!']"));
        Assert.assertTrue(accGorunur.isDisplayed());
        driver.findElement(By.xpath("//a[@data-qa='continue-button']")).click();

//        11. Verify ' Logged in as username' at top
        WebElement logGorunur = driver.findElement(By.xpath("//i[@class='fa fa-user']"));
        Assert.assertTrue(logGorunur.isDisplayed());

//        12.Click 'Cart' button
        driver.findElement(By.xpath("//*[text()= ' Cart']")).click();

//        13. Click 'Proceed To Checkout' button
        driver.findElement(By.xpath("//*[text()= 'Proceed To Checkout']")).click();

//        14. Verify Address Details and Review Your Order
        WebElement addGorunur = driver.findElement(By.xpath("//*[text()= 'Address Details']"));
        Assert.assertTrue(addGorunur.isDisplayed());

//        15. Enter description in comment text area and click 'Place Order'
        driver.findElement(By.name("message")).sendKeys("basarili", Keys.TAB, Keys.ENTER);

//        16. Enter payment details: Name on Card, Card Number, CVC, Expiration date
        driver.findElement(By.name("name_on_card")).sendKeys("ferhat"
                , Keys.TAB, "123412341234", Keys.TAB, "123", Keys.TAB, "12", Keys.TAB, "2023");

//        17. Click 'Pay and Confirm Order' button
        driver.findElement(By.xpath("//*[@data-qa='pay-button']")).click();

//        18. Verify success message 'Your order has been placed successfully!'
        String mesaj = driver.findElement(By.xpath("(//*[@class='alert-success alert'])[1]")).getText();
        Assert.assertTrue(mesaj.contains("Your order has been placed successfully!"));

//        19. Click 'Delete Account' button
        driver.findElement(By.xpath("//*[@href='/delete_account']")).click();

//        20. Verify 'ACCOUNT DELETED!' and click 'Continue' button
       WebElement delGorunur =  driver.findElement(By.xpath("//h2[@data-qa='account-deleted']"));
       Assert.assertTrue(delGorunur.isDisplayed());

       driver.findElement(By.xpath("//*[@data-qa='continue-button']")).click();

    }
}
