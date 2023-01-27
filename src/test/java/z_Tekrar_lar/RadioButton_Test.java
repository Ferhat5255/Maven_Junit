package z_Tekrar_lar;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import utilitis.TestBase;

public class RadioButton_Test extends TestBase {

    @Test
    public void test() {
        //- https://www.facebook.com adresine gidin
        driver.get("https://www.facebook.com");

        //- Cookies’i kabul edin
        //- “Create an Account” button’una basin
        driver.findElement(By.xpath("//a[text()='Yeni Hesap Oluştur']")).click();

        //- “radio buttons” elementlerini locate edin
        driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("fsdfdghkjhgb",
                Keys.TAB,"DFGHGFJ",Keys.TAB,"3456789",Keys.TAB,"1234545",Keys.TAB,Keys.TAB,
                "1",Keys.TAB,"Tem",Keys.TAB,"1985",Keys.TAB,Keys.TAB,Keys.ARROW_RIGHT,Keys.ENTER);

        //- Secili degilse cinsiyet butonundan size uygun olani secin
    }
}
