package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class P07_EmailToFriendPage extends PageBase{
    public P07_EmailToFriendPage(WebDriver driver) {
        super(driver);
    }

    public void setFriendMail(String email,String message) {
        WebElement FriendEmail = driver.findElement(By.id("FriendEmail"));
        WebElement PersonalMessage = driver.findElement(By.id("PersonalMessage"));
        WebElement SendMailBtn = driver.findElement(By.xpath("//button[@name='send-email']"));

        inputText(FriendEmail,email);
        inputText(PersonalMessage,message);
        clicking(SendMailBtn);
    }
}
