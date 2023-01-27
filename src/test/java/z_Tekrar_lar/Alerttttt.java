package z_Tekrar_lar;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilitis.TestBase;

public class Alerttttt extends TestBase {
    @Test
    public void test() {
        //● Bir class olusturun: Alerts
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
        driver.findElement(By.xpath("//*[text()='Click for JS Prompt']")).click();
        driver.switchTo().alert().sendKeys("muslum baba");
        driver.switchTo().alert().accept();

        String yazi = driver.findElement(By.xpath("//p[@id='result']")).getText();
        Assert.assertTrue(yazi.contains("muslum baba"));

    }

    private void dismissAlert() {
        driver.findElement(By.xpath("//*[@onclick='jsConfirm()']")).click();
        driver.switchTo().alert().dismiss();
        String actualDismis = driver.findElement(By.xpath("//*[text()='You clicked: Cancel']")).getText();
        Assert.assertFalse(actualDismis.contains("successfuly"));

    }

    private void acceptAlert() {
driver.findElement(By.xpath("//*[@onclick='jsAlert()']")).click();
driver.switchTo().alert().accept();

String aceptAlert1 =  driver.findElement(By.xpath("//*[@id='result']")).getText();
String exceptedAlert1 = "You successfully clicked an alert";
        Assert.assertEquals(aceptAlert1, exceptedAlert1);

    }
}
