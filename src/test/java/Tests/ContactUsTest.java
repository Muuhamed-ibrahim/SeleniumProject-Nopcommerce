package Tests;

import Pages.P08_ContactUsPage;
import Pages.P01_HomePage;
import org.testng.annotations.Test;

public class ContactUsTest extends TestBase{
    P01_HomePage p01HomePage;
    P08_ContactUsPage p08ContactUsPage;
    String name = "mohamed";
    String email = "test@gmail.com";
    String enquiry = ":D";
    @Test
    public void contactus (){
        p01HomePage = new P01_HomePage(driver);
        p01HomePage.ContactUsBtn();
        p08ContactUsPage = new P08_ContactUsPage(driver);
        p08ContactUsPage.setValuesOfContactus(name,email,enquiry);

    }
}
