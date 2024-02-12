package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends PageBase {

    public HomePage(WebDriver driver) {
        super(driver);
    }
    WebElement MyAccountBtn = driver.findElement(By.xpath("/html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[1]/a"));
    WebElement RegisterBtnElement = driver.findElement(By.linkText("Register"));
    WebElement LoginBtnElement = driver.findElement(By.linkText("Log in"));


    public RegisterPage clickOnRegisterBtn (){
        clicking(RegisterBtnElement);
        return new RegisterPage(driver);
    }
    public LoginPage clickOnLoginBtn (){
        clicking(LoginBtnElement);
        return new LoginPage(driver);
    }
    public MyAccountPage clickOnMyAccountBtn(){
        clicking(MyAccountBtn);
        return new MyAccountPage(driver);
    }

}
