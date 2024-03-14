package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class PageBase {
    protected WebDriver driver;
    protected static JavascriptExecutor jse ;


    public PageBase(WebDriver driver){
        this.driver = driver;
        this.jse = (JavascriptExecutor) driver;
    }

    public static void clicking(WebElement object){
        object.click();
        try {
            Thread.sleep(500); // Pause for 0.5 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void inputText(WebElement element, String text)
    {
         element.sendKeys(text);
        try {
            Thread.sleep(500); // Pause for 0.5 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public static void selecting(WebElement element, int x){
        Select select = new Select(element);
        select.selectByIndex(x);
    }
    public static void scrollToElement(WebElement element) throws InterruptedException {
        Thread.sleep(1500);
        jse.executeScript("arguments[0].scrollIntoView({behavior: 'smooth', block: 'center', inline: 'nearest'});", element);
        Thread.sleep(3000);
    }
}
