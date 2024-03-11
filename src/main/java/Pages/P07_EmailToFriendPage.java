package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class P07_EmailToFriendPage extends PageBase{
    public P07_EmailToFriendPage(WebDriver driver) {
        super(driver);
    }
    WebElement FriendEmail = driver.findElement(By.id("FriendEmail"));
    WebElement yourEmail = driver.findElement((By.id("YourEmailAddress")));
    WebElement PersonalMessage = driver.findElement(By.id("PersonalMessage"));
    WebElement SendMailBtn = driver.findElement(By.xpath("//button[@name='send-email']"));
    public void setFriendMail(String email,String message){
        inputText(FriendEmail,email);
        inputText(PersonalMessage,message);
        clicking(SendMailBtn);
    }
}
