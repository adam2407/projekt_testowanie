import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

class SimpleFormTest {

    private WebDriver driver;
    private final String URL = "https://www.seleniumeasy.com/test/basic-first-form-demo.html";

    @Test
     void messageTest() throws  InterruptedException {
        driver = new FirefoxDriver();
        driver.get(URL);
        SimpleForm s = new SimpleForm(driver);

        String message = "Wiadomosc";
        s.fillUserMessage(message);
        s.clickMessageButon();
        Assert.assertEquals(message,s.getMessage());

        s.driver.close();
    }
    @Test
    void totalTest(){
        driver = new FirefoxDriver();
        driver.get(URL);
        SimpleForm s = new SimpleForm(driver);

        String value1 = "2";
        String value2 = "3";
        String sum= "5";

        s.fillSum1(value1);
        s.fillSum2(value2);
        s.totalBtnClick();
        Assert.assertEquals(sum,s.getSum());

        s.driver.close();

    }

}