package z_Tekrar_lar;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import utilitis.TestBase;


public class Maven_Soru3 extends TestBase {
    @Test
    public void test() {
        //1. “https://www.saucedemo.com” Adresine gidin
        driver.get("https://www.saucedemo.com");

        //2. Username kutusuna “standard_user” yazdirin
        driver.findElement(By.id("user-name")).sendKeys("performance_glitch_user",
                Keys.TAB,"secret_sauce",    //3. Password kutusuna “secret_sauce” yazdirin
                Keys.ENTER);     //4. Login tusuna basin

        //5. Ilk urunun ismini kaydedin ve bu urunun sayfasina gidin
        driver.findElement(By.xpath("//div[text()='Sauce Labs Backpack']")).click();

        //6. Add to Cart butonuna basin
        driver.findElement(By.id("add-to-cart-sauce-labs-fleece-jacket")).click();

        //7. Alisveris sepetine tiklayin
        driver.findElement(By.id("shopping_cart_container"));

        //8. Sectiginiz urunun basarili olarak sepete eklendigini control edin
       WebElement eklendi = driver.findElement(By.id("remove-sauce-labs-backpack"));
        Assert.assertTrue(eklendi.isDisplayed());

        //9. Sayfayi kapatin

    }
}
