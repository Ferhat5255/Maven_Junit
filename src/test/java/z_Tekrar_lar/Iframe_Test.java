package z_Tekrar_lar;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilitis.TestBase;

public class Iframe_Test extends TestBase {

    @Test
    public void test() throws InterruptedException {

        iframeTest();

    }


    private void iframeTest() throws InterruptedException {
        //● https://the-internet.herokuapp.com/iframe adresine gidin.
        driver.get("https://the-internet.herokuapp.com/iframe");

        //● Bir metod olusturun: iframeTest
        //○ “An IFrame containing….” textinin erisilebilir oldugunu test edin ve konsolda yazdirin.
       WebElement sayfaEris = driver.findElement(By.xpath("//h3"));
        Assert.assertTrue(sayfaEris.isEnabled());

        //○Text Box’a “Merhaba Dunya!” yazin.
        driver.switchTo().frame("mce_0_ifr");
        driver.findElement(By.xpath("//*[@id='tinymce']")).sendKeys("Merhaba Dunya");
Thread.sleep(3000);

        //○TextBox’in altinda bulunan “Elemental Selenium” linkini textinin gorunur oldugunu
        //dogrulayin ve konsolda yazdirin
        driver.switchTo().parentFrame();
        WebElement textBox = driver.findElement(By.linkText("Elemental Selenium"));
        Assert.assertTrue(textBox.isDisplayed());
        String textYaz = textBox.getText();
        System.out.println(textYaz);

    }
}
