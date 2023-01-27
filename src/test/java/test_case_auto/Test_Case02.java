package test_case_auto;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Test_Case02 {
    WebDriver driver;

    @Before
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://automationexercise.com");
    }

    @Test
    public void test01() {
        //3. Ana sayfanın başarıyla göründüğünü doğrulayın
        WebElement sayfaGorunur = driver.findElement(By.xpath("//div[@class='logo pull-left']"));
        Assert.assertTrue(sayfaGorunur.isDisplayed());

        //4. 'Kaydol / Giriş Yap' düğmesine tıklayın
        driver.findElement(By.xpath("//a[@href='/login']")).click();

        //5. "Hesabınıza giriş yapın"ın göründüğünü doğrulayın
        WebElement loginGorunur = driver.findElement(By.xpath("//h2[text()='Login to your account']"));
        Assert.assertTrue(loginGorunur.isDisplayed());

        //6. Doğru e-posta adresini ve şifreyi girin
        driver.findElement(By.xpath("//input[@data-qa='login-email']")).sendKeys("ebrardur@ebrar.com");
        driver.findElement(By.xpath("//input[@data-qa='login-password']")).sendKeys("12345");

        //7. 'Giriş' düğmesine tıklayın
        driver.findElement(By.xpath("//button[@data-qa='login-button']")).click();

        //.8 "Kullanıcı adı olarak oturum açıldı" ifadesinin görünür olduğunu doğrulayın
        WebElement kullaniciGorundu = driver.findElement(By.xpath("//i[@class='fa fa-user']"));
        Assert.assertTrue(kullaniciGorundu.isDisplayed());

        //9. 'Hesabı Sil' düğmesini tıklayın
        driver.findElement(By.xpath("//i[@class='fa fa-trash-o']")).click();

        //10. 'HESAP SİLİNDİ!' görünür
        WebElement deleteGorunur = driver.findElement(By.xpath("//b[text()='Account Deleted!']"));
        Assert.assertTrue(deleteGorunur.isDisplayed());
    }
    @After
    public void tearDown(){
        driver.close();
    }
/*
1. Launch browser
2. Navigate to url 'http://automationexercise.com'
3. Verify that home page is visible successfully
4. Click on 'Signup / Login' button
5. Verify 'Login to your account' is visible
6. Enter correct email address and password
7. Click 'login' button
8. Verify that 'Logged in as username' is visible
9. Click 'Delete Account' button
10. Verify that 'ACCOUNT DELETED!' is visible
 */
}
