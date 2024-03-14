package tests;

import pages.P01_HomePage;
import pages.P02_RegisterPage;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.SaveFakeDataToExcel;

public class TC01_RegisterTest extends TestBase {
    P01_HomePage p01HomePage;
    P02_RegisterPage p02RegisterPage;
    SaveFakeDataToExcel saveFakeDataToExcel;
    String filePath = "F:\\4-intellij\\labs\\NopCommerce\\File\\RandomData_Excell.xlsx";
    static String emailReg = faker.internet().emailAddress();
    static String passwordReg = faker.internet().password();
    String newPassword = faker.internet().password();
    String firstname = faker.name().firstName();
    String lastname = faker.name().lastName();
    String companyName = "iti";

    @Description(" Check Registration Functionality with right data")
    @Severity(SeverityLevel.CRITICAL)
    @Test
    public void successfulRegister()  {
        saveFakeDataToExcel.writeToFile(firstname, lastname, emailReg, passwordReg,newPassword,filePath);
        p01HomePage = new P01_HomePage(driver);
        p01HomePage.clickOnRegisterBtn();
        p02RegisterPage = new P02_RegisterPage(driver);
        p02RegisterPage.RegisterCompleted(firstname, lastname, emailReg, companyName, passwordReg, passwordReg);
        Assert.assertEquals((driver.findElement(By.xpath("//div[@class='page-body']//div[@class='result']"))).getText(),"Your registration completed");
    }
}
