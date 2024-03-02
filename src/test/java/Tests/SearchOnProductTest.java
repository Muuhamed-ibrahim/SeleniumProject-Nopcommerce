package Tests;

import Pages.P01_HomePage;
import Pages.P05_ResultOfShow;
import org.testng.annotations.Test;

public class SearchOnProductTest extends TestBase{
    P01_HomePage p01HomePage;
    P05_ResultOfShow result;
    @Test(priority = 1)
    public void SearchOnProduct(){
        p01HomePage = new P01_HomePage(driver);
        String nameOfProduct = "mac";
        p01HomePage.SearchOnProduct(nameOfProduct);
    }
    @Test(priority = 2)
    public void SelectProduct(){
        result = new P05_ResultOfShow(driver);
        result.SelectProduct();
    }
}
