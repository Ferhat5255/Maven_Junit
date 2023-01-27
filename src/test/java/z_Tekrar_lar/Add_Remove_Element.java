package z_Tekrar_lar;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilitis.TestBase;

public class Add_Remove_Element extends TestBase {
    @Test
    public void test() {
       // 1. 1- https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin
        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");

        //2. Add Element butonuna basin
        driver.findElement(By.xpath("//*[text()='Add Element']")).click();

        //3. Delete butonunun gorunur oldugunu test edin
        WebElement actualButton = driver.findElement(By.xpath("//button[@onclick='deleteElement()']"));
        Assert.assertTrue(actualButton.isDisplayed());

        //4. Delete tusuna basin
        driver.findElement(By.xpath("//button[@onclick='deleteElement()']")).click();

        //5. Add/Remove Elements" yazisinin gorunur oldugunu test edin
        WebElement addGorunur = driver.findElement(By.xpath("//h3"));
        Assert.assertTrue(addGorunur.isDisplayed());
    }
}
