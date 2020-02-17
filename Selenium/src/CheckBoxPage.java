import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckBoxPage {
    private WebDriver driver;
    CheckBoxPage(WebDriver driver){this.driver=driver;}

    private final By singleChBox = By.xpath("//*[@id=\"isAgeSelected\"]");
    private final By checkValue = By.xpath("//*[@id=\"txtAge\"]");

    private final By CheckAllButton = By.xpath("//*[@id=\"check1\"]");
    private final By checkBox1 = By.xpath("//*[@id=\"easycont\"]/div/div[2]/div[2]/div[2]/div[1]/label/input");
    private final By checkBox2 = By.xpath("//*[@id=\"easycont\"]/div/div[2]/div[2]/div[2]/div[2]/label/input");
    private final By checkBox3 = By.xpath("//*[@id=\"easycont\"]/div/div[2]/div[2]/div[2]/div[3]/label/input");
    private final By checkBox4 = By.xpath("//*[@id=\"easycont\"]/div/div[2]/div[2]/div[2]/div[4]/label/input");


     void singleChBoxClick(){
        driver.findElement(singleChBox).click();
    }
     String getValue(){
        return driver.findElement(checkValue).getText();
    }
     void setCheckBox1Check(){
        driver.findElement(checkBox1).click();
    }
     void setCheckBox2Check(){
        driver.findElement(checkBox2).click();
    }
     void setCheckBox3Check(){
        driver.findElement(checkBox3).click();
    }
     void setCheckBox4Check(){
        driver.findElement(checkBox4).click();
    }
     void checkAllButtonClick(){
        driver.findElement(CheckAllButton).click();
    }
    public String checkAllButtonGetText(){
       return driver.findElement(CheckAllButton).getCssValue("text");
    }

     boolean allCheck(){
         return driver.findElement(checkBox1).isSelected() &&
                 driver.findElement(checkBox2).isSelected() &&
                 driver.findElement(checkBox3).isSelected() &&
                 driver.findElement(checkBox4).isSelected();

    }


}
