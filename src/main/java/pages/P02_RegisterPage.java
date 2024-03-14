package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class P02_RegisterPage extends PageBase {
    public P02_RegisterPage(WebDriver driver) {
        super(driver);
    }
    public void RegisterCompleted (String fName, String lName,String Email,String CompanyName
                                    ,String Password,String confirmPassword )

    {
        WebElement genderElement = driver.findElement(By.id("gender-male"));
        WebElement fNameElement =  driver.findElement(By.id("FirstName"));
        WebElement lNameElement =  driver.findElement(By.id("LastName"));
        WebElement DayElement = driver.findElement(By.name("DateOfBirthDay"));
        WebElement MonthElement = driver.findElement(By.name("DateOfBirthMonth"));
        WebElement YearElement = driver.findElement(By.name("DateOfBirthYear"));
        WebElement EmailElement =  driver.findElement(By.id("Email"));
        WebElement CompanyNameElement = driver.findElement(By.id("Company"));
        WebElement PasswordElement = driver.findElement(By.id("Password"));
        WebElement confirmPasswordElement = driver.findElement(By.id("ConfirmPassword"));
        WebElement registerButtonElement =  driver.findElement(By.id("register-button"));

        clicking(genderElement);

        inputText(fNameElement, fName);
        inputText(lNameElement, lName);

        selecting(DayElement, 1);
        selecting(MonthElement, 12);
        selecting(YearElement, 30);

        inputText(EmailElement, Email);
        inputText(CompanyNameElement,CompanyName);
        inputText(PasswordElement, Password);
        inputText(confirmPasswordElement, confirmPassword);

        clicking(registerButtonElement);
    }

}
