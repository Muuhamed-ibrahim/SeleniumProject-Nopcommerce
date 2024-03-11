package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class P05_ResultOfShow extends PageBase{

    public P05_ResultOfShow(WebDriver driver) {
        super(driver);
    }
    public void SelectProduct(){
        WebElement selectProductElement = driver.findElement(By.xpath("//div[@class='details']//a[@href='/apple-macbook-pro-13-inch']"));
        clicking(selectProductElement);
    }
    public void AddToCart(){
        WebElement AddToCart = driver.findElement(By.id("add-to-cart-button-4"));
        clicking(AddToCart);
    }
    public void CloseAssert(){
        WebElement closeElement = driver.findElement(By.xpath("//div[@class='bar-notification success']//span[@class='close']"));
        clicking(closeElement);
    }
}
