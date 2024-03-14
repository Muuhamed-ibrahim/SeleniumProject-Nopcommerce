package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class P12_CheckoutPaymentInfo extends PageBase{
    public P12_CheckoutPaymentInfo(WebDriver driver) {
        super(driver);
    }
    public void CardholderName(String name) throws InterruptedException {
        WebElement CardholderNameElement = driver.findElement(By.id("CardholderName"));
        Thread.sleep(500);
        inputText(CardholderNameElement,name);
    }
    public void CardNumber(String cardName) throws InterruptedException {
        WebElement CardNumberElement = driver.findElement(By.id("CardNumber"));
        Thread.sleep(500);
        inputText(CardNumberElement,cardName);
    }
    public void ExpirationDate() throws InterruptedException {
        WebElement ExpirationDateElement = driver.findElement(By.xpath("//select[@id='ExpireMonth']"));
        Select select = new Select(ExpirationDateElement);
        Thread.sleep(500);
        select.selectByIndex(7);
    }
    public void CardCode(String CardCode) throws InterruptedException {
        WebElement CardCodeElement = driver.findElement(By.id("CardCode"));
        Thread.sleep(500);
        inputText(CardCodeElement,CardCode);
    }
    public void ContinueBtn() throws InterruptedException {
        WebElement continueElement = driver.findElement(By.xpath("//div[@class='buttons']//button[@class='button-1 payment-info-next-step-button']"));
        Thread.sleep(500);
        clicking(continueElement);
    }
}
