package Tests;

import Pages.*;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.ExcelReader;

public class TC08_BuyProduct extends TestBase{
    P01_HomePage p01HomePage; P03_LoginPage p03_loginPage; P08_ShoppingCart p08_shoppingCart;
    P09_CheckoutShippingAddress address; P10_ChechoutShippingMethod ShippingMethod;
    P11_CheckoutPaymentMethod paymentMethod; P12_CheckoutPaymentInfo paymentInfo;
    P13_ConfirmOrderPage confirmOrderPage;
    String filePath = "F:\\4-intellij\\labs\\NopCommerce\\File\\RandomData_Excell.xlsx";
    String [] readLastData = ExcelReader.readLastRecordedData(filePath);
    String Email = readLastData [0]; String Password = readLastData [1];
    String City = "Cairo"; String Address = "Egypt"; String Zip = "334422"; String phoneNumber = "123456789";
    @Test(priority = 1)
    public void LoginSuccessfully(){
        p01HomePage = new P01_HomePage(driver);
        p01HomePage.clickOnLoginBtn();
        p03_loginPage = new P03_LoginPage(driver);
        p03_loginPage.enterLogin(Email,Password);
        Assert.assertEquals(driver.findElement(By.xpath("//div[@class='header-links-wrapper']//a[@class='ico-logout']")).getText(),"Log out");

    }
    @Test(priority = 2, dependsOnMethods ={"LoginSuccessfully"})
    public void BuyProduct() {
        p01HomePage.ShoppingCartBtn();
        p08_shoppingCart = new P08_ShoppingCart(driver);
        p08_shoppingCart.CheckoutBtn();
    }
    @Test(priority = 3, dependsOnMethods = {"BuyProduct"})
    public void CompleteTypes () {
    address = new P09_CheckoutShippingAddress(driver);
    address.Country();
    address.City(City);
    address.Address(Address);
    address.Zip(Zip);
    address.PhoneNumber(phoneNumber);
    address.ContinueBtn();
    ShippingMethod = new P10_ChechoutShippingMethod(driver);
    ShippingMethod.ContinueBtn();
    paymentMethod = new P11_CheckoutPaymentMethod(driver);
    paymentMethod.CreditCardBtn();
    paymentMethod.ContinueBtn();
    }
    @Test(priority = 4, dependsOnMethods = {"CompleteTypes"})
    public void CompletePaymentInfo () {
        paymentInfo = new P12_CheckoutPaymentInfo(driver);
        paymentInfo.CardholderName("Amex");
        paymentInfo.CardNumber("374245455400126");
        paymentInfo.ExpirationDate();
        paymentInfo.CardCode("123");
        paymentInfo.ContinueBtn();
        confirmOrderPage = new P13_ConfirmOrderPage(driver);
        confirmOrderPage.ContinueBtn();
    }


}
