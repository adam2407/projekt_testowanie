import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import static org.junit.jupiter.api.Assertions.*;

class RadioButtonPageTest {
    private WebDriver driver;
    private final String URL = "https://www.seleniumeasy.com/test/basic-radiobutton-demo.html";

    @Test
    void maleRadioButtonTest()throws  InterruptedException{
        driver=new FirefoxDriver();
        driver.get(URL);
        RadioButtonPage r =  new RadioButtonPage(driver);

        r.maleClick();
        Thread.sleep(500);
        r.valueButtonClick();
        Thread.sleep(500);
        r.getValue();
        Assert.assertEquals("Radio button 'Male' is checked",r.getValue());

        driver.close();
    }
    @Test
    void femaleRadioButtonTest()throws  InterruptedException{
        driver=new FirefoxDriver();
        driver.get(URL);
        RadioButtonPage r =  new RadioButtonPage(driver);

        r.femaleClick();
        Thread.sleep(500);
        r.valueButtonClick();
        Thread.sleep(500);
        r.getValue();
        Assert.assertEquals("Radio button 'Female' is checked",r.getValue());

        driver.close();
    }
    @Test
    void femaleRadioButtonGroupTest()throws  InterruptedException{
        driver=new FirefoxDriver();
        driver.get(URL);
        RadioButtonPage r =  new RadioButtonPage(driver);

        r.femaleClickGroup();
        r.ageButtonGroupClick();
        Thread.sleep(500);
        r.valueButtonGroupClick();
        Thread.sleep(500);
        Assert.assertEquals("Sex : Female\n" + "Age group: 5 - 15",r.getValueGroup());

        driver.close();
    }
    @Test
    void maleRadioButtonGroupTest()throws  InterruptedException{
        driver=new FirefoxDriver();
        driver.get(URL);
        RadioButtonPage r =  new RadioButtonPage(driver);

        r.maleClickGroup();
        r.ageButtonGroupClick();
        Thread.sleep(500);
        r.valueButtonGroupClick();
        Thread.sleep(500);
        Assert.assertEquals("Sex : Male\n" + "Age group: 5 - 15",r.getValueGroup());

        driver.close();
    }
}