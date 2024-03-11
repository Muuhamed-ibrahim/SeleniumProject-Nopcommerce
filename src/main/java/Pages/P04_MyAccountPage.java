package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class P04_MyAccountPage extends PageBase{
    public P04_MyAccountPage(WebDriver driver) {
        super(driver);
    }

//    public WebElement resultLbl = driver.findElement(By.cssSelector("div.result"));

    public void clickOnBtnChangePassword(){
        WebElement changePasswordLink = driver.findElement(By.xpath("//li[@class='change-password inactive']"));
        clicking(changePasswordLink);
    }
    public void ChangePassword(String oldPassword, String newPassword) {

        WebElement oldPasswordTxt = driver.findElement(By.id("OldPassword"));
        WebElement newPasswordTxt = driver.findElement(By.id("NewPassword"));
        WebElement confirmPasswordTxt = driver.findElement(By.id("ConfirmNewPassword"));
        WebElement ChangePasswordBtn = driver.findElement(By.xpath("//button[@class='button-1 change-password-button']"));

        inputText(oldPasswordTxt, oldPassword);
        inputText(newPasswordTxt, newPassword);
        inputText(confirmPasswordTxt, newPassword);
        clicking(ChangePasswordBtn);
    }

}
