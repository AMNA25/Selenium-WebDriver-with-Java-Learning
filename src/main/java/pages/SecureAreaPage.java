package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SecureAreaPage {
    private WebDriver driver;
    private  By message= By.id("flash");
    public SecureAreaPage(WebDriver driver){
        this.driver=driver;
    }
    public String readMessage(){
        return driver.findElement(message).getText();

    }

}
