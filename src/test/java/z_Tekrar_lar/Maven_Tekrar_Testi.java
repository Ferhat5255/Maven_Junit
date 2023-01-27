package z_Tekrar_lar;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import utilitis.TestBase;

import java.util.Arrays;

public class Maven_Tekrar_Testi extends TestBase {

    @Test
    public void test() {
        //1- C01_TekrarTesti isimli bir class olusturun
        //2- https://www.google.com/ adresine gidin
        driver.get("https://www.google.com/");

        //3- cookies uyarisini kabul ederek kapatin
        //4 Sayfa basliginin “Google” ifadesi icerdigini test edin
        String actualTittle = driver.getTitle();
        Assert.assertTrue(actualTittle.contains("Google"));

        //5 Arama cubuguna “Nutella” yazip aratin
        driver.findElement(By.xpath("//input[@class='gLFyf']")).sendKeys("Nutella", Keys.ENTER);

        //6 Bulunan sonuc sayisini yazdirin
       String sonucYazisi =  driver.findElement(By.xpath("//*[@id='result-stats']")).getText();
        System.out.println("sonucYazisi = "+sonucYazisi);

        //7 sonuc sayisinin 10 milyon’dan fazla oldugunu test edin
        String[] arr = sonucYazisi.split(" ");
        String k = arr[1].replaceAll("\\D", "");
        int sonucSayisi = Integer.parseInt(k);
       Assert.assertTrue(sonucSayisi>10000000);
        //8 Sayfayi kapatin
    }
}
