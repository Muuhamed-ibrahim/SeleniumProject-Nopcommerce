package Tests;

import Pages.*;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.ExcelReader;

public class TC05_EmailToFriendTest extends TestBase {
    P01_HomePage p01HomePage;
    P03_LoginPage p03LoginPage;
    P07_EmailToFriendPage p07EmailToFriendPage;
    P06_ResultOfAutoSearch p06ResultOfAutoSearch;
    String pathFile = "F:\\4-intellij\\labs\\NopCommerce\\File\\RandomData_Excell.xlsx";
    String [] readLastData = ExcelReader.readLastRecordedData(pathFile);
    String Email = readLastData[0];
    String Password = readLastData[1];

    @Test(priority = 1)
    public void LoginSuccessfully() {
        p01HomePage = new P01_HomePage(driver);
        p01HomePage.clickOnLoginBtn();
        p03LoginPage = new P03_LoginPage(driver);
        p03LoginPage.enterLogin(Email,Password);
        Assert.assertEquals(driver.findElement(By.xpath("//div[@class='header-links-wrapper']//a[@class='ico-logout']")).getText(),"Log out");

    }
    @Test(priority = 2, dependsOnMethods = {"LoginSuccessfully"})
    public void SearchOnProductAutoCompleted() {
        try {
            p01HomePage = new P01_HomePage(driver);
            p01HomePage.SearchAuto("mac");
        } catch (Exception e) {
            System.out.println("error" + e.getMessage());
        }
    }
    @Test(priority = 3, dependsOnMethods = {"SearchOnProductAutoCompleted"})
    public void SendEmailToFriend(){
        p06ResultOfAutoSearch = new P06_ResultOfAutoSearch(driver);
        p06ResultOfAutoSearch.EmailToFriend();
        p07EmailToFriendPage = new P07_EmailToFriendPage(driver);
        p07EmailToFriendPage.setFriendMail("iti@test.com","iti");
        Assert.assertEquals(driver.findElement(By.xpath("//div[@class='page-body']//div[@class='result']")).getText(),"Your message has been sent.");
    }
}