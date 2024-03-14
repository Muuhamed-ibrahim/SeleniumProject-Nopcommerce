package tests;

import com.github.javafaker.Faker;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.*;
import utilities.ScreenShotError;

import java.util.concurrent.TimeUnit;

public class TestBase {

    protected WebDriver driver;
    static Faker faker = new Faker();

    @BeforeClass
    public void setup (){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
        driver.navigate().to("https://demo.nopcommerce.com/");

    }
//    @AfterMethod
//    public void screenshotOnFailure(ITestResult result){
//        if (result.getStatus() == ITestResult.FAILURE){
//            System.out.println("failed");
//            System.out.println("Taking screenshot");
//            ScreenShotError.captureScreenshot(driver, result.getName());
//
//        }
//
//    }
    @AfterClass
    public void quit(){
        try {
            Thread.sleep(750);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.quit();
    }
}