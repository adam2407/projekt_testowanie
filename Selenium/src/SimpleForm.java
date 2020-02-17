import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SimpleForm {
    WebDriver driver;
    public SimpleForm(WebDriver driver){
        this.driver = driver;
    }
    private final By userMessageInput = By.xpath("//*[@id=\"user-message\"]");
    private final By showMessageButton = By.xpath("/html/body/div[2]/div/div[2]/div[1]/div[2]/form/button");
    private final By checkValidationMessage = By.xpath("//*[@id=\"display\"]");
    private final By Sum1Input = By.xpath("//*[@id=\"sum1\"]");
    private final By Sum2Input = By.xpath("//*[@id=\"sum2\"]");
    private final By TotalButton = By.xpath("//*[@id=\"gettotal\"]/button");
    private final By DisplayValue = By.xpath("//*[@id=\"displayvalue\"]");





    void fillUserMessage(String message)
    {
        driver.findElement(userMessageInput).sendKeys(message);
    }
   void clickMessageButon(){
        driver.findElement(showMessageButton).click();
    }

     String getMessage(){
        return driver.findElement(checkValidationMessage).getText();
    }

    void fillSum1(String x){
        driver.findElement(Sum1Input).sendKeys(x);
    }
    void fillSum2(String x){
        driver.findElement(Sum2Input).sendKeys(x);
    }

    void totalBtnClick(){
        driver.findElement(TotalButton).click();
    }

    String getSum(){
        return driver.findElement(DisplayValue).getText();
    }

}
