import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class DropDownListSteps {
    WebDriver driver;
    DropDownListPage dropDownListPage;

    @Given("Firefox browser")
    public void createNewDriver()
    {
        driver = new FirefoxDriver();
    }


    @When("We go to the site URL \"https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html\"")
    public void WebSite()
    {

        driver.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
        dropDownListPage = new DropDownListPage(driver);
    }
    @Then("Click Drop Down List")
    public void clickList()
    {
        dropDownListPage.DropDownListClick();
    }
    @Then("Select First Value")
    public void selectFirstValue()
    {
        dropDownListPage.firstElementClick();
    }

    @Then("See result")
    public void seeResult()
    {
        Assert.assertEquals("Day selected :- Sunday",dropDownListPage.getVale());
    }

    @Then("Close the firefox")
    public void close(){
        driver.close();
    }
}
