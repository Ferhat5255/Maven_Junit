package day17;
import org.junit.Test;
import org.openqa.selenium.By;
import utilitis.TestBase;

public class C03_JSExecutor_Type extends TestBase {
    @Test
    public void typeTest(){
        //    Techpro education ana sayfasina git
        driver.get("https://www.techproeducation.com");
        waitFor(3);
        typeWithJS(driver.findElement(By.xpath("//input[@type='search']")),"QA");
    }

    //1-JUnit ile baslikta hosgeldiniz yazisini nasil automate ederiz
    //2 ne tur assert kullanirsin
    //3 bir sayfadaki  link sayisini nasil bulursunuz
    //4en son linke nasil tiklarsiniz
    //5 ekran goruntusunu nasil alirsiniz
    //6 test base de ne tur reusable met lar kullanirsiniz
    //7automation test % kac kullanirsiniz
    //8 excelde dosyalari nasil alirsiniz
}