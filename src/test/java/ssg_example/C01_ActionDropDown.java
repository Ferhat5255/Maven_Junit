package ssg_example;


import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import utilitis.TestBase;

import java.util.List;

public class C01_ActionDropDown extends TestBase {
    // Exercise 1...

    // https://www.amazon.com/ sayfasina gidin
    // sag ust bolumde bulunan dil menusunun acilmasi icin mause'u bu menunun ustune getirelim
    // Change butonuna basiniz
    // DropDown'dan Visible Text kullanarak 'TRY - Turkish Lira' optionunu secin ve yazdırın
    // Tüm option'ları yazdırın
    // dropdown'daki tum optionlarin toplam sayısının 68'ye esit oldugunu test edin
    // Save Changes butonuna basınız
    // arama motoruna 'Kitap' yazip aratin
    // ilk cikan urunun parabiriminin 'TRY' oldugunu test edin


    @Test
    public void test01() {

        // Exercise 1...

        // https://www.amazon.com/ sayfasina gidin
        driver.get("https://www.amazon.com/");

        // sag ust bolumde bulunan dil menusunun acilmasi icin mause'u bu menunun ustune getirelim
        Actions action = new Actions(driver);

       WebElement dilMenusu =  driver.findElement(By.xpath("//*[@id='icp-nav-flyout']"));
       action.moveToElement(dilMenusu).perform();


        // Change butonuna basiniz
        driver.findElement(By.xpath("(//*[text()='Change'])[1]")).click();

        // DropDown'dan Visible Text kullanarak 'TRY - Turkish Lira' optionunu secin ve yazdırın
        WebElement ddm = driver.findElement(By.xpath("//select[@id='icp-currency-dropdown']"));
        Select select =new Select(ddm);

        select.selectByVisibleText("TRY - Turkish Lira");

        waitFor(3);

        // Tüm option'ları yazdırın
        List<WebElement> tumOptionlar = select.getOptions();

        for (WebElement each : tumOptionlar){
            System.out.println(each.getText());
        }


        // dropdown'daki tum optionlarin toplam sayısının 68'ye esit oldugunu test edin
        Assert.assertEquals(68,tumOptionlar.size());

        // Save Changes butonuna basınız
        driver.findElement(By.xpath("//span[@id='icp-save-button']")).click();
        waitFor(3);

        // arama motoruna 'Kitap' yazip aratin
        driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Kitap" + Keys.ENTER);

        // ilk cikan urunun parabiriminin 'TRY' oldugunu test edin
        String PARA = driver.findElement(By.xpath("(//span[text()='TRY'])[1]")).getText();
        Assert.assertTrue(PARA.contains("TRY"));


    }
}
