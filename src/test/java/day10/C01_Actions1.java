package day10;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilitis.TestBase;

public class C01_Actions1 extends TestBase {

    @Test
    public void rightClick() {

        //Class: Actions1
        //Method: rightClick
        //https://the-internet.herokuapp.com/context_menu  sitesine gidin
        driver.get("https://the-internet.herokuapp.com/context_menu ");

        //1. ACTIONS OBJESI OLUSTUR
        Actions actions = new Actions(driver);

        //2. ELEMENTI LOCATE EDELIM
       WebElement kutu = driver.findElement(By.id("hot-spot"));

        //Kutuya sag tıklayın
        //Tum ACTIONS LAR actions OBJESIYLE BASLAR perform() ILE BITER.
        actions.contextClick(kutu).perform();

        //Alert’te cikan yazinin “You selected a context menu” oldugunu test edin
        String actualYazi = driver.switchTo().alert().getText();
        Assert.assertEquals("You selected a context menu",actualYazi);

        //Tamam diyerek alert’i kapatın
        driver.switchTo().alert().accept();


    }
}
