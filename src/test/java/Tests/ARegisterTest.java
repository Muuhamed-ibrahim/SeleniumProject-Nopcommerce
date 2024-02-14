package Tests;

import Pages.HomePage;
import Pages.RegisterPage;
import org.testng.annotations.Test;

public class ARegisterTest extends TestBase{
    HomePage homePage;
    RegisterPage registerPage;

    @Test
public void successfulRegister (){
        homePage = new HomePage(driver);
        homePage.clickOnRegisterBtn();
        registerPage = new RegisterPage(driver);
        registerPage.RegisterCompleted ("Mohamed","ibrahem"
                ,"test41@gmail.com", "iti",
                "123456789","123456789");
        //Assert.assertTrue(registerPage.registerDone.getText().contains("Your registration completed"));
        //registerPage.clickOnContinue();
    }

}
