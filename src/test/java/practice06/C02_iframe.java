package practice06;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilitis.TestBase;

public class C02_iframe extends TestBase {

    // ...Exercise 2...


    // https://the-internet.herokuapp.com/iframe sayfasina gidiniz
    // 'An iFrame containing the TinyMCE WYSIWYG Editor' basliginin erisilebilir oldugunu test edin ve konsolda yazdırın.
    // TextBox'a 'Merhaba Dunya' yazin.
    // TextBox'in altinda bulunan 'Elemental Selenium' linkinin gorunur oldugunu test edin ve konsolda yazdirin
    @Test
    public void test02() {
        // ...Exercise 2...


        // https://the-internet.herokuapp.com/iframe sayfasina gidiniz
        driver.get("https://the-internet.herokuapp.com/iframe");

        // 'An iFrame containing the TinyMCE WYSIWYG Editor' basliginin erisilebilir oldugunu test edin ve konsolda yazdırın.
        WebElement baslik = driver.findElement(By.xpath("//h3[text()='An iFrame containing the TinyMCE WYSIWYG Editor']"));
        Assert.assertTrue(baslik.isDisplayed());
        System.out.println("Baslik = " + baslik.getText());

        // TextBox'a 'Merhaba Dunya' yazin.
        WebElement iframe = driver.findElement(By.xpath("//iframe[@id='mce_0_ifr']"));
        driver.switchTo().frame(iframe);

        WebElement textBox = driver.findElement(By.xpath("//body[@id='tinymce']"));
        textBox.clear();
        textBox.sendKeys("Merhaba Dunya");

        // TextBox'in altinda bulunan 'Elemental Selenium' linkinin gorunur oldugunu test edin ve konsolda yazdirin
        driver.switchTo().parentFrame();
        WebElement elemental = driver.findElement(By.xpath("//a[text()='Elemental Selenium']"));
        Assert.assertTrue( elemental.isDisplayed());
        System.out.println("elemental yazisi = " + elemental.getText());


    }
}
