package aaa_homework;

import com.github.javafaker.Faker;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import utilitis.TestBase;

public class Odev08 extends TestBase {
    @Test
    public void homework08() {


        //    Faker Kutuphanesi HOMEWORK

//    Faker class’i testlerimizi yaparken ihtiyav duydugumuz isim, soyisim, adres vb bilgiler icin fake
//    degerler uretmemize imkan tanir.
//    Faker degerler uretmek icin Faker class’indan bir obje uretir ve var olan method’lari kullaniriz.

        Faker faker = new Faker();
//            "https://facebook.com"  Adresine gidin
        driver.get("https://facebook.com");

//“create new account”  butonuna basin
        driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[5]/a[1]")).click();

//“firstName” giris kutusuna bir isim yazin
//     driver.findElement(By.name("firstname")).sendKeys(faker.name().firstName()
//             + Keys.TAB + faker.name().lastName()
//             + Keys.TAB + faker.phoneNumber().cellPhone()
//              +Keys.TAB + faker.code().gtin13()
//             + Keys.TAB + faker.number().numberBetween(1,31);
////             + Keys.TAB + faker.date().birthday()
////             + Keys.TAB + faker.number().numberBetween(1900,2000)
////             + Keys.TAB + Keys.ENTER);


//“surname” giris kutusuna bir soyisim yazin
//“email” giris kutusuna bir email yazin
//“email” onay kutusuna emaili tekrar yazin
//    Bir sifre girin
//    Tarih icin gun secin
//    Tarih icin ay secin
//    Tarih icin yil secin
//    Cinsiyeti secin


//    Isaretlediginiz cinsiyetin secili, diger cinsiyet kutusunun secili olmadigini test edin.
//            Sayfayi kapatin
       WebElement seciliKutu =  driver.findElement(By.xpath("//input[@id='u_o_4_VA']"));
        Assert.assertTrue(seciliKutu.isSelected());
        WebElement seciliErkek = driver.findElement(By.id("u_o_5_tz"));
        Assert.assertFalse(seciliErkek.isSelected());

    }
}