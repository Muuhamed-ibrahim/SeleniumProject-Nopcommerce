package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class P11_CheckoutPaymentMethod extends PageBase{
    public P11_CheckoutPaymentMethod(WebDriver driver) {
        super(driver);
    }
    public void CreditCardBtn() throws InterruptedException {
        WebElement CreditCardElement = driver.findElement(By.id("paymentmethod_1"));
        clicking(CreditCardElement);
        Thread.sleep(500);
    }
    public void ContinueBtn() throws InterruptedException {
        WebElement continueElement = driver.findElement(By.xpath("//div[@class='buttons']//button[@class='button-1 payment-method-next-step-button']"));
        clicking(continueElement);
        Thread.sleep(500);
    }
}
