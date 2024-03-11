package Tests;

import Pages.P01_HomePage;
import Pages.P03_LoginPage;
import Pages.P04_MyAccountPage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.ExcelReader;

public class TC03_MyAccountTest extends TestBase {
    P01_HomePage p01HomePage;
    P03_LoginPage p03LoginPage;
    P04_MyAccountPage p04MyAccountPage;
    String newPassword = "123456";
    String filePath = "F:\\4-intellij\\labs\\NopCommerce\\File\\RandomData_Excell.xlsx";
    String[] lastRecordedData = ExcelReader.readLastRecordedData(filePath);
    String email = lastRecordedData[0];
    String password = lastRecordedData[1];
    @Test(priority = 1)
    public void SuccessfulLogin() {

            p01HomePage = new P01_HomePage(driver);
            p01HomePage.clickOnLoginBtn();
            p03LoginPage = new P03_LoginPage(driver);
            p03LoginPage.enterLogin(email, password);
            Assert.assertEquals(driver.findElement(By.xpath("//div[@class='header-links-wrapper']//a[@class='ico-logout']")).getText(),"Log out");

    }
    @Test(priority = 2, dependsOnMethods = {"SuccessfulLogin"})
    public void clickOnBtnChangePassword() {
        p01HomePage.clickOnMyAccountBtn();
        p04MyAccountPage = new P04_MyAccountPage(driver);
        p04MyAccountPage.clickOnBtnChangePassword();
    }
    @Test(priority = 3, dependsOnMethods = {"clickOnBtnChangePassword"})
    public void ChangePassword() {
        // Change the password
        p04MyAccountPage.ChangePassword(password,newPassword);
    }
}