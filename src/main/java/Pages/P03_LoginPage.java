package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class P03_LoginPage extends PageBase{

    public P03_LoginPage(WebDriver driver) {
        super(driver);
    }
    WebElement emailElement = driver.findElement(By.id("Email"));
    WebElement passwordElement = driver.findElement(By.id("Password"));
    WebElement loginBtn = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
    public WebElement MyAccountBtn = driver.findElement(By.linkText("My account"));

    public void enterLogin (String email, String password){
        inputText(emailElement, email);
        inputText(passwordElement, password);
        clicking(loginBtn);

    }
    public P04_MyAccountPage clickOnMyAccountBtn(){
        clicking(MyAccountBtn);
        return new P04_MyAccountPage(driver);
    }
}