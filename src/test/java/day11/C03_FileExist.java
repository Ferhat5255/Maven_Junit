package day11;

import org.junit.Assert;
import org.junit.Test;

import java.nio.file.Files;
import java.nio.file.Paths;

public class C03_FileExist {
    @Test
    public void isExistTest() {
        String useDIR = System.getProperty("user.dir");
        System.out.println(useDIR);  //C:\Users\ferhat\IdeaProjects\com.B103Maven_Junit

        String userHOME = System.getProperty("user.home");
        System.out.println(userHOME);  //C:\Users\ferhat

        //logo.jpeg  indirip MASAUSTUNE kaydedin

        String dosyaYolu = userHOME +"\\Desktop\\logo.jpeg.jpeg";
        System.out.println(dosyaYolu);

       boolean isExist = Files.exists(Paths.get(dosyaYolu));  //dosya var ise true, yoksa false
       Assert.assertTrue(isExist);


    }
}
