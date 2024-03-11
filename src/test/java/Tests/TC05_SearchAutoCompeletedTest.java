package Tests;

import Pages.P01_HomePage;
import Pages.P03_LoginPage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.ExcelReader;

public class TC05_SearchAutoCompeletedTest extends TestBase{
    P01_HomePage p01HomePage;
    P03_LoginPage p03_loginPage;
    String nameOfProduct = "mac";
    String filePath = "F:\\4-intellij\\labs\\NopCommerce\\File\\RandomData_Excell.xlsx";
    String [] readLastData = ExcelReader.readLastRecordedData(filePath);
    String Email = readLastData [0];
    String Password = readLastData [1];

    @Test(priority = 1)
    public void LoginSuccessfully(){
        p01HomePage = new P01_HomePage(driver);
        p01HomePage.clickOnLoginBtn();
        p03_loginPage = new P03_LoginPage(driver);
        p03_loginPage.enterLogin(Email,Password);
        Assert.assertEquals(driver.findElement(By.xpath("//div[@class='header-links-wrapper']//a[@class='ico-logout']")).getText(),"Log out");

    }
    @Test(priority = 2, dependsOnMethods = {"LoginSuccessfully"})
    public void SearchOnProductAtuo(){
        try {
            p01HomePage = new P01_HomePage(driver);
            p01HomePage.SearchAuto(nameOfProduct);
        }
        catch (Exception e){
            System.out.println("error" + e.getMessage());
        }

    }

}
