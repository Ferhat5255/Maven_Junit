package day13;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilitis.TestBase;

import java.time.Duration;

public class C02_TimeOutException extends TestBase {

    /*
    TimeOutException:  sure yetersiz oldugunda alinir
Explicit wait kullanildiginda, ve element bulunamadiginda alinir.
Explicit wait & yanlis locator-> timeout
Explicit wait & doğru locator & sure yeterli degil -> timeout
Explicit wait & dogru locator & sure yeterli & iframe var ->  time out
Solution:
-Sureyi arttirmak
-Farkli explicit kullanmak: wait visibilityOfElementLocated YERINE presenceOfElementLocated.
Yada javascript executor da ki waiter sayfa geçişlerini beklemek icin kullanabilirim
-Locatori tekrar kontrol etmek
-Frameworkunde hazir reusable method lar var
Bu durumda timeoutexception aldigimda hızlıca o metotlar yardımıyla problemi cozebiliyoruz
     */

    @Test
    public void timeOutExcepionTest() {

        //timeOutExcepion explicit wait kullandigimda ve locator bulunamadiginda alinir

        driver.get("https://www.techproeducation.com");

        //Explicit wait icin olusturdugumuz methodlardan birini kullanalim
        //Prametre 1 : beklemek istedigim element, parametre 2 : max sure
   //     waitForVisibility(By.xpath("//input[@type='searchH']"),15).    //org.openqa.selenium.TimeoutException:
  //              sendKeys("QA"+ Keys.ENTER);

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("YANLIS ID")));


    }
}
