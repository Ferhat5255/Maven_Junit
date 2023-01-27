package aaa_homework;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.support.ui.Select;
import utilitis.TestBase;

public class xxxxxOdev05 extends TestBase {
    @Test
    public void test0dev05() {
/*
        //    Test01 :  1- amazon gidin
        driver.get("https://www.amazon.com");

//    Arama kutusunun solundaki dropdown menuyu handle edip listesini ekrana yazdırın
        WebElement ddn = driver.findElement(By.xpath("//*[@id='searchDropdownBox']"));
        Select select = new Select(ddn);
        List<WebElement> list1 = select.getOptions();
        for (WebElement w : list1) {
            System.out.println("w.getText() = " + w.getText());
        }


//    dropdown menude 28 eleman olduğunu doğrulayın
        Assert.assertEquals(28, list1.size());

//
//            Test02
//    dropdown menuden elektronik bölümü seçin
        select.selectByVisibleText("Electronics");

//    arama kutusuna iphone yazip aratin ve bulunan sonuç sayısını yazdırın
        WebElement aramaKutusu = driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']"));
        aramaKutusu.sendKeys("iphone", Keys.ENTER);

//    sonuc sayisi bildiren yazinin iphone icerdigini test edin
        WebElement sonucYazisi = driver.findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']"));
        String yazi = sonucYazisi.getText();
        Assert.assertTrue(yazi.contains("iphone"));

//    ikinci ürüne relative locater kullanarak tıklayin
        driver.findElement(By.xpath("(//*[@class='a-size-base-plus a-color-base a-text-normal'])[2]")).click();


//    ürünün title'ni ve fiyatını variable’a  assign edip ürünü sepete ekleyelim
        String urunTitle = driver.getTitle();
        System.out.println("urunTitle = " + urunTitle);

        String urunFiyati = driver.findElement(By.xpath("//*[@id='corePriceDisplay_desktop_feature_div']")).getText();
        System.out.println("urunFiyati = " + urunFiyati);

        driver.findElement(By.id("add-to-cart-button")).click();

//    Test03
*/

//    yeni bir sekme açarak amazon anasayfaya gidin
        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://www.amazon.com");

//    dropdown’dan bebek bölümüne secin
        WebElement ddn2 = driver.findElement(By.xpath("//*[@id='searchDropdownBox']"));
        Select select2 = new Select(ddn2);
        select2.selectByVisibleText("Baby");

//    bebek puset aratıp bulunan sonuç sayısını yazdırın
        WebElement aramaKutusu2 = driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']"));
        aramaKutusu2.sendKeys("baby puset", Keys.ENTER);

//    sonuç yazsının puset içerdiğini test edin
        WebElement sonucYazisi2 = driver.findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']"));
        String yazi2 = sonucYazisi2.getText();
        Assert.assertTrue(yazi2.contains("puset"));

//5-üçüncü ürüne relative locater kullanarak tıklayin
        WebElement ucUrun = driver.findElement(By.xpath("//font[contains(text(),'Fisher-Price Klasik Ksilofon, yürümeye başlayan ço')]"));
        ucUrun.click();


//6-title ve fiyat bilgilerini assign edelim ve ürünü sepete ekleyin

        String ucTitle = driver.getTitle();
        System.out.println("ucTitle = " + ucTitle);

        String ucUrunFiyat = driver.findElement(By.xpath("//body/div[@id='a-page']/div[@id='dp']/div[@id='dp-container']/div[@id='ppd']/div[@id='centerCol']/div[@id='apex_desktop']/div[@id='corePriceDisplay_desktop_feature_div']/div[1]/span[2]/span[2]/font[1]/span[2]/font[1]")).getText();
        System.out.println("ucUrunFiyat = " + ucUrunFiyat);
        driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();

// Test 4


//            1-sepetteki ürünlerle eklediğimiz ürünlerin aynı olduğunu isim ve fiyat olarak doğrulayın


    }
}