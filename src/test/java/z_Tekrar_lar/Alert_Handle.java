package z_Tekrar_lar;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilitis.TestBase;

public class Alert_Handle extends TestBase {
    @Test
    public void test() {
        //● https://the-internet.herokuapp.com/javascript_alerts adresine gidin.
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");

        //● Bir metod olusturun: acceptAlert
        //○1. butona tıklayın, uyarıdaki OK butonuna tıklayın ve result mesajının
        //“You successfully clicked an alert” oldugunu test edin.
        acceptAlert();

        //● Bir metod olusturun: dismissAlert
        //○ 2. butona tıklayın, uyarıdaki Cancel butonuna tıklayın ve result mesajının
        //“successfuly” icermedigini test edin.
        dismissAlert();

        //● Bir metod olusturun: sendKeysAlert
        //○ 3. butona tıklayın, uyarıdaki metin kutusuna isminizi yazin, OK butonuna
        //tıklayın ve result mesajında isminizin görüntülendiğini doğrulayın.
        sendKeysAlert();
    }

    private void sendKeysAlert() {
        driver.findElement(By.xpath("//button[@onclick='jsPrompt()']")).click();
        driver.switchTo().alert().sendKeys("ferhat");
        driver.switchTo().alert().accept();
        String text3 = driver.findElement(By.xpath("//p[@id='result']")).getText();
        Assert.assertTrue(text3.contains("ferhat"));


    }

    private void dismissAlert() {
        driver.findElement(By.xpath("//button[@onclick='jsConfirm()']")).click();
        driver.switchTo().alert().dismiss();
        String text2=driver.findElement(By.xpath("//*[text()='You clicked: Cancel']")).getText();
        Assert.assertFalse(text2.contains("successfuly"));

    }

    private void acceptAlert() {
        driver.findElement(By.xpath("//*[text()='Click for JS Alert']")).click();
        driver.switchTo().alert().accept();
        String actualText = driver.findElement(By.xpath("//p[@id='result']")).getText();
        Assert.assertEquals("You successfully clicked an alert", actualText);
    }
}
