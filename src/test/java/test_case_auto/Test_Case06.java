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

public class Test_Case06 {
    WebDriver driver;
    @Before
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));


    }

    @Test
    public void test06(){


        //1. Launch browser
        //2. Navigate to url 'http://automationexercise.com'
        driver.navigate().to("http://automationexercise.com");

        //3. Verify that home page is visible successfully
       WebElement saydaGorunur = driver.findElement(By.xpath("//*[@class='fa fa-home']"));
        Assert.assertTrue(saydaGorunur.isDisplayed());

        //4. Click on 'Contact Us' button
        driver.findElement(By.xpath("//*[@class='fa fa-envelope']")).click();

        //5. Verify 'GET IN TOUCH' is visible
        WebElement getGorunur = driver.findElement(By.xpath("(//h2[@class='title text-center'])[1]"));
        Assert.assertTrue(getGorunur.isDisplayed());

        //6. Enter name, email, subject and message
        driver.findElement(By.xpath("//input[@name='name']"))
                .sendKeys("fer", Keys.TAB,"by@by.com",Keys.TAB,"konu",Keys.TAB,"mesajim");

        //7. Upload file
WebElement dosya = driver.findElement(By.xpath("//input[@name='upload_file']"));

dosya.sendKeys("C:\\Users\\ferhat\\Desktop");

        //8. Click 'Submit' button
        driver.findElement(By.xpath("//input[@data-qa='submit-button']")).click();

        //9. Click OK button
        driver.switchTo().alert().accept();

        //10. Verify success message 'Success! Your details have been submitted successfully.' is visible
       WebElement gorunur =  driver.findElement(By.xpath("//div[@class='status alert alert-success']"));
        Assert.assertTrue(gorunur.isDisplayed());

        //11. Click 'Home' button and verify that landed to home page successfully
        driver.findElement(By.xpath("//*[@class='fa fa-home']")).click();
        WebElement saydaGorunur1 = driver.findElement(By.xpath("//*[@class='fa fa-home']"));
        Assert.assertTrue(saydaGorunur1.isDisplayed());


    }

















}
