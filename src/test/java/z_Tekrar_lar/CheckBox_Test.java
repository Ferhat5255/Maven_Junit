package z_Tekrar_lar;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilitis.TestBase;

public class CheckBox_Test extends TestBase {
    @Test
    public void test() throws InterruptedException {
        //a. Verilen web sayfasına gidin.
        //https://the-internet.herokuapp.com/checkboxes
        driver.get("https://the-internet.herokuapp.com/checkboxes");

        //b. Checkbox1 ve checkbox2 elementlerini locate edin.
        WebElement checkBox1 = driver.findElement(By.xpath("(//input[@type='checkbox'])[1]"));
        WebElement checkBox2 = driver.findElement(By.xpath("(//input[@type='checkbox'])[2]"));

        //c. Checkbox1 seçili değilse onay kutusunu tıklayın
        if(!checkBox1.isSelected()){
            checkBox1.click();
        }
Thread.sleep(3000);
        //d. Checkbox2 seçili değilse onay kutusunu tıklayın
        if(!checkBox2.isSelected()){
            checkBox1.click();
        }



    }
}
