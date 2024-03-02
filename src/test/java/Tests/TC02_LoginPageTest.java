package Tests;

import Pages.P01_HomePage;
import Pages.P03_LoginPage;
import org.testng.annotations.Test;

import static Tests.TC01_RegisterTest.email;
import static Tests.TC01_RegisterTest.password;


public class TC02_LoginPageTest extends TestBase{
    P01_HomePage p01HomePage;
    P03_LoginPage p03LoginPage;

    @Test
    public void TestLogin(){
           p01HomePage = new P01_HomePage(driver);
           p01HomePage.clickOnLoginBtn();
           p03LoginPage = new P03_LoginPage(driver);
           p03LoginPage.enterLogin(email,password);
    }

}
