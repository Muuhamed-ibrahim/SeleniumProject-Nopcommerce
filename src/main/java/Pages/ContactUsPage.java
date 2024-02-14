package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ContactUsPage extends PageBase{
    public ContactUsPage(WebDriver driver){
        super(driver);
    }
    WebElement YourNameElement = driver.findElement(By.id("FullName"));
    WebElement YourEmailElement = driver.findElement(By.id("Email"));
    WebElement EnquiryElement = driver.findElement(By.id("Enquiry"));
    WebElement SubmitBtn = driver.findElement(By.xpath("//button[@name='send-email']"));

    public void  setValuesOfContactus(String name, String email, String enquiry){
        scrollToBottom();
        inputText(YourNameElement,name);
        inputText(YourEmailElement,email);
        inputText(EnquiryElement,enquiry);
        clicking(SubmitBtn);
    }
}
