package aaa_homework;

import com.beust.ah.A;
import org.bouncycastle.operator.AADProcessor;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilitis.TestBase;

public class Odev07 extends TestBase {
    @Test
    public void actionClass07() {

        //    Keyboard Base Actions
//            Homework
//    Yeni Class olusturun ActionsClassHomeWork
//1- "http://webdriveruniversity.com/Actions" sayfasina gidin
        driver.get("http://webdriveruniversity.com/Actions");

// 2- Hover over Me First" kutusunun ustune gelin
        Actions actions = new Actions(driver);
       WebElement firstButton = driver.findElement(By.xpath("//button[contains(text(),'Hover Over Me First!')]"));
       actions.moveToElement(firstButton).perform();

//    Link 1" e tiklayin
        driver.findElement(By.cssSelector("div.container div.col-lg-12.text-center:nth-child(4) div.thumbnail div.dropdown.hover:nth-child(1) div.dropdown-content > a.list-alert")).click();

//    Popup mesajini yazdirin
      String popMesaj =  driver.switchTo().alert().getText();
        System.out.println("popMesaj = " + popMesaj);

//    Popup'i tamam diyerek kapatin
        driver.switchTo().alert().accept();

//            “Click and hold" kutusuna basili tutun
        WebElement clickKutu = driver.findElement(By.xpath("//p[contains(text(),'Click and Hold!')]"));
        actions.clickAndHold(clickKutu).perform();

//            7-“Click and hold" kutusunda cikan yaziyi yazdirin
       String clickKutuYazi =  driver.findElement(By.xpath("//div[@id='click-box']")).getText();
        System.out.println("clickKutuYazi = " + clickKutuYazi);


//            8- “Double click me" butonunu cift tiklayin
       WebElement doubloClick =  driver.findElement(By.xpath("//h2[contains(text(),'Double Click Me!')]"));
       actions.doubleClick(doubloClick).perform();
    }
}