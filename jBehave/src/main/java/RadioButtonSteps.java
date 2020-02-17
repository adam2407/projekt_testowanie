import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RadioButtonSteps {
    WebDriver driver;
    RadioButtonPage radioButtonPage;

    @Given("Firefox browser")
    public void createNewDriver()
    {
        driver = new FirefoxDriver();

    }
    @When("We go to the site URL \"https://www.seleniumeasy.com/test/basic-radiobutton-demo.html\"")
    public void goSite(){
        driver.get("https://www.seleniumeasy.com/test/basic-radiobutton-demo.html");
        radioButtonPage = new RadioButtonPage(driver);
    }

    @Then("Click Male")
    public void clickMale(){
        radioButtonPage.maleClick();
    }
    @When("Click Get Chcecked Value BUtton")
    public void clickButton(){
        radioButtonPage.valueButtonClick();
    }
    @Then("See result")
    public void seeResult(){
        Assert.assertEquals("Radio button 'Male' is checked",radioButtonPage.getValue());
    }
    @Then("Click Female")
    public void clickFemale(){
        radioButtonPage.femaleClick();
    }

    @Then("See result2")
    public void seeResult2(){
        Assert.assertEquals("Radio button 'Female' is checked",radioButtonPage.getValue());
    }
}
