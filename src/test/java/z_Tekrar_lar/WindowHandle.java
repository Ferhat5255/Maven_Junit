package z_Tekrar_lar;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WindowType;
import utilitis.TestBase;

public class WindowHandle extends TestBase {
    @Test
    public void test() {
        //● Amazon anasayfa adresine gidin.
        driver.get("https://www.amazon.com");

        //● Sayfa’nin window handle degerini String bir degiskene atayin
        String anaSayfaHandle = driver.getWindowHandle();
        System.out.println(anaSayfaHandle);

        //● Sayfa title’nin “Amazon” icerdigini test edin
        String anaTittle = driver.getTitle();
        Assert.assertTrue(anaTittle.contains("Amazon"));

        //● Yeni bir tab olusturup, acilan tab’da techproeducation.com adresine gidin
        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://techproeducation.com/");

        //● Sayfa title’nin “TECHPROEDUCATION” icerdigini test edin
        String techTittle = driver.getTitle();
        Assert.assertFalse(techTittle.contains("TECHPROEDUCATION"));

        //● Yeni bir window olusturup, acilan sayfada walmart.com adresine gidin
        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.get("https://www.walmart.com");

        //● Sayfa title’nin “Walmart” icerdigini test edin
        String wolTitle = driver.getTitle();
        Assert.assertTrue(wolTitle.contains("Walmart"));

        //● Ilk acilan sayfaya donun ve amazon sayfasina dondugunuzu test edin
        driver.switchTo().window(anaSayfaHandle);
        String actualUrl = driver.getCurrentUrl();
        String expectedUrl = "https://www.amazon.com";
        Assert.assertEquals(expectedUrl,actualUrl);
        driver.navigate().refresh();


    }
}
