package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class BaseTest {
    protected static WebDriver driver;
    protected static EyesManager eyesManager;

    @BeforeClass
    public static void setUp() {
        Properties props = System.getProperties();
        try {
            props.load(new FileInputStream(new File("resources/config.properties")));
        } catch(Exception e) {
            e.printStackTrace();
            System.exit(-1);
        }

        driver = new ChromeDriver();
        eyesManager = new EyesManager(driver);



    }

    @AfterClass
    public static void tearDown() {
       driver.quit();
       eyesManager.abort();
    }

}
