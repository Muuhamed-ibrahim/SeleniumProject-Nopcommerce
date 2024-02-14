package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ResultOfAutoSearch extends PageBase{
    public ResultOfAutoSearch(WebDriver driver) {
        super(driver);
    }
    WebElement EmailToFriendElement = driver.findElement(By.xpath("//div[@class='email-a-friend']"));
    public void EmailToFriend(){
        clicking(EmailToFriendElement);
    }
}
