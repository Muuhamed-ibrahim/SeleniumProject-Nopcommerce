package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class P11_CheckoutPaymentMethod extends PageBase{
    public P11_CheckoutPaymentMethod(WebDriver driver) {
        super(driver);
    }
    public void CreditCardBtn(){
        WebElement CreditCardElement = driver.findElement(By.id("paymentmethod_1"));
        clicking(CreditCardElement);
    }
    public void ContinueBtn(){
        WebElement continueElement = driver.findElement(By.xpath("//div[@class='buttons']//button[@class='button-1 payment-method-next-step-button']"));
        clicking(continueElement);
    }
}
