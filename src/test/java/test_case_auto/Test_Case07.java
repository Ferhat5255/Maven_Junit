package test_case_auto;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilitis.TestBase;

public class Test_Case07 extends TestBase {
    @Test
    public void test07() {
        //1. Launch browser
        //2. Navigate to url 'http://automationexercise.com'
        driver.navigate().to("http://automationexercise.com");

        //3. Verify that home page is visible successfully
        WebElement sayfaGorunur = driver.findElement(By.xpath("//*[@src='/static/images/home/logo.png']"));
        Assert.assertTrue(sayfaGorunur.isDisplayed());

        //4. Click on 'Test Cases' button
        driver.findElement(By.xpath("(//button[@type='button'])[1]")).click();

        //5. Verify user is navigated to test cases page successfully
        WebElement tcgorunur = driver.findElement(By.xpath("//h2[@class='title text-center']"));
        Assert.assertTrue(tcgorunur.isDisplayed());




    }
}
