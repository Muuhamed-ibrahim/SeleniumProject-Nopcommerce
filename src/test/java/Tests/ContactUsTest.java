package Tests;

import Pages.ContactUsPage;
import Pages.HomePage;
import org.testng.annotations.Test;

public class ContactUsTest extends TestBase{
    HomePage homePage;
    ContactUsPage contactUsPage;
    String name = "mohamed";
    String email = "test@gmail.com";
    String enquiry = ":D";
    @Test
    public void contactus (){
        homePage = new HomePage(driver);
        homePage.ContactUsBtn();
        contactUsPage = new ContactUsPage(driver);
        contactUsPage.setValuesOfContactus(name,email,enquiry);

    }
}
