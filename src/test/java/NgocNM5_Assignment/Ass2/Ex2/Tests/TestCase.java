package NgocNM5_Assignment.Ass2.Ex2.Tests;

import NgocNM5_Assignment.Ass2.Ex2.Function.HomePageFunction;
import NgocNM5_Assignment.Ass2.Ex2.Function.ProductGridFunction;
import NgocNM5_Assignment.Ass2.Ex3_HybridApp.Core.BaseTest;
import org.testng.annotations.Test;

public class TestCase extends BaseTest {

    @Test
    public void tc_Exercise2(){
        driver.get("https://shopee.vn/");
        HomePageFunction homePageFunction = new HomePageFunction(driver);
        ProductGridFunction productGridFunction = new ProductGridFunction(driver);

        homePageFunction.toShpMall();
        productGridFunction.toHomeNLife();

        homePageFunction.toShpMall02();
        productGridFunction.toHomeNLife02();


    }
}
