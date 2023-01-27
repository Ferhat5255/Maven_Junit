package z_Tekrar_lar;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilitis.TestBase;

public class Assertions_YouTube extends TestBase {
    @Test
    public void test() {
        //1) Bir class oluşturun: YoutubeAssertions
        //2) https://www.youtube.com adresine gidin
        driver.get("https://www.youtube.com");

        //3) Aşağıdaki adları kullanarak 3 test metodu oluşturun ve gerekli testleri yapin
        //○ titleTest
        //○ imageTest
        //=> Sayfa başlığının “YouTube” oldugunu test edin
            String actualTittle = driver.getTitle();
        Assert.assertEquals("YouTube", actualTittle);

        //=> YouTube resminin görüntülendiğini (isDisplayed()) test edin
        WebElement sayfaGorunur = driver.findElement(By.xpath("(//*[@id='logo-icon'])[1]"));
        Assert.assertTrue(sayfaGorunur.isDisplayed());

        //○ Search Box 'in erisilebilir oldugunu test edin (isEnabled())
        WebElement searchBox = driver.findElement(By.xpath("(//*[@id='search-input'])[1]"));
        Assert.assertTrue(searchBox.isEnabled());

        //○ wrongTitleTest => Sayfa basliginin “youtube” olmadigini dogrulayin
        String aTittle = driver.getTitle();
        Assert.assertFalse(aTittle.equals("youtube"));


    }
}
