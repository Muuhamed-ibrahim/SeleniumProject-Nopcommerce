package tests;

import pages.P03_LoginPage;
import pages.P01_HomePage;
import pages.P05_ResultOfShow;
import pages.P08_ShoppingCart;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.ExcelReader;

public class TC06_AddToShoppingCart extends TestBase{
    P01_HomePage p01HomePage; P03_LoginPage p03_loginPage; P05_ResultOfShow result;
    P08_ShoppingCart p08_shoppingCart;
    String nameOfProduct = "mac";
    String filePath = "F:\\4-intellij\\labs\\NopCommerce\\File\\RandomData_Excell.xlsx";
    String [] readLastData = ExcelReader.readLastRecordedData(filePath);
    String Email = readLastData [0]; String Password = readLastData [1];
    @Test(priority = 1)
    public void LoginSuccessfully(){
        p01HomePage = new P01_HomePage(driver);
        p01HomePage.clickOnLoginBtn();
        p03_loginPage = new P03_LoginPage(driver);
        p03_loginPage.enterLogin(Email,Password);
        Assert.assertEquals(driver.findElement(By.xpath("//div[@class='header-links-wrapper']//a[@class='ico-logout']")).getText(),"Log out");

    }
    @Test(priority = 2, dependsOnMethods = {"LoginSuccessfully"})
    public void SearchOnProduct(){
        try {
            p01HomePage = new P01_HomePage(driver);
            p01HomePage.SearchAuto(nameOfProduct);
            Thread.sleep(1000);
        }
        catch (Exception e){
            System.out.println("error" + e.getMessage());
        }

    }
    @Test(priority = 3, dependsOnMethods = {"SearchOnProduct"})
    public void SelectProduct() throws InterruptedException {
        result = new P05_ResultOfShow(driver);
        result.AddToCart();
        Thread.sleep(1000);
        Assert.assertEquals((driver.findElement(By.xpath("//div[@class='bar-notification success']//p[@class='content']"))).getText(),"The product has been added to your shopping cart");
        result.CloseAssert();
    }
}
