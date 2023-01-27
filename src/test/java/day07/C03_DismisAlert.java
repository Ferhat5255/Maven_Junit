package day07;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import utilitis.TestBase;

public class C03_DismisAlert extends TestBase {

    @Test
    public void dismisAlertTest() throws InterruptedException {

        driver.get("https://testcenter.techproeducation.com/index.php?page=javascript-alerts");

//        2. butona tıklayın,
        driver.findElement(By.xpath("//button[@onclick='jsConfirm()']")).click();
        Thread.sleep(5000);

//        uyarıdaki Cancel butonuna tıklayın
        driver.switchTo().alert().dismiss();//CANCEL secenegine tikliyoruz

//ve result mesajının "You clicked: Cancel" oldugunu test edin.
        String actualResult = driver.findElement(By.xpath("//*[@id='result']")).getText();
        String expectedResult = "You clicked: Cancel";
        Assert.assertEquals(expectedResult,actualResult);




    }
}
