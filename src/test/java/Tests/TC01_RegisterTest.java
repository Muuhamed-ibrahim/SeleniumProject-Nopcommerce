package Tests;

import Pages.P01_HomePage;
import Pages.P02_RegisterPage;
import org.testng.annotations.Test;
import utilities.SaveFakeData;

public class TC01_RegisterTest extends TestBase{
    P01_HomePage p01HomePage;
    P02_RegisterPage p02RegisterPage;
    SaveFakeData saveFakeData;

    String filePath = "F:\\4-intellij\\labs\\NopCommerce\\File\\random data.txt";
    static String email=faker.internet().emailAddress();
    static String password=faker.internet().password();
    String firstname = faker.name().firstName();
    String lastname = faker.name().lastName();
    String companyName = "iti";
    @Test
public void successfulRegister () {

        saveFakeData.writeToFile(firstname,lastname,email,password, filePath);
        p01HomePage = new P01_HomePage(driver);
        p01HomePage.clickOnRegisterBtn();
        p02RegisterPage = new P02_RegisterPage(driver);
        p02RegisterPage.RegisterCompleted(firstname,lastname,email,companyName,password,password);

    }

}
//Assert.assertTrue(p02RegisterPage.getRegisterDoneText().contains("Your registration completed"));
//registerPage.clickOnContinue();