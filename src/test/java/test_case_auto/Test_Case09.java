package test_case_auto;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import utilitis.TestBase;

import java.util.List;

public class Test_Case09 extends TestBase {
    @Test
    public void test09() {
//1. Launch browser
//2. Navigate to url 'http://automationexercise.com'
        driver.get("http://automationexercise.com");

//3. Verify that home page is visible successfully
        WebElement sayfaGorunur = driver.findElement(By.xpath("//*[@alt='Website for automation practice']"));
        Assert.assertTrue(sayfaGorunur.isDisplayed());

//4. Click on 'Products' button
        driver.findElement(By.xpath("//*[@class='material-icons card_travel']")).click();


//5. Verify user is navigated to ALL PRODUCTS page successfully
        WebElement proGorunur = driver.findElement(By.xpath("//h2[@class='title text-center']"));
        Assert.assertTrue(proGorunur.isDisplayed());

//6. Enter product name in search input and click search button
driver.findElement(By.xpath("//input[@id='search_product']")).sendKeys("Short");
driver.findElement(By.xpath("//i[@class='fa fa-search']")).click();

//7. Verify 'SEARCHED PRODUCTS' is visible
     WebElement searcGorunur = driver.findElement(By.xpath("//h2[@class='title text-center']"));
     Assert.assertTrue(searcGorunur.isDisplayed());

//8. Verify all the products related to search are visible
      // String allTittle =  driver.getTitle();
     //  Assert.assertTrue(allTittle.contains("All Products"));

        List<WebElement> allProducts = driver.findElements(By.xpath("//*[@class='productinfo text-center']/p"));
        for (WebElement w:allProducts) {
            Assert.assertTrue(w.isDisplayed());
        }


    }
}
