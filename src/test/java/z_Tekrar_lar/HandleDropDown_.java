package z_Tekrar_lar;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utilitis.TestBase;

import java.util.List;

public class HandleDropDown_ extends TestBase {
    @org.junit.Test
    public void tst() {


// https://www.amazon.com/ adresine gidin.
        driver.get("https://www.amazon.com");
//- Test 1
//Arama kutusunun yanindaki kategori menusundeki kategori sayisinin 45
//oldugunu test edin
      WebElement ddn = driver.findElement(By.xpath("//*[@id='searchDropdownBox']"));
        Select select = new Select(ddn);
      List<WebElement> list =   select.getOptions();
        System.out.println("drop sayisi : " + list.size());
        Assert.assertEquals(28, list.size());


//-Test 2
//1. Kategori menusunden Books secenegini secin
        select.selectByVisibleText("Books");

//2. Arama kutusuna Java yazin ve aratin
        driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']")).sendKeys("Java", Keys.ENTER);

//3. Bulunan sonuc sayisini yazdirin
      String sonucYazisi =   driver.findElement(By.xpath("(//div[@class='a-section a-spacing-small a-spacing-top-small'])[1]")).getText();
        System.out.println("sonucYazisi = " + sonucYazisi);
        String sonucSayisi[] = sonucYazisi.split(" ");
        System.out.println("sonucSayisi[3] = " + sonucSayisi[3]);

//4. Sonucun Java kelimesini icerdigini test edin
        Assert.assertTrue(sonucYazisi.contains("Java"));


    }
}
