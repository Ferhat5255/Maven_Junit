package test_case_auto;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilitis.TestBase;

public class Test_Case10 extends TestBase {
    @Test
    public void test10() {

        //1. Launch browser
        //2. Navigate to url 'http://automationexercise.com'
        //3. Verify that home page is visible successfully
        driver.get("http://automationexercise.com");
        WebElement sayfaGorunur = driver.findElement(By.xpath("//*[@class='fa fa-youtube-play']"));
        Assert.assertTrue(sayfaGorunur.isDisplayed());

        //4. Scroll down to footer===Altbilgiye dogru asagiya kaydir
        Actions actions = new Actions(driver);
        actions
                .sendKeys(Keys.PAGE_DOWN)
                .sendKeys(Keys.PAGE_DOWN)
                .sendKeys(Keys.PAGE_DOWN)
                .sendKeys(Keys.PAGE_DOWN)
                .sendKeys(Keys.PAGE_DOWN).perform();

        //5. Verify text 'SUBSCRIPTION'
        WebElement subGorunur = driver.findElement(By.xpath("//div[@class='form-row']"));
        Assert.assertTrue(subGorunur.isDisplayed());

        //6. Enter email address in input and click arrow button
        driver.findElement(By.id("susbscribe_email")).sendKeys("ebrar@ebrar.com");
        driver.findElement(By.xpath("//i[@class='fa fa-arrow-circle-o-right']")).click();


        //7. Verify success message 'You have been successfully subscribed!' is visible
        WebElement gorulur = driver.findElement(By.xpath("//*[@class='alert-success alert']"));
        Assert.assertTrue(gorulur.isDisplayed());



    }
}
