package day04_Maven;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.hc.core5.http.io.SessionOutputBuffer;
import org.openqa.selenium.By;
import org.openqa.selenium.ScreenOrientation;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Arrays;

public class Odev {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        //2- https://www.google.com/ adresine gidin
        driver.get("https://www.google.com/");

        //3- cookies uyarisini kabul ederek kapatin
        //4 Sayfa basliginin “Google” ifadesi icerdigini test edin
        WebElement baslik = driver.findElement(By.xpath("//img[@alt='Google']"));
        String actualResault = baslik.getAccessibleName();
        String expectedResault = "Google";
        if (expectedResault.equals(actualResault)) {
            System.out.println("Test PASSED");
        } else System.out.println("Test FAILED");

        //5 Arama cubuguna “Nutella” yazip aratin
        WebElement aramaCubugu = driver.findElement(By.xpath("//*[@class='gLFyf']"));
        aramaCubugu.sendKeys("Nutella");
        aramaCubugu.submit();

        //6 Bulunan sonuc sayisini yazdirin
String sonucY = driver.findElement(By.xpath("//div[@id='result-stats']")).getText();
        System.out.println(sonucY);

//        String a = sonucY.replaceAll("[\\D]","");
//        System.out.println(a);

        //7 sonuc sayisinin 10 milyon’dan fazla oldugunu test edin
        String arr[] = sonucY.split(" ");
        System.out.println(Arrays.toString(arr));
        System.out.println(arr[1]);

        int sayi = Integer.valueOf(arr[1]);
        System.out.println(sayi);


//        if (sayi>10000000){
//            System.out.println("Test PASSED");
//        }else System.out.println("Test FAILED");


        //8 Sayfayi kapatin
//        driver.close();
//        driver.quit();

        /*
        //        2- https://www.google.com/ adresine gidin
        driver.get("https://www.google.com/");
//        3- cookies uyarisini kabul ederek kapatin
//        4Sayfa basliginin "Google" ifadesi icerdigini test edin
        WebElement baslik = driver.findElement(By.xpath("//*[@class='lnXdpd']"));
        if (baslik.isDisplayed()) {
            System.out.println("Passed");
        } else System.out.println("Failed");

//        5Arama cubuguna "Nutella" yazip aratin
        driver.findElement(By.xpath("//*[@class='gLFyf']")).sendKeys("Nutella", Keys.ENTER);
//        6Bulunan sonuc sayisini yazdirin
        List<WebElement> sonucSayisi = driver.findElements(By.xpath("//*[@id='result-stats']"));
        for (WebElement w : sonucSayisi) {
            System.out.println(w.getText());
        }
//        7sonuc sayisinin 10 milyon'dan fazla oldugunu test edin
        String[] sonuc = sonucSayisi.get(0).getText().split(" ");
        System.out.println(sonuc[1]);
        String sonucReal = sonuc[1].toString();
        String sayi = sonucReal.replaceAll("\\p{Punct}", "");
        System.out.println("sayi =" + sayi);
        int num = Integer.valueOf(sayi);
        if (num > 10000000) {
            System.out.println("Passed");
        } else System.out.println("Failed");
         */
    }
}
