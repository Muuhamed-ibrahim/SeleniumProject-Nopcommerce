package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class P08_ShoppingCart extends PageBase{
    public P08_ShoppingCart(WebDriver driver){
        super(driver);
    }

    public void  CheckoutBtn(){
        WebElement AgreeElement = driver.findElement(By.id("termsofservice"));
        WebElement CheckoutElement = driver.findElement(By.id("checkout"));

        scrollToBottom();
        clicking(AgreeElement);
        clicking(CheckoutElement);
    }
}
