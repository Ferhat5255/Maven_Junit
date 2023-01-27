package z_Tekrar_lar;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import utilitis.TestBase;

public class AmazonSearchTest extends TestBase {
    @Test
    public void test() {
        //a. wep sayfasina gidin. htttps://www.amazon.com/
        driver.get("https://www.amazon.com/");

        //b. Search(ara) "city bike"
        driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("city bike", Keys.ENTER);

        //c. Amazon da goruntulenen ilgili sonuclarin sayisini yazdirin
        String sonucYazisi = driver.findElement(By.xpath("(//div[@class='a-section a-spacing-small a-spacing-top-small'])[1]")).getText();
        System.out.println("sonucYazisi = " + sonucYazisi);
        String arr[] = sonucYazisi.split(" ");
        System.out.println("arr[2] = " + arr[2]);

        // d. Sonra karsiniza cikan ilk sonucun resmine tiklayin.
        driver.findElement(By.xpath("(//a[@class='a-link-normal s-no-outline'])[1]")).click();


    }
}
