package Pages;

import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PageBase {
    protected WebDriver driver;
    protected JavascriptExecutor jse ;


    public PageBase(WebDriver driver){
        this.driver = driver;
        this.jse = (JavascriptExecutor) driver;
    }

    public static void clicking(WebElement object){
        object.click();
    }

    public static void inputText(WebElement element, String text)
    {
         element.sendKeys(text);
    }
    public void scrollToBottom(){
        jse.executeScript("window.scrollTo(0, document.body.scrollHeight)");
    }
}
