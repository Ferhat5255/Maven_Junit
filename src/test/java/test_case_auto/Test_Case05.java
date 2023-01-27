package test_case_auto;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Test_Case05 {
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
    public void test(){

        //1. Launch browser
        //2. Navigate to url 'http://automationexercise.com'
        //3. Verify that home page is visible successfully
       WebElement sayfaGorunur = driver.findElement(By.xpath("//img[@src='/static/images/home/logo.png']"));
        Assert.assertTrue(sayfaGorunur.isDisplayed());

        //4. Click on 'Signup / Login' button
        driver.findElement(By.xpath("//*[@class='fa fa-lock']")).click();

        //5. Verify 'New User Signup!' is visible
        WebElement newGorunur = driver.findElement(By.xpath("//h2[text()='New User Signup!']"));
        Assert.assertTrue(newGorunur.isDisplayed());


        //6. Enter name and already registered email address
        driver.findElement(By.xpath("//input[@data-qa='signup-name']")).sendKeys("durda",
                Keys.TAB, "durda@ebrar.com",Keys.TAB,Keys.ENTER);

        //7. Click 'Signup' button
        //8. Verify error 'Email Address already exist!' is visible
       WebElement existGorunur =  driver.findElement(By.xpath("//*[text()='Email Address already exist!']"));
       Assert.assertTrue(existGorunur.isDisplayed());



    }


}
