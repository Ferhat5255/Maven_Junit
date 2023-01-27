package test_case_auto;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilitis.TestBase;

public class Test_Case08 extends TestBase {

    @Test
    public void test08() {

//  1. Launch browser
//2. Navigate to url 'http://automationexercise.com'
        driver.get("http://automationexercise.com");

//3. Verify that home page is visible successfully
        WebElement sayfaGorunur = driver.findElement(By.xpath("//*[@alt='Website for automation practice']"));
        Assert.assertTrue(sayfaGorunur.isDisplayed());

//4. Click on 'Products' button
        driver.findElement(By.xpath("//*[@class='material-icons card_travel']")).click();

//5. Verify user is navigated to ALL PRODUCTS page successfully
        WebElement proGorunur = driver.findElement(By.xpath("//*[text()='All Products']"));
        Assert.assertTrue(proGorunur.isDisplayed());

//6. The products list is visible
        WebElement listGorunur = driver.findElement(By.xpath("//*[@class='brands_products']"));
        Assert.assertTrue(listGorunur.isDisplayed());

//7. Click on 'View Product' of first product
        driver.findElement(By.xpath("(//*[@class='fa fa-plus-square'])[1]")).click();

//8. User is landed to product detail page
        String actualTitle = driver.getTitle();
        System.out.println("actualTitle = " + actualTitle);
        Assert.assertTrue(actualTitle.contains("Product Details"));

//9. Verify that detail detail is visible: product name, category, price, availability, condition, brand
        WebElement detailGorunur = driver.findElement(By.xpath("//*[text()='Category: Women > Tops']"));
        Assert.assertTrue(detailGorunur.isDisplayed());
    }
}
