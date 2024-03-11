package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class P01_HomePage extends PageBase {

    public P01_HomePage(WebDriver driver) {
        super(driver);
    }

    public void clickOnRegisterBtn (){
        WebElement RegisterBtnElement = driver.findElement(By.linkText("Register"));
        clicking(RegisterBtnElement);
    }
    public void clickOnLoginBtn (){
        WebElement LoginBtnElement = driver.findElement(By.linkText("Log in"));
        clicking(LoginBtnElement);
    }
    public void clickOnMyAccountBtn(){
        WebElement MyAccountBtn = driver.findElement(By.linkText("My account"));
        clicking(MyAccountBtn);
    }
    public void SearchOnProduct (String productName){
        WebElement SearchElement = driver.findElement(By.id("small-searchterms"));
        inputText(SearchElement,productName);
        WebElement SearchBtn = driver.findElement(By.xpath("//button[@type='submit']"));
        clicking(SearchBtn);
    }
    public void SearchAuto(String productName){
        WebElement SearchElement = driver.findElement(By.id("small-searchterms"));
        inputText(SearchElement,productName);
        WebElement SearchAutoElement = driver.findElement(By.id("ui-id-1"));
        clicking(SearchAutoElement);
    }
    public void ShoppingCartBtn (){
        WebElement ShoppingCartBtn = driver.findElement(By.xpath("//li[@id='topcartlink']"));
        clicking(ShoppingCartBtn);
    }
}
