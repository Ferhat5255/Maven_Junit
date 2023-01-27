package aaa_homework;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilitis.TestBase;

import java.util.List;

public class Odev01 extends TestBase {
    @Test
    public void test01() {


        //Bir class olusturun: IframeOdev
//https://the-internet.herokuapp.com/iframe  sitesine gidiniz
        driver.get("https://the-internet.herokuapp.com/iframe ");


//sayfadaki toplam iframe sayısını bulunuz.
        List<WebElement> list = driver.findElements(By.xpath("//iframe"));
        System.out.println("iframe sayisi : " + list.size());

//Sayfa basliginda 'Editor' yazını içerdiğini test edelim.

       String actualTitle = driver.findElement(By.xpath("//h3")).getText();
       Assert.assertTrue(actualTitle.contains("Editor"));

//Paragrafdaki yaziyi silelim
        driver.switchTo().frame(0);

//Sonrasinda paragrafa "iframein icindeyim" yazisini yazdıralım
        WebElement iframe_ic = driver.findElement(By.xpath("//*[@id='tinymce']"));
        iframe_ic.clear();
        iframe_ic.sendKeys("iframe'nin icindeyim");

//Alt kısımdaki yazının 'Elemental Selenium' yazisini içerdiğini test edelim
        driver.switchTo().defaultContent();
       String yazi =  driver.findElement(By.xpath("//*[text()='Elemental Selenium']")).getText();
       Assert.assertTrue(yazi.contains("Elemental Selenium"));

    }
}