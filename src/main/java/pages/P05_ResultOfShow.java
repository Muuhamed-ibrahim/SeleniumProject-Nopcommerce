package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class P05_ResultOfShow extends PageBase{

    public P05_ResultOfShow(WebDriver driver) {
        super(driver);
    }
    public void SelectProduct() throws InterruptedException {
        WebElement selectProductElement = driver.findElement(By.xpath("//div[@class='details']//a[@href='/apple-macbook-pro-13-inch']"));
        scrollToElement(selectProductElement);
        Thread.sleep(500);
        clicking(selectProductElement);
    }
    public void AddToCart() throws InterruptedException {
        WebElement AddToCart = driver.findElement(By.id("add-to-cart-button-4"));
        scrollToElement(AddToCart);
        Thread.sleep(500);
        clicking(AddToCart);
    }
    public void CloseAssert() throws InterruptedException {
        WebElement closeElement = driver.findElement(By.xpath("//div[@class='bar-notification success']//span[@class='close']"));
        clicking(closeElement);
        Thread.sleep(500);
    }
}
