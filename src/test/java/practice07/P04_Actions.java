package practice07;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilitis.TestBase;

public class P04_Actions extends TestBase {

/*
        -http://spicejet.com/ sayfasına gidelim
        -Sayfanın altındaki about us bölümü altındaki fleet linkine tıklayalım
        -Sayfa başlığının Fleet içerdiğini test edelim
     */

    @Test
    public void test04() {

//        http://spicejet.com/ sayfasına gidelim
        driver.get("https://spicejet.com/ ");

//        -Sayfanın altındaki about us bölümü altındaki fleet linkine tıklayalım
       WebElement aboutUs = driver.findElement(By.xpath("//*[.='About Us']"));
        Actions actions = new Actions(driver);
        actions.moveToElement(aboutUs).perform();
        waitFor(3);

        driver.findElement(By.xpath("//div[text()='Fleet']")).click();


//        -Sayfa başlığının Fleet içerdiğini test edelim
        Assert.assertTrue(driver.getTitle().contains("Fleet"));
    }
}
