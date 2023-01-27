package z_Tekrar_lar;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utilitis.TestBase;

import java.util.List;

public class DropDown_Amazon extends TestBase {

    @Test
    public void test() {
        // https://www.amazon.com/ adresine gidin.
        driver.get("https://www.amazon.com/");
        //- Test 1
        //Arama kutusunun yanindaki kategori menusundeki kategori sayisinin 28
        //oldugunu test edin
        WebElement ddn = driver.findElement(By.xpath("//*[@id='searchDropdownBox']"));
        Select option = new Select(ddn);
        List<WebElement> l = option.getOptions();

        for (WebElement w : l) {
            System.out.println(w.getText());
        }
     System.out.println(l.size());
   Assert.assertTrue(l.size()==28);


        //-Test 2
        //1. Kategori menusunden Books secenegini secin
        option.selectByVisibleText("Books");

        //2. Arama kutusuna Java yazin ve aratin
        driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']")).sendKeys("Java", Keys.ENTER);

        //3. Bulunan sonuc sayisini yazdirin
String sonucYazisi = driver.findElement(By.xpath("(//div[@class='a-section a-spacing-small a-spacing-top-small'])[1]")).getText();
        System.out.println("sonucYazisi = " + sonucYazisi);

        //4. Sonucun Java kelimesini icerdigini test edin
Assert.assertTrue(sonucYazisi.contains("Java"));



    }
}
