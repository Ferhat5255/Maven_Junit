package test_case_auto;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilitis.TestBase;

public class Test_Case12 extends TestBase {
    @Test
    public void test12() throws InterruptedException {

        //1. Launch browser
        //2. Navigate to url 'http://automationexercise.com'
        driver.get("https://automationexercise.com");

        //3. Verify that home page is visible successfully
        WebElement sayfaGorunur = driver.findElement(By.xpath("//i[@class='material-icons card_travel']"));
        Assert.assertTrue(sayfaGorunur.isDisplayed());

        //4. Click 'Products' button
        driver.findElement(By.xpath("//i[@class='material-icons card_travel']")).click();

        //5. Hover over first product and click 'Add to cart'
        Thread.sleep(3000);
        driver.findElement(By.xpath("(//a[@data-product-id='1'])[2]")).click();
        Thread.sleep(3000);

        driver.findElement(By.xpath("//input[@id='product_id']")).click();

        //6. Click 'Continue Shopping' button
        driver.findElement(By.xpath("//button[@class='btn btn-success close-modal btn-block']")).click();

        //7. Hover over second product and click 'Add to cart'
        driver.findElement(By.xpath("(//a[@data-product-id='2'])[1]")).click();

        //8. Click 'View Cart' button
        driver.findElement(By.xpath("//button[@class='btn btn-success close-modal btn-block']")).click();

        //9. Verify both products are added to Cart
        driver.findElement(By.xpath("(//i[@class='fa fa-shopping-cart'])[1]")).click();
        WebElement sepetGorunur = driver.findElement(By.xpath("//*[text()='Item']"));
        Assert.assertTrue(sepetGorunur.isDisplayed());


        //10. Verify their prices, quantity and total price

        //===========cart menu ile dogruladim  ===================
     WebElement menuGorunur =   driver.findElement(By.xpath("//tr[@class='cart_menu']"));
     Assert.assertTrue(menuGorunur.isDisplayed());




    }
}
