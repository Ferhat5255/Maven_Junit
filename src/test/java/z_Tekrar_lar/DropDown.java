package z_Tekrar_lar;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utilitis.TestBase;

import java.util.List;

public class DropDown extends TestBase {
    @Test
    public void test() {


        //https://the-internet.herokuapp.com/dropdown adresine gidin.
        driver.get("https://the-internet.herokuapp.com/dropdown ");

        //1.Index kullanarak Seçenek 1’i (Option 1) seçin ve yazdırın
        WebElement ddn = driver.findElement(By.xpath("//select[@id='dropdown']"));
        Select option =new Select(ddn);
        option.selectByIndex(1);
        String s1 = option.getFirstSelectedOption().getText();
        System.out.println(s1);

        //2.Value kullanarak Seçenek 2'yi (Option 2) seçin ve yazdırın
        option.selectByValue("2");
        String s2 = option.getFirstSelectedOption().getText();
        System.out.println(s2);

        //3.Visible Text(Görünen metin) kullanarak Seçenek 1’i (Option 1) seçin ve yazdırın
        option.selectByVisibleText("Option 1");
        String s11 = option.getFirstSelectedOption().getText();
        System.out.println(s11);

        //4.Tüm dropdown değerleri(value) yazdırın
 List<WebElement> l= option.getOptions();

    for (WebElement w : l) {
        System.out.println(w.getText());

    }

        //5. Dropdown’un boyutunu bulun, Dropdown’da 4 öğe varsa konsolda True , degilse
        //False yazdırın.
        if (l.size()==4){
            System.out.println("True");
        }else System.out.println("False");

    }
}