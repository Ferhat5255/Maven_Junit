package day13;

import com.github.javafaker.Faker;
import org.junit.Test;
import org.openqa.selenium.WebDriver;


public class C03_NullPointerException  {
    /*

    NullPointerException
Değişkenleri oluşturup instantiate etmediğimizde alırız.
Örn: driver = new ChoromeDriver()'da "new" kelimesini kullanmadığımızda NullPointerException hatasını alırız.
     */

WebDriver driver;

Faker faker;
    @Test
    public void nullPointerExceptionTest() {
        driver.get("https://www.techproeducation.com"); //java.lang.NullPointerException
    }


    @Test
    public void nullPointerExceptionTest2() {
        System.out.println(faker.name().fullName());   //java.lang.NullPointerException
    }
}
