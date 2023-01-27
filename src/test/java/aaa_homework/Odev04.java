package aaa_homework;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import utilitis.TestBase;

public class Odev04 extends TestBase {
    @Test
    public void test04() {


//    https://testcenter.techproeducation.com/index.php?page=multiple-windows
        driver.get("https://testcenter.techproeducation.com/index.php?page=multiple-windows");

//    Title'in "Windows" oldugunu test edin
        Assert.assertEquals("Windows", driver.getTitle());

//    Click here a tiklayin
        driver.findElement(By.linkText("Click Here")).click();

//    Sonra acilan sayfadaki title in "New Window" oldugunu dogrulayin
        switchToWindow(1);
        Assert.assertEquals("New Window", driver.getTitle());

    }
}