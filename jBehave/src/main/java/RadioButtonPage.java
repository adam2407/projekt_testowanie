import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RadioButtonPage {
    WebDriver driver;
    RadioButtonPage(WebDriver driver){this.driver=driver;}


    private final By maleRadioButton = By.xpath("//*[@id=\"easycont\"]/div/div[2]/div[1]/div[2]/label[1]/input");
    private final By femaleRadioButton = By.xpath("/html/body/div[2]/div/div[2]/div[1]/div[2]/label[2]");
    private final By valueButton = By.xpath("//button[@id='buttoncheck']");
    private final By labelValue = By.xpath("//*[@id=\"easycont\"]/div/div[2]/div[1]/div[2]/p[3]");

    private final By femaleRadioButtonGroup = By.xpath("//*[@id=\"easycont\"]/div/div[2]/div[2]/div[2]/div[1]/label[2]/input");
    private final By maleRadioButtonGroup = By.xpath("/html/body/div[2]/div/div[2]/div[2]/div[2]/div[1]/label[1]/input");
    private final By ageRadioButton515 = By.xpath("//*[@id=\"easycont\"]/div/div[2]/div[2]/div[2]/div[2]/label[2]/input");
    private final By valuesButtonGroup = By.xpath("//button[text()='Get values']");
    private final By labelValueGroup = By.xpath("//p[@class='groupradiobutton'][1]");

    void maleClick(){
        driver.findElement(maleRadioButton).click();
    }
     void femaleClick(){
        driver.findElement(femaleRadioButton).click();
    }
     void valueButtonClick(){
        driver.findElement(valueButton).click();
    }
     String getValue(){
        return driver.findElement(labelValue).getText();
    }
     void maleClickGroup(){
        driver.findElement(maleRadioButtonGroup).click();
    }
     void femaleClickGroup(){
        driver.findElement(femaleRadioButtonGroup).click();
    }
     void valueButtonGroupClick(){
        driver.findElement(valuesButtonGroup).click();
    }
    void ageButtonGroupClick(){
        driver.findElement(ageRadioButton515).click();
    }
    String getValueGroup(){
        return driver.findElement(labelValueGroup).getText();
    }


}
