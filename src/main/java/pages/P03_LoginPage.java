package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class P03_LoginPage extends PageBase{

    public P03_LoginPage(WebDriver driver) {
        super(driver);
    }
   

    public void enterLogin (String email, String password){

        WebElement emailElement = driver.findElement(By.id("Email"));
        WebElement passwordElement = driver.findElement(By.id("Password"));
        WebElement loginBtn = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));

        emailElement.clear();
        inputText(emailElement, email);
        inputText(passwordElement, password);
        clicking(loginBtn);

    }
}
