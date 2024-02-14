package Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import utilities.Helper;

import java.util.concurrent.TimeUnit;

public class TestBase {

    protected WebDriver driver;

    @BeforeSuite
    @Parameters({"browser"})
    public void setup (@Optional("chrome") String browserName){
        if (browserName.equalsIgnoreCase("edge"))
        {
            driver = new EdgeDriver();
        }
        else if (browserName.equalsIgnoreCase("firefox"))
        {
            driver = new FirefoxDriver();
        }
        else if (browserName.equalsIgnoreCase("chrome"))
        {
            driver = new ChromeDriver();
        }
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(3200, TimeUnit.SECONDS);
        driver.navigate().to("https://demo.nopcommerce.com/");

}
    //take screenshot when test case failed and add it in the screenshot folder
    @AfterMethod
    public void screenshotOnFailure(ITestResult result){
        if (result.getStatus() == ITestResult.FAILURE){
            System.out.println("failed");
            System.out.println("Taking screenshot");
            Helper.captureScreenshot(driver, result.getName());
        }

    }
}
