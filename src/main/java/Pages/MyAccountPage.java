package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage extends PageBase{
    public MyAccountPage(WebDriver driver) {
        super(driver);
    }

    WebElement changePasswordLink = driver.findElement(By.linkText("Change password"));

    WebElement oldPasswordTxt = driver.findElement(By.id("OldPassword"));

    WebElement newPasswordTxt = driver.findElement(By.id("NewPassword"));

    WebElement confirmPasswordTxt = driver.findElement(By.id("ConfirmNewPassword"));

    WebElement ChangePasswordBtn = driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div[2]/div/div[2]/form/div[2]/button"));

//    public WebElement resultLbl = driver.findElement(By.cssSelector("div.result"));

    public void openChangePasswordPage()
    {
        clicking(changePasswordLink);
    }

    public void ChangePassword(String oldpassword, String newpassword) {
        inputText(oldPasswordTxt, oldpassword);
        inputText(newPasswordTxt, newpassword);
        inputText(confirmPasswordTxt, newpassword);
        clicking(ChangePasswordBtn);
    }

}
