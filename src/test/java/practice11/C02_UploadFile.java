package practice11;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilitis.TestBase;

public class C02_UploadFile extends TestBase {
    //https://demo.guru99.com/test/upload/ adresine gidiniz
    //Bilgisayarınızdan herhangi bir dosyayı upload ediniz
    // I accept terms of service bölümünü tikleyin
    // Submit File buttonuna basınız
    // "1 file has been successfully uploaded" görünür olduğunu test edin


    @Test
    public void name() {
        //https://demo.guru99.com/test/upload/ adresine gidiniz
        driver.get("https://demo.guru99.com/test/upload/");

        //Bilgisayarınızdan herhangi bir dosyayı upload ediniz
        //"C:\Users\ferhat\Desktop\logo.jpeg.jpeg"

//       String anaYol = System.getProperty("user.home");//C:\Users\ferhat\
//        String ortakYol = "\\Desktop\\logo.jpeg.jpeg";
//        String dosyaYolu =anaYol+ortakYol;

        String dosyaYolu = "C:\\Users\\ferhat\\Desktop\\logo.jpeg.jpeg";

        WebElement dosyaSec = driver.findElement(By.xpath("//input[@id='uploadfile_0']"));
        dosyaSec.sendKeys(dosyaYolu);

        // I accept terms of service bölümünü tikleyin
        driver.findElement(By.xpath("//input[@id='terms']")).click();

        // Submit File buttonuna basınız
        driver.findElement(By.xpath("//button[@id='submitbutton']")).click();

        // "1 file has been successfully uploaded" görünür olduğunu test edin
      WebElement gorunur =   driver.findElement(By.xpath("//h3[@id='res']"));
        Assert.assertTrue(gorunur.isDisplayed());
    }
}
