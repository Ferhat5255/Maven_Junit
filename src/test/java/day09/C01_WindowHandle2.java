package day09;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import utilitis.TestBase;

public class C01_WindowHandle2 extends TestBase {
    @Test
    public void windowHandleTest() throws InterruptedException {

        driver.get("https://the-internet.herokuapp.com/windows");

//        https://the-internet.herokuapp.com/windows adresine gidin.
        driver.get("https://the-internet.herokuapp.com/windows");

//        Sayfadaki textin “Opening a new window” olduğunu doğrulayın.
        String actualWindow1Text = driver.findElement(By.xpath("//h3")).getText();
        String expectedWindow1Text ="Opening a new window";
        Assert.assertEquals(expectedWindow1Text, actualWindow1Text);

//        Sayfa başlığının(title) “The Internet” olduğunu doğrulayın.
        String actual1Title = driver.getTitle();
        String expected1Title ="The Internet";
        Assert.assertEquals(expected1Title, actual1Title);

        String window1Handle = driver.getWindowHandle();

//        Click Here butonuna basın.
        driver.findElement(By.linkText("Click Here")).click();

        waitFor(3);


        //IKINCI PENCERE ACILIR Ve IKINCI PENCEREDE ISLEM YAPMAK ISTEDIGIMDEN, O PENCEREYE SWITCH-GECIS-YAPMALIYIZ

        switchToWindow(1);   //2.windowa gecis yaptik. driver artik 2. window da

        //        Acilan yeni pencerenin sayfa başlığının (title) “New Window” oldugunu dogrulayin.
        String actualWindow2Title = driver.getTitle();
        String expectedWindow2Title = "New Window";
        Assert.assertEquals(expectedWindow2Title, actualWindow2Title);

    }
}
