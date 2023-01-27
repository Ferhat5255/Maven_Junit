package z_Tekrar_lar;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utilitis.TestBase;

public class Dropdown_Handle extends TestBase {
    @Test
    public void test() {

        //1. http://zero.webappsecurity.com/ Adresine gidin
driver.get("http://zero.webappsecurity.com/");

        //2. Sign in butonuna basin
        driver.findElement(By.xpath("//button[@id='signin_button']")).click();

        //3. Login kutusuna “username” yazin
        driver.findElement(By.xpath("//input[@id='user_login']")).sendKeys("username",
                Keys.TAB,"password",Keys.TAB,Keys.TAB,Keys.ENTER);
driver.navigate().back();
        //4. Password kutusuna “password.” yazin
        //5. Sign in tusuna basin

        //6. Pay Bills sayfasina gidin
        driver.findElement(By.xpath("//strong[text()='Online Banking']")).click();;
        driver.findElement(By.xpath("//*[@id='pay_bills_link']")).click();

        //7. “Purchase Foreign Currency” tusuna basin
        driver.findElement(By.xpath("//*[text()='Purchase Foreign Currency']")).click();

        //8. “Currency” drop down menusunden Eurozone’u secin
        WebElement ddn = driver.findElement(By.xpath("//*[@id='pc_currency']"));
        Select option = new Select(ddn);
        option.selectByVisibleText("Eurozone (euro)");

        //9. “amount” kutusuna bir sayi girin
        driver.findElement(By.xpath("//input[@id='pc_amount']")).sendKeys("55");

        //10. “US Dollars” in secilmedigini test edin
        WebElement usDollars = driver.findElement(By.xpath("//input[@id='pc_inDollars_true']"));
        Assert.assertFalse(usDollars.isSelected());

        //11. “Selected currency” butonunu secin
        driver.findElement(By.xpath("//input[@id='pc_inDollars_false']")).click();

        //12. “Calculate Costs” butonuna basin sonra “purchase” butonuna basin
        driver.findElement(By.xpath("//input[@id='pc_calculate_costs']")).click();
        driver.findElement(By.xpath("//input[@id='purchase_cash']")).click();


        //13. “Foreign currency cash was successfully purchased.” yazisinin ciktigini kontrol edin.
WebElement yaziGorundu=driver.findElement(By.xpath("//div[@id='alert_content']"));
Assert.assertTrue(yaziGorundu.isDisplayed());

    }

}
