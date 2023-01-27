package z_Tekrar_lar;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilitis.TestBase;

import java.util.List;

public class Iframe_Test02 extends TestBase {
    @Test
    public void test() {
        //) 1)  http://demo.guru99.com/test/guru99home/ sitesine gidiniz
        driver.get("http://demo.guru99.com/test/guru99home/");

        //2) sayfadaki iframe sayısını bulunuz.
        driver.findElements(By.tagName("iframe"));
        List<WebElement> list =driver.findElements(By.xpath("//iframe"));
        System.out.println("iframe sayisi : " + list.size());

        //3) ilk iframe'deki (Youtube) play butonuna tıklayınız.
        driver.switchTo().frame(0);
        driver.findElement(By.xpath("//*[@aria-label='Oynat']"));


        //4) ilk iframe'den çıkıp ana sayfaya dönünüz
       driver.switchTo().defaultContent();

        //5) ikinci iframe'deki (Jmeter Made Easy) linke (https://www.guru99.com/live-selenium-project.html)
        //tıklayınız
        driver.switchTo().frame("1");
        driver.findElement(By.xpath("//img[@src='Jmeter720.png']")).click();



    }
}
