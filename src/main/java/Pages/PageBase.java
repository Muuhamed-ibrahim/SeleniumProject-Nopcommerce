package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PageBase {
    protected WebDriver driver;
    public PageBase(WebDriver driver){
        this.driver = driver;
    }

    public static void clicking(WebElement object){
        object.click();
    }

    public static void inputText(WebElement element, String text)
    {
         element.sendKeys(text);
    }
}
