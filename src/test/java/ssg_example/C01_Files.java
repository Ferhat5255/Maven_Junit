package ssg_example;
import org.junit.Assert;
import org.junit.Test;
import java.nio.file.Files;
import java.nio.file.Paths;
public class C01_Files {
    // Exercise 1...
    // masaustunde bir text dosyası olusturun
    // masaustundeki text dosyasının varlıgını test edin
    @Test
    public void test01() {
        // "C:\Users\BURAK      \Desktop\text.txt"
        // Assert.assertTrue(Files.exists(Paths.get("C:\\Users\\BURAK\\Desktop\\text.txt")));  Bu islemi daha dinamik hale getirelim
        String farklıKısım=System.getProperty("user.home"); //     C:\Users\BURAK
        String ortakKısım="\\Desktop\\text.txt"; //                \Desktop\text.txt
        String dosyaYolu=farklıKısım+ortakKısım;
        Assert.assertTrue(Files.exists(Paths.get(dosyaYolu)));
    }
}