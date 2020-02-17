import org.junit.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SetupTest {
    public static WebDriver driver;
    @Before
    protected void beforeClass()
    {

        System.setProperty("webdriver.gecko.driver","C:\\Testowanie Projekt\\Selenium\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
    }
    @Before
    public void setup(){
        System.setProperty("webdriver.gecko.driver","C:\\Testowanie Projekt\\Selenium\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
    }
    @After
    protected void aftercalss()
    {
        driver.switchTo().window(driver.getWindowHandle()).close();
        driver.quit();

    }


}
