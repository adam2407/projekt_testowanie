import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import static org.junit.jupiter.api.Assertions.*;

class ProgressBarTest {
    private WebDriver driver;
    private final String URL = "https://www.seleniumeasy.com/test/jquery-download-progress-bar-demo.html";

@Test
    void startDownloadTest() throws InterruptedException {
    driver=new FirefoxDriver();
    driver.get(URL);
      ProgressBar p = new ProgressBar(driver);
    p.downloadButtonClick();
    p.checkButtonTag();
    Thread.sleep(15000);
    p.progressLabelAssertion();
    p.closeButtonClick();





}




}