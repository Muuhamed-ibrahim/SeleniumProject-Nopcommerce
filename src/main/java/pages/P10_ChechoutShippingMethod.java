package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class P10_ChechoutShippingMethod extends PageBase {

    public P10_ChechoutShippingMethod(WebDriver driver) {
        super(driver);
    }
    public void ContinueBtn() throws InterruptedException {
        WebElement continueElement = driver.findElement(By.xpath("//div[@class='buttons']//button[@class='button-1 shipping-method-next-step-button']"));
        clicking(continueElement);
        Thread.sleep(500);
    }
}
