package practice01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class P08 {


    WebDriver driver;
    @Before
    public void setUp() throws Exception {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

    }

    @Test
    public void test01() {
        //       https://www.google.com/ adresine gidin
        driver.get("https://www.google.com/");

        //       cookies uyarisini kabul ederek kapatin
        //       Sayfa basliginin “Google” ifadesi icerdigini test edin
        String actualTittle = driver.getTitle();
        String expectedTittle = "Google";
        Assert.assertTrue(actualTittle.contains(expectedTittle));

        //       Arama cubuguna “Nutella” yazip aratin
        driver.findElement(By.xpath("//*[@class='gLFyf']")).sendKeys("Nutella"+ Keys.ENTER);

        //       Bulunan sonuc sayisini yazdirin
      String[] sonucSayisi =  driver.findElement(By.xpath("//*[@id='result-stats']")).getText().split(" ");
      String sonuc = sonucSayisi[1];
        System.out.println("sonucSayisi= " + sonucSayisi[1]);

        //       sonuc sayisinin 10 milyon’dan fazla oldugunu test edin
        sonuc =sonuc.replaceAll("\\D","");
        int actualSayi = Integer.parseInt(sonuc);
        int istenenSayi = 10000000;

        Assert.assertTrue(actualSayi>istenenSayi);

        //       Sayfayi kapatin
        driver.close();
    }
}
