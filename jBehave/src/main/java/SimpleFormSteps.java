import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class SimpleFormSteps {
    WebDriver driver;
    SimpleForm simpleForm;

    @Given("Firefox browser")
    public void createNewDriver()
    {
        driver = new FirefoxDriver();
    }


    @When("We go to the site URL \"https://www.seleniumeasy.com/test/basic-first-form-demo.html\"")
    public void WebSite()
    {

        driver.get("http://www.seleniumeasy.com/test/basic-first-form-demo.html");
        simpleForm = new SimpleForm(driver);
    }
    @Then("Fill Value A")
    public void valueA()
    {
        simpleForm.fillSum1("3");
    }
    @Then("Fill Value B")
    public void valueB()
    {
        simpleForm.fillSum2("4");
    }


    @When("Click on get total button")
    public void clickButton()
    {
        simpleForm.totalBtnClick();
    }

    @Then("See result")
    public void clickTextBox()
    {
        Assert.assertEquals("7",simpleForm.getSum());
    }

    @Then("Close the firefox")
    public void close(){
        driver.close();
    }
}
