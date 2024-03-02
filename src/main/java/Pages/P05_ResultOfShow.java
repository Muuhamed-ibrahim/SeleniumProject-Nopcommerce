package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class P05_ResultOfShow extends PageBase{

    public P05_ResultOfShow(WebDriver driver) {
        super(driver);
    }
    WebElement selectProductElement = driver.findElement(By.linkText("Apple MacBook Pro 13-inch"));
    //WebElement EmailToFriendElement = driver.findElement(By.xpath("//div[@class='email-a-friend']"));
    public void SelectProduct(){
        clicking(selectProductElement);
    }
//    public void EmailToFriend(){
//        clicking(EmailToFriendElement);
//    }

}
