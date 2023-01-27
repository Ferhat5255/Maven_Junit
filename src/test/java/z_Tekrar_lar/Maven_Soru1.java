package z_Tekrar_lar;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import utilitis.TestBase;

public class Maven_Soru1 extends TestBase {
    @Test
    public void test() {

        //1. http://zero.webappsecurity.com sayfasina gidin
        driver.get("http://zero.webappsecurity.com ");

        //2. Signin buttonuna tiklayin
        driver.findElement(By.xpath("//*[@id='signin_button']")).click();

        //3. Login alanine “username” yazdirin
        driver.findElement(By.xpath("//*[@id='user_login']")).sendKeys("username",
                Keys.TAB,"password",Keys.TAB,Keys.TAB,Keys.ENTER); //4. Password alanine “password” yazdiriN //5. Sign in buttonuna tiklayin

        //6. Pay Bills sayfasina gidin
       // =================SAYFA ILERLEMEDI===========================

        //7. amount kismina yatirmak istediginiz herhangi bir miktari yazin
        //8. tarih kismina “2020-09-10” yazdirin
        //9. Pay buttonuna tiklayin
        //10. “The payment was successfully submitted.” mesajinin ciktigini control edin

    }
}
