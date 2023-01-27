package practice05;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import utilitis.TestBase;

public class P04 extends TestBase {
    @Test
    public void test04() throws InterruptedException {

//- https://html.com/tags/iframe/ adresine gidiniz
        driver.get("https://html.com/tags/iframe/ ");
        String ilkWindow = driver.getWindowHandle();


        //    - youtube videosunu çalıştırınız
        WebElement iframe = driver.findElement(By.xpath("(//iframe[@frameborder='0'])[1]"));
        driver.switchTo().frame(iframe);
        driver.findElement(By.xpath("//button[@aria-label='Oynat']")).click();

        //    - üç saniye çalıştıktan sonra sayfayı yenileyiniz
        Thread.sleep(3000);
        driver.navigate().refresh();

        //    - yeni sekmede amazon adresine gidiniz
        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://www.amazon.com");

        //    - iphone aratınız
        driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']")).sendKeys("iphone", Keys.ENTER);

        //    - arama sonucu olarak sadece sonuc sayısını yazdırınız
        String sonucYazisi = driver.findElement(By.xpath("(//div[@class='sg-col-inner'])[1]")).getText();
        String[] arr = sonucYazisi.split(" ");
        String sonucSayisi = arr[2];
        System.out.println("sonucSayisi = " + sonucSayisi);

        //    - ilk sekmeye geri dönüp url'ini konsola yazdıralım
        driver.switchTo().window(ilkWindow);
        String ilkWindowUrl = driver.getCurrentUrl();
        System.out.println("ilkWindowUrl = " + ilkWindowUrl);

        //    - ilk sekmeyi kapatalım
        driver.close();

        //    - Sonra diğer sekmeyide kapatalım

//TestBase deki @After metodu calisacak
    }
}
