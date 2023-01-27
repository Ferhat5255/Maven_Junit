package z_Tekrar_lar;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WindowType;
import utilitis.TestBase;

import java.util.Set;

public class WindowHandle2 extends TestBase {
    @Test
    public void test02() throws InterruptedException {
        //● Tests package’inda yeni bir class olusturun: WindowHandle2
        //● https://the-internet.herokuapp.com/windows adresine gidin.
        driver.get("https://the-internet.herokuapp.com/windows");

        //● Sayfadaki textin “Opening a new window” olduğunu doğrulayın.
       String sayfaText =  driver.findElement(By.xpath("//h3")).getText();
        Assert.assertEquals("Opening a new window",sayfaText);
        String h1 = driver.getWindowHandle();

        //● Sayfa başlığının(title) “The Internet” olduğunu doğrulayın.
       String sayfaTitle =  driver.getTitle();
       Assert.assertEquals("The Internet",sayfaTitle);

        //● Click Here butonuna basın.
        driver.findElement(By.xpath("//*[text()='Click Here']")).click();

        //● Acilan yeni pencerenin sayfa başlığının (title) “New Window” oldugunu dogrulayin.
            Set<String>list = driver.getWindowHandles();
            for (String w : list){

            }

            String yeniTittle= driver.getTitle();
        System.out.println(yeniTittle);

        //● Sayfadaki textin “New Window” olduğunu doğrulayın.
        //● Bir önceki pencereye geri döndükten sonra sayfa başlığının “The Internet” olduğunu
        //doğrulayın.


    }
}
