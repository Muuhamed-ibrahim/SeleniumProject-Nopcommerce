package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class P09_CheckoutShippingAddress extends PageBase{
    public P09_CheckoutShippingAddress(WebDriver driver){
        super(driver);
    }
    public void Country() throws InterruptedException {
        WebElement CountryElement = driver.findElement(By.xpath("//div[@class='inputs']//select[@id='BillingNewAddress_CountryId']"));
        Select select = new Select(CountryElement);
        Thread.sleep(500);
        select.selectByIndex(121);
    }
    public void City(String city) throws InterruptedException {
        WebElement CityElement = driver.findElement(By.id("BillingNewAddress_City"));
        Thread.sleep(500);
        inputText(CityElement, city);
    }
    public void Address(String address) throws InterruptedException {
        WebElement AddressElement = driver.findElement(By.id("BillingNewAddress_Address1"));
        Thread.sleep(500);
        inputText(AddressElement, address);
    }
    public void Zip(String zip) throws InterruptedException {
        WebElement ZipElement = driver.findElement(By.id("BillingNewAddress_ZipPostalCode"));
        Thread.sleep(500);
        inputText(ZipElement, zip);
    }
    public void PhoneNumber(String PhoneNumber) throws InterruptedException {
        WebElement PhoneNumberElement = driver.findElement(By.id("BillingNewAddress_PhoneNumber"));
        Thread.sleep(500);
        inputText(PhoneNumberElement, PhoneNumber);
    }
    public void ContinueBtn() throws InterruptedException {
        WebElement ContinueBtnElement = driver.findElement(By.id("billing-buttons-container"));
        Thread.sleep(500);
        clicking(ContinueBtnElement);
    }

}
