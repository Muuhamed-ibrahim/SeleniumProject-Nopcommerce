package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class P06_ResultOfAutoSearch extends PageBase{
    public P06_ResultOfAutoSearch(WebDriver driver) {
        super(driver);
    }
    public void EmailToFriend() throws InterruptedException {
        WebElement EmailToFriendElement = driver.findElement(By.xpath("//div[@class='email-a-friend']"));
        Thread.sleep(1000);
        clicking(EmailToFriendElement);
        Thread.sleep(1000);
    }
}
