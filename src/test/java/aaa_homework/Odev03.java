package aaa_homework;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilitis.TestBase;

import java.util.List;

public class Odev03 extends TestBase {
    @Test
    public void iframeTest() {


        //    Bir class olusturun: IframeOdev
//    https://the-internet.herokuapp.com/iframe  sitesine gidiniz
        driver.get("https://the-internet.herokuapp.com/iframe");

//    sayfadaki toplam iframe sayısını bulunuz.
        List<WebElement> list = driver.findElements(By.xpath("//iframe"));
        System.out.println(list.size());

//    Sayfa basliginda ‘Editor’ yazını içerdiğini test edelim.
        String sayfabaslik = driver.findElement(By.xpath("//h3")).getText();
        Assert.assertTrue(sayfabaslik.contains("Editor"));

//    Paragrafdaki yaziyi silelim
        driver.switchTo().frame(0);
        WebElement ifrIci = driver.findElement(By.xpath("//*[@data-id='mce_0']"));
        ifrIci.clear();
//    Sonrasinda paragrafa “iframein icindeyim” yazisini yazdıralım
        ifrIci.sendKeys("iframein icindeyim");

//    Alt kısımdaki yazının ‘Elemental Selenium’ yazisini içerdiğini test edelim
        driver.switchTo().defaultContent();
        String actualYazi = driver.findElement(By.linkText("Elemental Selenium")).getText();
        Assert.assertTrue(actualYazi.contains("Elemental Selenium"));
    }
}