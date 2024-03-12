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
        try {
            Thread.sleep(500); // Pause for 1 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void inputText(WebElement element, String text)
    {
         element.sendKeys(text);
        try {
            Thread.sleep(1000); // Pause for 1 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void scrollToBottom(){
        jse.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        try {
            Thread.sleep(2000); // Pause for 3 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
