package practice07;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilitis.TestBase;

public class P05_Actions extends TestBase {
    /*
    - http://szimek.github.io/signature_pad/ sayfasına gidiniz
    - Çıkan ekrana istediğiniz çizgi yada şekli çiziniz
    - Cizimden sonra clear butonuna basalim
    - Son olarak sayfayı temizleyiniz
     */

    @Test
    public void name() {
//        - http://szimek.github.io/signature_pad/ sayfasına gidiniz
        driver.get("http://szimek.github.io/signature_pad/");

//        - Çıkan ekrana istediğiniz çizgi yada şekli çiziniz
        WebElement yaziTahtasi = driver.findElement(By.xpath("//canvas"));
        Actions actions = new Actions(driver);

        actions.moveToElement(yaziTahtasi).clickAndHold();


        for (int i = 0; i < 10; i++) {
            actions.moveByOffset(5,5);
        }
        for (int i = 0; i < 10; i++) {
            actions.moveByOffset(0,5);
        }
        for (int i = 0; i < 10; i++) {
            actions.moveByOffset(5,0);
        }
        actions.release().build().perform();

        waitFor(3);

//        - Cizimden sonra clear butonuna basalim
        driver.findElement(By.xpath("//*[text()='Clear']")).click();

//        - Son olarak sayfayı temizleyiniz




    }
}
