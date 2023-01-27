package day10;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilitis.TestBase;

public class C02_Actions2 extends TestBase {
    @Test
    public void hoverOverTest() {
        /*
        MANUAL:
        1. Amazon home sayfasina git
        2. Account & list e uzerinde bekle    - mouse over - hover over
        3.Acilan pencerede Account linkine tIkla
        4.Acilan sayfanin Title inin, Your Account oldugunu dogrula
                */
        driver.get("https://www.amazon.com");

        //2. Account & list e uzerinde bekle    - mouse over - hover over

        //1.Adim ACTIONS OBJESI
        Actions actions = new Actions(driver);

        //2.ELEMAN BUL
        WebElement accountList = driver.findElement(By.id("nav-link-accountList"));
        waitFor(1);

//        3. UYGUN ACTIONS METHODUNU KULLAN. EN SONRA PERFORM KULLANMAYI UNUTMA
        actions.moveToElement(accountList).perform();
        waitFor(3);

        // 3.Acilan pencerede Account linkine tIkla
        driver.findElement(By.linkText("Account")).click();

        //4.Acilan sayfanin Title inin, Your Account oldugunu dogrula
        Assert.assertTrue(driver.getTitle().contains("Your Account"));
    }
}
