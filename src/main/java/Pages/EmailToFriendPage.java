package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EmailToFriendPage extends PageBase{
    public EmailToFriendPage(WebDriver driver) {
        super(driver);
    }
    WebElement FriendEmail = driver.findElement(By.id("FriendEmail"));
    WebElement PersonalMessage = driver.findElement(By.id("PersonalMessage"));
    WebElement SendMailBtn = driver.findElement(By.xpath("//button[@name='send-email']"));
    public void setFriendMail(String email, String message){
        inputText(FriendEmail,email);
        inputText(PersonalMessage,message);
        clicking(SendMailBtn);
    }
}
