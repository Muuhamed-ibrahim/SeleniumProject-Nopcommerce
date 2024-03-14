package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class P01_HomePage extends PageBase {

    public P01_HomePage(WebDriver driver) {
        super(driver);
    }

    public void clickOnRegisterBtn (){
        WebElement RegisterBtnElement = driver.findElement(By.xpath("//div[@class='header-links-wrapper']//a[@class='ico-register']"));
        clicking(RegisterBtnElement);
    }
    public void clickOnLoginBtn (){
        WebElement LoginBtnElement = driver.findElement(By.xpath("//div[@class='header-links-wrapper']//a[@class='ico-login']"));
        clicking(LoginBtnElement);
    }
    public void clickOnMyAccountBtn(){
        WebElement MyAccountBtn = driver.findElement(By.linkText("My account"));
        clicking(MyAccountBtn);
    }
    public void SearchOnProduct (String productName) throws InterruptedException {
        WebElement SearchElement = driver.findElement(By.id("small-searchterms"));
        inputText(SearchElement,productName);
        Thread.sleep(500);
        WebElement SearchBtn = driver.findElement(By.xpath("//button[@type='submit']"));
        clicking(SearchBtn);
        Thread.sleep(500);
    }
    public void SearchAuto(String productName) throws InterruptedException {
        WebElement SearchElement = driver.findElement(By.id("small-searchterms"));
        inputText(SearchElement,productName);
        Thread.sleep(1000);
        WebElement SearchAutoElement = driver.findElement(By.id("ui-id-1"));
        Thread.sleep(1000);
        clicking(SearchAutoElement);
    }
    public void ShoppingCartBtn (){
        WebElement ShoppingCartBtn = driver.findElement(By.xpath("//li[@id='topcartlink']"));
        clicking(ShoppingCartBtn);
    }
    public void Logout() throws InterruptedException {
        WebElement CloseAlert= driver.findElement(By.xpath("//div[@id='bar-notification']//span[@class='close']"));
        clicking(CloseAlert);
        Thread.sleep(500);
        WebElement LogoutElement = driver.findElement(By.xpath("//div[@class='header-links-wrapper']//a[@class='ico-logout']"));
        clicking(LogoutElement);
        Thread.sleep(500);

    }
    public void followUs() throws InterruptedException {
        WebElement facebookElement = driver.findElement(By.linkText("Facebook"));
        scrollToElement(facebookElement);
        Thread.sleep(1000);
        clicking(facebookElement);
    }
}
