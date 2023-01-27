package aaa_homework;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilitis.TestBase;

public class XCan03 extends TestBase {
    @Test
    public void name() {


        //1. "http://webdriveruniversity.com/Actions" sayfasina gidin
        driver.get("http://webdriveruniversity.com/Actions");

        //2. "Hover over Me First" kutusunun ustune gelin
        WebElement hoverFirst = driver.findElement(By.xpath("//button[contains(text(),'Hover Over Me First!')]"));

        Actions actions = new Actions(driver);

        actions.moveToElement(hoverFirst).perform();

        waitFor(3);

        //3. "Link 1" e tiklayin
        driver.findElement(By.xpath("(//a[@class='list-alert'])[1]")).click();

        //4. Popup mesajini yazdirin
        String pouupMesaj = driver.switchTo().alert().getText();
        System.out.println(pouupMesaj);

        //5. Popup'i tamam diyerek kapatin
        driver.switchTo().alert().accept();

        //6. "Click and hold" kutusuna basili tutun
        WebElement clickKutu = driver.findElement(By.xpath("//p[contains(text(),'Click and Hold!')]"));

        actions.clickAndHold(clickKutu).perform();
        waitFor(3);

        //7. "Click and hold" kutusunda cikan yaziyi yazdirin
        WebElement kutuYazi = driver.findElement(By.xpath("//div[@id='click-box']"));
        String kutuYazisi = kutuYazi.getText();
        System.out.println("kutu yazi = " + kutuYazisi);

        //8. "Double click me" butonunu cift tiklayin
       WebElement doubl =  driver.findElement(By.xpath("//h2[text()='Double Click Me!']"));

       actions.doubleClick(doubl).perform();

        //9. "Double click me" butonunun renk değiştridiğini doğrulayın


    }
}