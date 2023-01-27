package z_Tekrar_lar;

import org.junit.Test;
import org.openqa.selenium.By;
import utilitis.TestBase;

public class Locators_Css extends TestBase {
    @Test
    public void test() {
        //1 ) Bir class oluşturun : Locators_css
        //2 ) Main method oluşturun ve aşağıdaki görevi tamamlayın.
        //a. Verilen web sayfasına gidin. http://a.testaddressbook.com/sign_in
        driver.get("https://signup.heroku.com/");

        driver.findElement(By.cssSelector("input[id='first_name']")).sendKeys("ferhat");
        driver.findElement(By.cssSelector("input[id='last_name']")).sendKeys("Bay");
        driver.findElement(By.cssSelector("input[id='email']")).sendKeys(" testtechproed@gmail.com\n");

        //b. Locate email textbox

        //c. Locate password textbox ve
        //d. Locate signin button
        //e. Asagidaki kullanıcı adını ve şifreyi girin ve sign in düğmesini tıklayın
        //i. Username : testtechproed@gmail.com
        //ii. Password : Test1234!
    }
}
