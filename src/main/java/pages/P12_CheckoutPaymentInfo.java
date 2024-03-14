package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class P12_CheckoutPaymentInfo extends PageBase{
    public P12_CheckoutPaymentInfo(WebDriver driver) {
        super(driver);
    }
    public void CardholderName(String name){
        WebElement CardholderNameElement = driver.findElement(By.id("CardholderName"));
        inputText(CardholderNameElement,name);
    }
    public void CardNumber(String cardName){
        WebElement CardNumberElement = driver.findElement(By.id("CardNumber"));
        inputText(CardNumberElement,cardName);
    }
    public void ExpirationDate(){
        WebElement ExpirationDateElement = driver.findElement(By.xpath("//select[@id='ExpireMonth']"));
        Select select = new Select(ExpirationDateElement);
        select.selectByIndex(7);
    }
    public void CardCode(String CardCode){
        WebElement CardCodeElement = driver.findElement(By.id("CardCode"));
        inputText(CardCodeElement,CardCode);
    }
    public void ContinueBtn(){
        WebElement continueElement = driver.findElement(By.xpath("//div[@class='buttons']//button[@class='button-1 payment-info-next-step-button']"));
        clicking(continueElement);
    }
}
