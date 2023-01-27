package practice01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class P01 {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //-"sahibinden.com" adresine gidelim
        driver.get("https://www.amazon.com");
        //-bu web adresinin sayfa basligini(title) ve adres(url)ini yazdıralım
        String actualSayfaTittle = driver.getTitle();
        System.out.println(actualSayfaTittle);

        String actualUrl = driver.getCurrentUrl();
        System.out.println(actualUrl);

        //-title ve url'nin "Spend" kelimesinin icerip icermedigini kontrol edelim
        Assert.assertFalse(actualSayfaTittle.contains("Spend") && actualUrl.contains("Spend"));

        //-Ardindan "trendyol.com" adresine gidelim
        driver.get("https://www.trendyol.com");

        //-bu adresin basligini alalim ve "Sitesi" kelismesini icerip icermedigini kontrol edelim
        String trendyolTittle = driver.getTitle();
        Assert.assertTrue(trendyolTittle.contains("Sitesi"));

        //-Bi onceki web sayfamiza geri donelim
        driver.navigate().back();

        //-sayfayi yenileyelim
        driver.navigate().refresh();

        //-Daha sonra trendyol sayfamiza tekrar donelim ve sayfayi kapatalim
        driver.navigate().forward();
        driver.quit();
    }


}
