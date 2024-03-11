package Tests;

import Pages.P01_HomePage;
import Pages.P03_LoginPage;
import Pages.P05_ResultOfShow;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.ExcelReader;

public class TC04_SearchOnProductTest extends TestBase{
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
    public void SearchOnProduct(){
        p01HomePage = new P01_HomePage(driver);
        String nameOfProduct = "mac";
        p01HomePage.SearchOnProduct(nameOfProduct);
    }
    @Test(priority = 3, dependsOnMethods = {"SearchOnProduct"})
    public void SelectProduct(){
        result = new P05_ResultOfShow(driver);
        result.SelectProduct();
        p01HomePage.scrollToBottom();
        result.AddToCart();
        Assert.assertEquals((driver.findElement(By.xpath("//div[@class='bar-notification success']//p[@class='content']"))).getText(),"The product has been added to your shopping cart");
        result.CloseAssert();
    }
}
