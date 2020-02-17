import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class CheckBoxSteps {
    WebDriver driver;
    CheckBoxPage checkBox;

    @Given("Firefox browser")
    public void createNewDriver()
    {
        driver = new FirefoxDriver();
    }


    @When("We go to the site URL \"https://www.seleniumeasy.com/test/basic-checkbox-demo.html\"")
    public void WebSite()
    {

        driver.get("https://www.seleniumeasy.com/test/basic-checkbox-demo.html");
        checkBox = new CheckBoxPage(driver);
    }
    @Then("Click single check box")
    public void valueA()
    {
        checkBox.singleChBoxClick();
    }

    @Then("See result")
    public void clickTextBox()
    {
        Assert.assertEquals("Success - Check box is checked",checkBox.getValue());
    }

    @Then("Close the firefox")
    public void close(){
        driver.close();
    }
}
