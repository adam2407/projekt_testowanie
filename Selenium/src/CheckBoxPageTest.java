import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import static org.junit.jupiter.api.Assertions.*;

class CheckBoxPageTest {
    private WebDriver driver;
    private final String URL = "https://www.seleniumeasy.com/test/basic-checkbox-demo.html";

    @Test
    void checkSingleBoxTest()throws  InterruptedException{
        driver = new FirefoxDriver();
        driver.get(URL);
        CheckBoxPage  c = new CheckBoxPage(driver);

        c.singleChBoxClick();
        Assert.assertEquals("Success - Check box is checked",c.getValue());

        driver.close();
    }

    @Test
    void checkAllButtonTest()throws  InterruptedException{
        driver = new FirefoxDriver();
        driver.get(URL);
        CheckBoxPage  c = new CheckBoxPage(driver);

        c.checkAllButtonClick();
        Thread.sleep(500);
        Assert.assertTrue(c.allCheck());
        Thread.sleep(500);
        c.checkAllButtonClick();
        Assert.assertFalse(c.allCheck());
        driver.close();
    }


}