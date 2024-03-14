package tests;

import pages.P01_HomePage;
import pages.P03_LoginPage;
import pages.P05_ResultOfShow;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.ExcelReader;

public class TC03_SearchOnProductTest extends TestBase{
    P01_HomePage p01HomePage;
    P05_ResultOfShow result;
    P03_LoginPage p03LoginPage;
    String filePath = "F:\\4-intellij\\labs\\NopCommerce\\File\\RandomData_Excell.xlsx";
    String [] lastRecordData = ExcelReader.readLastRecordedData(filePath);
    String Email = lastRecordData[0];
    String Password = lastRecordData[1];

    @Test(priority = 1)
    public void LoginSuccessful(){
        p01HomePage = new P01_HomePage(driver);
        p01HomePage.clickOnLoginBtn();
        p03LoginPage = new P03_LoginPage(driver);
        p03LoginPage.enterLogin(Email,Password);
        Assert.assertEquals(driver.findElement(By.xpath("//div[@class='header-links-wrapper']//a[@class='ico-logout']")).getText(),"Log out");

    }
    @Test(priority = 2, dependsOnMethods = {"LoginSuccessful"})
    public void SearchOnProduct() throws InterruptedException {
        p01HomePage = new P01_HomePage(driver);
        String nameOfProduct = "mac";
        p01HomePage.SearchOnProduct(nameOfProduct);
    }
    @Test(priority = 3, dependsOnMethods = {"SearchOnProduct"})
    public void SelectProduct() throws InterruptedException {
        result = new P05_ResultOfShow(driver);
        result.SelectProduct();
    }
}
