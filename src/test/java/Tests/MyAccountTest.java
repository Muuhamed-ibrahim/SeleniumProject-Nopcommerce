package Tests;

import Pages.HomePage;
import Pages.LoginPage;
import Pages.MyAccountPage;
import Pages.RegisterPage;
import org.testng.annotations.Test;

public class MyAccountTest extends TestBase{
    RegisterPage registerPage;
    HomePage homePage;
    LoginPage loginPage;
    MyAccountPage myAccountPage;
    String Fname = "mohamed";
    String Lname = "ibrahim";
    String Email = "test46@gmail.com";
    String Cname = "iti";
    String oldPassword = "123456789";
    String newPassword = "123456";
    @Test(priority = 1)
    public void successfulRegister () {
        homePage = new HomePage(driver);
        registerPage = homePage.clickOnRegisterBtn();
        registerPage.RegisterCompleted(Fname, Lname, Email, Cname, oldPassword, oldPassword);
    }
    @Test(priority = 2)
    public void TestLogin(){
        homePage = new HomePage(driver);
        loginPage = homePage.clickOnLoginBtn();
        loginPage.enterLogin(Email,oldPassword);
    }
    @Test(priority = 3)
    public void changePassword (){
        homePage = new HomePage(driver);
        myAccountPage = homePage.clickOnMyAccountBtn();
        myAccountPage.ChangePassword(oldPassword,newPassword);
    }


}
