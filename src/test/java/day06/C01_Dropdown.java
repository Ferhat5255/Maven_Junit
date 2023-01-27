package day06;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;

public class C01_Dropdown {
    WebDriver driver;

    @Before
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }

    @Test
    public void selectByIndexTest() {
//        Given kullanici https://testcenter.techproeducation.com/index.php?page=dropdown sayfasindayken
        driver.get("https://testcenter.techproeducation.com/index.php?page=dropdown");

//        Dogun yilini, ayini, ve gununu su sekilde secer : 2000, January, 10
        //1.Adim LOCATEdropdown element
        WebElement year = driver.findElement(By.xpath("//select[@id='year']"));
        //2.Adim Select objesi olustur
        Select yearDropdown = new Select(year);
        //3.Adim Select object i kullanarak 3 farkli sekilde secim yapabilirim
        yearDropdown.selectByIndex(22);  //Secenek Sirasi 0 sifir'dan baslar

        //Ay secimi
        WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
        Select monthDropdown = new Select(month);
        monthDropdown.selectByValue("0");   //option  in value degeri ile secim yapilabilir. January

        //Gun Secimi  selectByVisibleTest
        WebElement day = driver.findElement(By.xpath("//select[@id='day']"));
        Select dayDropdown = new Select(day);
        dayDropdown.selectByVisibleText("10");

    }

    @Test               //Tum eyalet isimlerini kosola yazdiralim
    public void printAllTest() {
        driver.get("https://testcenter.techproeducation.com/index.php?page=dropdown");

        WebElement state = driver.findElement(By.xpath("//select[@id='state']"));
        Select stateDropdown = new Select(state);
        List<WebElement> stateList = stateDropdown.getOptions();
        for (WebElement eachState : stateList) {
            System.out.println(eachState.getText());
        }
        //   stateList.stream().forEach(t->System.out.println(t.getText()));
    }

    @Test
    public void getSelectedOptionsTest(){
        driver.get("https://testcenter.techproeducation.com/index.php?page=dropdown");
//  State dropdown'indaki varsayilan secili secenegin 'Select a State' oldugunu verify edelim
        WebElement state = driver.findElement(By.xpath("//select[@id='state']"));
        Select stateDropdown = new Select(state);
        String varsayilanText = stateDropdown.getFirstSelectedOption().getText();
        Assert.assertEquals("Select a State",varsayilanText);
    }
    @After
    public void tearDown()  {
        driver.close();
    }

/*
        1. What is dropdown? Dropdown nedir?
        Dropdown liste olusturmak icin kullanilir.

        2. How to handle dropdown elements? Dropdown nasil automate edilir?
            -dropdown i locate ederim
            -select objesi olustururum
            -select objesi ile istedigim secenegi secerim
            NOT: select objesi olusturma nedenim, dropdownlarin Select classi ile olusturulmasi

         3. Tum dropdown seceneklerini nasil print ederiz?
            -tum dropdown elementlerini getOptions() methodu ile listeye koyariz
            -sonra secenekleri loop ile yazdirabiliriz

            4. Bir secenegin secili oldugunu otomate etmek icin ne yapilir?
            Ornek: Gun olarak 10 i sectik ama ya secilmediyse?
            getFirstSelectedOption() secili olan secenegi return eder
        */


}
