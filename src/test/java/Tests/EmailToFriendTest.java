package Tests;

import Pages.*;
import org.testng.annotations.Test;

public class EmailToFriendTest extends TestBase {
    HomePage homePage ;
    RegisterPage registerPage;
    LoginPage loginPage;
    ResultOfShow resultOfShow;
    EmailToFriendPage emailToFriendPage;
    ResultOfAutoSearch resultOfAutoSearch;
    @Test(priority = 1)
    public void successfulRegister() {
        homePage = new HomePage(driver);
        homePage.clickOnRegisterBtn();
        registerPage = new RegisterPage(driver);
        registerPage.RegisterCompleted("mohamed", "ibrahim",
                "test47@gmail.com", "iti", "123456789", "123456789");
    }

    @Test(priority = 2)
    public void TestLogin() {
        homePage = new HomePage(driver);
        homePage.clickOnLoginBtn();
        loginPage = new LoginPage(driver);
        loginPage.enterLogin("test47@gmail.com", "123456789");
    }

    @Test(priority = 3)
    public void SearchOnProduct() {
        try {
            homePage = new HomePage(driver);
            homePage.SearchAuto("mac");
        } catch (Exception e) {
            System.out.println("error" + e.getMessage());
        }
    }
    @Test(priority = 4)
    public void SendEmailToFriend(){
        resultOfAutoSearch = new ResultOfAutoSearch(driver);
        homePage.scrollToBottom();
        resultOfAutoSearch.EmailToFriend();
        emailToFriendPage = new EmailToFriendPage(driver);
        emailToFriendPage.setFriendMail("iti@test.com","we develop people");
    }
}