package Tests;

import Pages.*;
import org.testng.annotations.Test;

public class EmailToFriendTest extends TestBase {
    P01_HomePage p01HomePage;
    P02_RegisterPage p02RegisterPage;
    P03_LoginPage p03LoginPage;
    P05_ResultOfShow resultOfShow;
    P07_EmailToFriendPage p07EmailToFriendPage;
    P06_ResultOfAutoSearch p06ResultOfAutoSearch;
    @Test(priority = 1)
    public void successfulRegister() {
        p01HomePage = new P01_HomePage(driver);
        p01HomePage.clickOnRegisterBtn();
        p02RegisterPage = new P02_RegisterPage(driver);
        p02RegisterPage.RegisterCompleted("mohamed", "ibrahim",
                "test47@gmail.com", "iti", "123456789", "123456789");
    }

    @Test(priority = 2)
    public void TestLogin() {
        p01HomePage = new P01_HomePage(driver);
        p01HomePage.clickOnLoginBtn();
        p03LoginPage = new P03_LoginPage(driver);
        p03LoginPage.enterLogin("test47@gmail.com", "123456789");
    }

    @Test(priority = 3)
    public void SearchOnProduct() {
        try {
            p01HomePage = new P01_HomePage(driver);
            p01HomePage.SearchAuto("mac");
        } catch (Exception e) {
            System.out.println("error" + e.getMessage());
        }
    }
    @Test(priority = 4)
    public void SendEmailToFriend(){
        p06ResultOfAutoSearch = new P06_ResultOfAutoSearch(driver);
        p01HomePage.scrollToBottom();
        p06ResultOfAutoSearch.EmailToFriend();
        p07EmailToFriendPage = new P07_EmailToFriendPage(driver);
        p07EmailToFriendPage.setFriendMail("iti@test.com","we develop people");
    }
}