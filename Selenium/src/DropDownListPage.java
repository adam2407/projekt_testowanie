import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.server.handler.html5.Utils;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DropDownListPage {
    WebDriver driver;
    DropDownListPage(WebDriver driver){this.driver=driver;}
    private final By FirstForm = By.xpath("//select[@id='select-demo']");
    private final By FirstFormElement = By.xpath("/html/body/div[2]/div/div[2]/div[1]/div[2]/select/option[2]");
    private final By FirstFormLabel = By.xpath("//*[@id=\"easycont\"]/div/div[2]/div[1]/div[2]/p[2]");



   void DropDownListClick()
    {
        driver.findElement(FirstForm).click();

    }
    void firstElementClick(){
        driver.findElement(FirstFormElement).click();
    }

    String getVale(){
        return driver.findElement(FirstFormLabel).getText();
    }








}
