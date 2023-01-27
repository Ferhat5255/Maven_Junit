package z_Tekrar_lar;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilitis.TestBase;

public class C01_TekrarTesti extends TestBase {
    @Test
    public void test() {

        //Tekrar Testi
        //1-C01_TekrarTesti isimli bir class olusturun
        //2- https://www.amazon.com/ adresine gidin
        driver.get("https://www.amazon.com/");

        //3- Browseri tam sayfa yapin
        //4- Sayfayi “refresh” yapin
        driver.navigate().refresh();

        //5 Sayfa basliginin “Spend less” ifadesi icerdigini test edin
       String actualTittle = driver.getTitle();
        Assert.assertTrue(actualTittle.contains("Spend less"));

        //6 Gift Cards sekmesine basin
driver.findElement(By.xpath("//a[@data-csa-c-content-id='nav_cs_gc']")).click();

        //7 Birthday butonuna basin
        driver.findElement(By.xpath("(//img[@alt='Birthday'])[1]")).click();

        //8 Best Seller bolumunden ilk urunu tiklayin
        driver.findElement(By.xpath("(//img[@alt='Amazon.com eGift Card'])[1]")).click();

        //9- Gift card details’den 25 $’i secin
        driver.findElement(By.xpath("//button[@value='25']")).click();

        //10-Urun ucretinin 25$ oldugunu test edin
       String actualUcret = driver.findElement(By.xpath("//p[@id='gc-buy-box-text']")).getText();
        //System.out.println(actualUcret);
       Assert.assertTrue(actualUcret.contains("25"));

        //10-Sayfayi kapatin

    }
}
