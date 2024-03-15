package tests;

import pages.P01_HomePage;
import pages.P03_LoginPage;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.ExcelReader;

import java.io.IOException;


public class TC02_LoginPageTest extends TestBase{
    P01_HomePage p01HomePage;
    P03_LoginPage p03LoginPage;
    String filePath = "F:\\4-intellij\\labs\\NopCommerce\\File\\RandomData_Excell.xlsx";
    String[] lastRecordedData = ExcelReader.readLastRecordedData(filePath);
    String  email = lastRecordedData[0];
    String password = lastRecordedData[1];

    public TC02_LoginPageTest() throws IOException {
    }

    @Description("Check Login Functionality with valid username and password")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 2,dependsOnMethods = "successfulRegister", alwaysRun = true)
    public void SuccessfulLogin() {

            p01HomePage = new P01_HomePage(driver);
            p01HomePage.clickOnLoginBtn();
            p03LoginPage = new P03_LoginPage(driver);
            p03LoginPage.enterLogin(email, password);
            Assert.assertEquals(driver.findElement(By.xpath("//div[@class='header-links-wrapper']//a[@class='ico-logout']")).getText(),"Log out");
        }



}