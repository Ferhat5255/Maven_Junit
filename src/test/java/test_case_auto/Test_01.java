package test_case_auto;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Test_01 {
    WebDriver driver;

    @Before
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://automationexercise.com/");
    }

    @After
    public void tearDown() throws InterruptedException {
        Thread.sleep(3000);
        //driver.close();
    }





@Test

    public void test09() {
    WebDriverManager.chromedriver().setup();
    driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

    driver.get("https://automationexercise.com/");

            WebElement sayfaGorunur = driver.findElement(By.xpath("//img[@src='/static/images/home/logo.png']"));
            Assert.assertTrue(sayfaGorunur.isDisplayed());

    driver.findElement(By.xpath("//i[@class='fa fa-lock']")).click();
    driver.findElement(By.xpath("//*[@data-qa='signup-name']")).sendKeys("durda");
    driver.findElement(By.xpath("//*[@data-qa='signup-email']")).sendKeys("durda@ebrar.com");
    driver.findElement(By.xpath("//*[@data-qa='signup-email']")).submit();

    WebElement hesapGorunur =  driver.findElement(By.xpath("(//h2[@class='title text-center'])[1]"));
    Assert.assertTrue(hesapGorunur.isDisplayed());

    driver.findElement(By.xpath("//div[@id='uniform-id_gender1']")).click();
    driver.findElement(By.xpath("//input[@id='password']")).sendKeys("12345");
    driver.findElement(By.xpath("//select[@id='days']")).sendKeys("5");
    driver.findElement(By.xpath("//select[@id='months']")).sendKeys("May");
    driver.findElement(By.xpath("//select[@id='years']")).sendKeys("1985");

    //10
    driver.findElement(By.xpath("//input[@id='newsletter']")).click();

    //11
    driver.findElement(By.xpath("//input[@id='optin']")).click();

    //12
    driver.findElement(By.xpath("//input[@id='first_name']")).sendKeys("ferhat");
    //
    driver.findElement(By.xpath("//input[@id='last_name']")).sendKeys("bay");
    //
    driver.findElement(By.xpath("//input[@id='company']")).sendKeys("TechPro");
    //
    driver.findElement(By.xpath("//input[@id='address1']")).sendKeys("ordu");
    //
    driver.findElement(By.xpath("//input[@id='address2']")).sendKeys("unye");
    //
    driver.findElement(By.xpath("//select[@id='country']")).sendKeys("Canada");
    //
    driver.findElement(By.xpath("//input[@id='state']")).sendKeys("baskent");
    //
    driver.findElement(By.xpath("//input[@id='city']")).sendKeys("bir sehir");
    //
    driver.findElement(By.xpath("//input[@id='zipcode']")).sendKeys("121345");
    //
    driver.findElement(By.xpath("//input[@id='mobile_number']")).sendKeys("0254525424");

    //13.
    driver.findElement(By.xpath("//button[@data-qa='create-account']")).click();
}
    //14===============================================================


//2. Navigate to url 'http://automationexercise.com'
//3. Verify that home page is visible successfully
//4. Click on 'Signup / Login' button
//5. Verify 'New User Signup!' is visible
//6. Enter name and email address
//7. Click 'Signup' button
//8. Verify that 'ENTER ACCOUNT INFORMATION' is visible
//9. Fill details: Title, Name, Email, Password, Date of birth
//10. Select checkbox 'Sign up for our newsletter!'
//11. Select checkbox 'Receive special offers from our partners!'
//12. Fill details: First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number
//13. Click 'Create Account button'
//14. Verify that 'ACCOUNT CREATED!' is visible
//15. Click 'Continue' button
//16. Verify that 'Logged in as username' is visible
//17. Click 'Delete Account' button
//18. Verify that 'ACCOUNT DELETED!' is visible and click 'Continue' button
}