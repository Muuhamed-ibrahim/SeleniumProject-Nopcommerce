package tests;

import pages.P01_HomePage;
import pages.P03_LoginPage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.ExcelReader;

import java.io.IOException;

public class TC04_SearchAutoCompeletedTest extends TestBase{
    P01_HomePage p01HomePage;
    P03_LoginPage p03_loginPage;
    String nameOfProduct = "mac";
    String filePath = "F:\\4-intellij\\labs\\NopCommerce\\File\\RandomData_Excell.xlsx";
    String [] readLastData = ExcelReader.readLastRecordedData(filePath);
    String Email = readLastData [0];
    String Password = readLastData [1];

    public TC04_SearchAutoCompeletedTest() throws IOException {
    }

    @Test(priority = 2,dependsOnMethods = "successfulRegister", alwaysRun = true)
    public void LoginSuccessfully(){
        p01HomePage = new P01_HomePage(driver);
        p01HomePage.clickOnLoginBtn();
        p03_loginPage = new P03_LoginPage(driver);
        p03_loginPage.enterLogin(Email,Password);
        Assert.assertEquals(driver.findElement(By.xpath("//div[@class='header-links-wrapper']//a[@class='ico-logout']")).getText(),"Log out");

    }
    @Test(priority = 3, dependsOnMethods = {"LoginSuccessfully"})
    public void SearchOnProductAuto(){
        try {
            p01HomePage = new P01_HomePage(driver);
            p01HomePage.SearchAuto(nameOfProduct);
        }
        catch (Exception e){
            System.out.println("error" + e.getMessage());
        }

    }

}
