package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class P01_HomePage extends PageBase {

    public P01_HomePage(WebDriver driver) {
        super(driver);
    }
    WebElement MyAccountBtn = driver.findElement(By.xpath("/html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[1]/a"));
    WebElement RegisterBtnElement = driver.findElement(By.linkText("Register"));
    WebElement LoginBtnElement = driver.findElement(By.linkText("Log in"));
    WebElement SearchElement = driver.findElement(By.id("small-searchterms"));
    WebElement SearchBtn = driver.findElement(By.xpath("//button[@type='submit']"));
    WebElement SearchAutoElement = driver.findElement(By.id("ui-id-1"));
    WebElement ContactUsElement = driver.findElement(By.linkText("Contact us"));


    public void clickOnRegisterBtn (){
        clicking(RegisterBtnElement);
    }
    public void clickOnLoginBtn (){
        clicking(LoginBtnElement);
    }
    public void clickOnMyAccountBtn(){
        clicking(MyAccountBtn);
    }
    public void SearchOnProduct (String productName){
        inputText(SearchElement,productName);
        clicking(SearchBtn);
    }
    public void SearchAuto(String productName){
        inputText(SearchElement,productName);
        clicking(SearchAutoElement);
    }
    public void ContactUsBtn (){
        scrollToBottom();
        clicking(ContactUsElement);
    }
}
