package day07;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import utilitis.TestBase;

public class C04_PrompAlert extends TestBase {

    @Test
    public void sendKeysMethod() throws InterruptedException {

        driver.get("https://testcenter.techproeducation.com/index.php?page=javascript-alerts");

//    3. butona tıklayın,
        driver.findElement(By.xpath("//button[@onclick='jsPrompt()']")).click();
        Thread.sleep(5000);

        //    uyarıdaki metin kutusuna isminizi yazin,
        driver.switchTo().alert().sendKeys("FB");
        Thread.sleep(5000);

//    OK butonuna tıklayın
        driver.switchTo().alert().accept();
        Thread.sleep(5000);

        //    ve result mesajında isminizin görüntülendiğini doğrulayın.
        String actualResult = driver.findElement(By.id("result")).getText();//You entered: FB
        String expectedResult = "FB";
        Assert.assertTrue(actualResult.contains(expectedResult));

    }
    /*
    Alertler nasil automate edersin? How to handle alerts in selenium?
    -Alertler javascript ile olusur. Inspect  edilemezler. Oncelikle alerte swtich etmemiiz gerekir

     */
}
