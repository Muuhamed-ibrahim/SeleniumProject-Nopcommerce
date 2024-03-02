package Tests;

import Pages.P01_HomePage;
import org.testng.annotations.Test;

public class SearchAutoCompeletedTest extends TestBase{
    P01_HomePage p01HomePage;
    String nameOfProduct = "mac";

    @Test
    public void SearchOnProduct(){
        try {
            p01HomePage = new P01_HomePage(driver);
            p01HomePage.SearchAuto(nameOfProduct);
        }
        catch (Exception e){
            System.out.println("error" + e.getMessage());
        }

    }

}
