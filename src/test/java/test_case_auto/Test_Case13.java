package test_case_auto;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import utilitis.TestBase;

public class Test_Case13 extends TestBase {
    @Test
    public void test13() {

//        1. Launch browser
//        2. Navigate to url 'http://automationexercise.com'
        driver.get("http://automationexercise.com");

//        3. Verify that home page is visible successfully
        WebElement sayfaGorunur = driver.findElement(By.xpath("//i[@class='material-icons card_travel']"));
        Assert.assertTrue(sayfaGorunur.isDisplayed());

//        4. Click 'View Product' for any product on home page
        driver.findElement(By.xpath("(//i[@class='fa fa-plus-square'])[1]")).click();


//        5. Verify product detail is opened
         String sayfaUrl = driver.getTitle();
        System.out.println("sayfaUrl = " + sayfaUrl);
         Assert.assertTrue(sayfaUrl.contains("Product Details"));

//        6. Increase quantity to 4
        driver.findElement(By.xpath("//*[@id='quantity']")).sendKeys("4", Keys.TAB,Keys.ENTER);

//        7. Click 'Add to cart' button


//        8. Click 'View Cart' button
        driver.findElement(By.xpath("//u[text()='View Cart']")).click();

//        9. Verify that product is displayed in cart page with exact quantity
        WebElement proGorunur = driver.findElement(By.xpath("//*[text()='Shopping Cart']"));
        Assert.assertTrue(proGorunur.isDisplayed());
    }
}
