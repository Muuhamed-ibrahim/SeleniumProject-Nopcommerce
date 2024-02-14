package Tests;

import Pages.HomePage;
import org.testng.annotations.Test;

public class SearchAutoCompeletedTest extends TestBase{
    HomePage homePage;
    String nameOfProduct = "mac";

    @Test
    public void SearchOnProduct(){
        try {
            homePage = new HomePage(driver);
            homePage.SearchAuto(nameOfProduct);
        }
        catch (Exception e){
            System.out.println("error" + e.getMessage());
        }

    }

}
