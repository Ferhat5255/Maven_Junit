package aaa_homework;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilitis.TestBase;

public class Odev06 extends TestBase {
    @Test
    public void odev06() {


        //    Bir Class olusturalim KeyboardActions2
//    https://html.com/tags/iframe/ sayfasina gidelim
        driver.get("https://html.com/tags/iframe/");

//    video’yu gorecek kadar asagi inin
        Actions action = new Actions(driver);
        action.sendKeys(Keys.PAGE_DOWN,Keys.PAGE_DOWN,Keys.PAGE_DOWN,Keys.PAGE_DOWN,Keys.PAGE_DOWN).perform();

//    videoyu izlemek icin Play tusuna basin
        driver.switchTo().frame(0);

       WebElement button =  driver.findElement(By.xpath("//button[@aria-label='Oynat']"));
        button.click();


//    videoyu calistirdiginizi test edin
        WebElement video = driver.findElement(By.xpath("//*[@id='movie_player']"));
        Assert.assertTrue(video.isDisplayed());

    }
}