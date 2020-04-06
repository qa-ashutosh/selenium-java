import com.applitools.eyes.selenium.Eyes;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class BaseTests {
    protected static WebDriver driver;
    protected static Eyes eyes;

    @BeforeClass
    public static void setUp() {
        Properties props = System.getProperties();
        try{
            props.load(new FileInputStream(new File("resources/properties")));
        } catch (Exception e){
            e.printStackTrace();
            System.exit(-1);
        }

        //setup the chromedriver using WebDriverManager
        WebDriverManager.chromedriver().setup();


        //Create driver object for Chrome
        driver = new ChromeDriver();
        initiateEyes();
        driver.get("http://toolsqa.com");
    }


    private static void initiateEyes() {
        eyes = new Eyes();
        eyes.setApiKey(System.getProperty("applitools.api.key"));
    }
}
