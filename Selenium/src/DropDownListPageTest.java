import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import static org.junit.jupiter.api.Assertions.*;

class DropDownListPageTest {
    private WebDriver driver;
    private final String URL = "https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html";

    @Test
    void messageTest() throws  InterruptedException {
        driver = new FirefoxDriver();
        driver.get(URL);
        DropDownListPage d = new DropDownListPage(driver);

        d.DropDownListClick();
        d.firstElementClick();

        Assert.assertEquals("Day selected :- Sunday",d.getVale());


        d.driver.close();
    }



}