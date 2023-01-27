package aaa_homework;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import utilitis.TestBase;

import java.util.Set;

public class Odev02 extends TestBase {
    @Test
    public void test01() {
        //https://testcenter.techproeducation.com/index.php?page=multiple-windows
        driver.get("https://testcenter.techproeducation.com/index.php?page=multiple-windows");
        String w1 = driver.getWindowHandle();
        System.out.println(w1);

        //Title in ‘Windows’ oldugunu test edin
        String actualTitle = driver.getTitle();
        String expectedTitle = "Windows";
        Assert.assertEquals(expectedTitle,actualTitle);


        //Click here a tiklayin
        driver.findElement(By.xpath("//*[text()='Click Here']")).click();
       Set<String> handls = driver.getWindowHandles();

       for (String w : handls){
           if (!w.equals(w1)){
               driver.switchTo().window(w);
               break;
           }
       }

        //Sonra açılan sayfadaki title in ‘New Window’ oldugunu dogrulayin
       String yeniactualTitle = driver.getTitle();
       String expectedTitle2 = "New Window";
       Assert.assertEquals(yeniactualTitle,expectedTitle2);


    }
}