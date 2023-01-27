package aaa_homework;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilitis.TestBase;

import java.util.List;

public class XCan01 extends TestBase {
    @Test
    public void canTest01() {


        //go to web site : https://www.jqueryscript.net/demo/Easy-iFrame-based-Twitter-Emoji-Picker-Plugin-jQuery-Emoojis/
driver.get("https://www.jqueryscript.net/demo/Easy-iFrame-based-Twitter-Emoji-Picker-Plugin-jQuery-Emoojis/");
//maximize the web site
// ikinci emojiye tıklayın
driver.findElement(By.xpath("//iframe[@id='emoojis']")).click();

// ikinci emoji altındaki tüm öğelere tıklayın

        driver.switchTo().frame(1);
       List<WebElement> list = driver.findElements(By.xpath("//div[@id='nature']"));

       for (WebElement element : list) {



       }

// ana iframe'e geri dön
//formu doldurun,(Formu istediğiniz metinlerle doldurun)
// uygula butonuna tıklayın
    }
}