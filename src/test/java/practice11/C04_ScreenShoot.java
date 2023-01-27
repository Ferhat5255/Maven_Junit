package practice11;

import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.*;
import utilitis.TestBase;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class C04_ScreenShoot extends TestBase {
    //Amazon sayfasına gidelim
    //Tüm sayfanın resmini alalım
    //Yeni bir sekmede techproeducation sayfasına gidip sayfanın resmini alalım
    //Tekrar amazon sayfasına dönüp iphone aratalım
    //Arama sonucunun resmini alalım


    @Test
    public void name() throws IOException {
        //Amazon sayfasına gidelim
        driver.get("https://www.amazon.com");

        //Tüm sayfanın resmini alalım
        String tarih = new SimpleDateFormat("hh_mm_ss_ddMMyyyy").format(new Date());
        TakesScreenshot ts = (TakesScreenshot) driver;
        FileUtils.copyFile(ts.getScreenshotAs(OutputType.FILE),new File("target/tumSayfaResmi/tumSayfa"+tarih+".jpeg"));

        /*
        FILEUTILS CLASS'I, FILE NESNELERI ILE BIRLIKTE KULLANABILECEGIMIZ METHODLAR ICERIR.
        BU METHODLARI KULLANARAK DOSYALARDA OKUMA , YAZMA VE KOPYALAMA ISLEMLERINI COK DAHA KOLAY YAPABILIRIZ.
                 */

        //Yeni bir sekmede techproeducation sayfasına gidip sayfanın resmini alalım
      driver.switchTo().newWindow(WindowType.TAB);
      driver.get("https://www.techproeducation.com");
      takeScreenShotOfPage();


        //Tekrar amazon sayfasına dönüp iphone aratalım
        List<String> sayfalar = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(sayfalar.get(0));

        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone", Keys.ENTER);


        //Arama sonucunun resmini alalım

      WebElement aramasonucu =   driver.findElement(By.xpath("(//div[@class='a-section a-spacing-small a-spacing-top-small'])[1]"));
        takeScreenshotOfElement(aramasonucu);
    }
}
