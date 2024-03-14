package tests;

import pages.P01_HomePage;
import org.testng.annotations.Test;

import java.util.Set;
@Test (priority = 1)
class TC09_FollowUs extends TestBase{
    P01_HomePage homePage;
    public void NavigateToFacebook() throws InterruptedException {
        homePage = new P01_HomePage(driver);
        String Main = driver.getWindowHandle();
        homePage.followUs();
        Set<String> AllWindow = driver.getWindowHandles();
        for (String string : AllWindow){
            if (!string.equals(Main)){
                driver.switchTo().window(string);
                    Thread.sleep(10000);
                driver.close();
            }
        }
        driver.switchTo().window(Main);

    }
}
