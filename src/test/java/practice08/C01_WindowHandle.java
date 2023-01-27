package practice08;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import utilitis.TestBase;

public class C01_WindowHandle extends TestBase {
    @Test
    public void xxxtest() {


        // 1- https://www.amazon.com sayfasına gidin
        driver.get("https://www.amazon.com");
        String firstHandle = driver.getWindowHandle();

        // 2- nutella icin arama yapın
        driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"))
                .sendKeys("nutella",Keys.ENTER);

        // 3- yeni bir tab'da ilk urunun resmine tıklayınız
        driver.switchTo().newWindow(WindowType.TAB);

        driver.get("https://www.amazon.com");

        driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"))
                .sendKeys("nutella",Keys.ENTER);

        driver.findElement(By.xpath("(//img[@class='s-image'])[1]")).click();

        // 4- yeni tab'da acilan urunun basligini yazdirin
       String urunBaslik =  driver.findElement(By.xpath("//*[@id='productTitle']")).getText();
        System.out.println("urunBaslik = " + urunBaslik);

        // 5- ilk sayfaya gecip url'i yazdırın
        driver.switchTo().window(firstHandle);
        System.out.println("ilk sayfa Url = " + driver.getCurrentUrl());

    }
    @Test
    public void c01Test() {
        // 1- https://www.amazon.com sayfasına gidin
        driver.get("https://www.amazon.com");

        String ilkSayfa = driver.getWindowHandle();

        // 2- nutella icin arama yapın
        driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"))
                .sendKeys("Nutella", Keys.ENTER);

        // 3- yeni bir tab'da ilk urunun resmine tıklayınız
        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://www.amazon.com");
        driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"))
                .sendKeys("Nutella", Keys.ENTER);

        driver.findElement(By.xpath("(//span[@class='a-size-base-plus a-color-base a-text-normal'])[1]")).click();

        // 4- yeni tab'da acilan urunun basligini yazdirin
        WebElement baslik = driver.findElement(By.xpath("//span[@id='productTitle']"));
        String baslikStr = baslik.getText();
        System.out.println("baslik: " + baslikStr);

        // 5- ilk sayfaya gecip url'i yazdırın
        driver.switchTo().window(ilkSayfa);
        System.out.println("ilk syfa Url = " + driver.getCurrentUrl());
    }
}
