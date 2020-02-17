import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class ProgressBarSteps {
    WebDriver driver;
   ProgressBar progressBar;

    @Given("Firefox browser")
    public void createNewDriver()
    {
        driver = new FirefoxDriver();
    }


    @When("We go to the site URL https://www.seleniumeasy.com/test/jquery-download-progress-bar-demo.html")
    public void WebSite()
    {
        driver.get("https://www.seleniumeasy.com/test/jquery-download-progress-bar-demo.html");
        progressBar = new ProgressBar(driver);
    }
    @Then("Click download button")
    public void clickDownloadButton()
    {
        progressBar.downloadButtonClick();
    }
    @Then("Check progress label")
    public void valueB() throws InterruptedException {
        progressBar.progressLabelAssertion();
    }



    @Then("Close the firefox")
    public void close(){
        driver.close();
    }
}
