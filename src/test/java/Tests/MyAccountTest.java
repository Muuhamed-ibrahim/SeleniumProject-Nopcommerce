package Tests;

import Pages.P01_HomePage;
import Pages.P03_LoginPage;
import Pages.P04_MyAccountPage;
import Pages.P02_RegisterPage;
import org.testng.annotations.Test;

public class MyAccountTest extends TestBase{
    P02_RegisterPage p02RegisterPage;
    P01_HomePage p01HomePage;
    P03_LoginPage p03LoginPage;
    P04_MyAccountPage p04MyAccountPage;
    String Fname = "mohamed";
    String Lname = "ibrahim";
    String Email = "test48@gmail.com";
    String Cname = "iti";
    String oldPassword = "123456789";
    String newPassword = "123456";
    @Test(priority = 1)
    public void successfulRegister () {
        p01HomePage = new P01_HomePage(driver);
        p01HomePage.clickOnRegisterBtn();
        p02RegisterPage = new P02_RegisterPage(driver);
        p02RegisterPage.RegisterCompleted(Fname, Lname, Email, Cname, oldPassword, oldPassword);
    }
//    @Test(priority = 2)
//    public void TestLogin(){
//        p01HomePage = new P01_HomePage(driver);
//        p01HomePage.clickOnLoginBtn();
//        p03LoginPage = new P03_LoginPage(driver);
//        p03LoginPage.enterLogin(Email,oldPassword);
//    }
//    @Test(priority = 3)
//    public void changePassword (){
//        p01HomePage = new P01_HomePage(driver);
//        p01HomePage.clickOnMyAccountBtn();
//        p04MyAccountPage = new P04_MyAccountPage(driver);
//        p04MyAccountPage.ChangePassword(oldPassword,newPassword);
//    }


}
