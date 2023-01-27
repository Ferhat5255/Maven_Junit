package day05_JUnit;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C04_BeforeClassAftreClass {
    /*
       @BeforeClass VE @AfterClass notasyonlari sadece static method'lar icin calisir.
       @BeforeClass VE @AfterClass kullanirsak olusturdugumuz @Test methodlarinin hepsini ayni anda calistirip
       en son @AfterClass ' i calistiririz
       Ama sadece @Before ve @After kullanirsak her test icin @Before ve @After ' i kullanilir
     */

    @BeforeClass
    public static void setUp(){
        System.out.println("Butun testlerden once calisti");
    }

    @AfterClass
    public static void tearDown(){
        System.out.println("Butun testlerden sonra calisti");
    }

    @Before
    public  void setUp01(){
        System.out.println("Her testlerden once calisti");
    }

    @After
    public void tearDown01() {
        System.out.println("Her testlerden sonra calisti");
    }

    @Test
    public void test01(){
        System.out.println("ilk test");
    }
    @Test
    public void test02(){
        System.out.println("ikinci test");
    }
    @Test
    @Ignore
    public void test03(){
        System.out.println("Ucuncu test");
    }
}

