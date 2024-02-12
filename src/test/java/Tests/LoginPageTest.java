package Tests;

import Pages.HomePage;
import Pages.LoginPage;
import Pages.MyAccountPage;
import Pages.RegisterPage;
import org.testng.annotations.Test;

public class LoginPageTest extends TestBase{
    HomePage homePage;
    LoginPage loginPage;
    MyAccountPage myAccountPage;

    @Test
    public void TestLogin(){
           homePage = new HomePage(driver);
           loginPage = homePage.clickOnLoginBtn();
           loginPage.enterLogin("test39@gmail.com","123456789");
    }

}
