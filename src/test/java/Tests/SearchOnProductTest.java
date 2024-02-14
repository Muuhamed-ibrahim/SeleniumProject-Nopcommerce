package Tests;

import Pages.HomePage;
import Pages.ResultOfShow;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SearchOnProductTest extends TestBase{
    HomePage homePage;
    ResultOfShow result;
    @Test(priority = 1)
    public void SearchOnProduct(){
        homePage = new HomePage(driver);
        String nameOfProduct = "Apple MacBook Pro 13-inch";
        homePage.SearchOnProduct(nameOfProduct);
    }
    @Test(priority = 2)
    public void SelectProduct(){
        result = new ResultOfShow(driver);
        result.SelectProduct();
    }
}
