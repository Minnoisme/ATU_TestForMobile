package NgocNM5_Assignment.Ass3.Ex4_TiKiApp.Tests;

import NgocNM5_Assignment.Ass3.Ex4_TiKiApp.Core.BaseTest;
import NgocNM5_Assignment.Ass3.Ex4_TiKiApp.Function.HomePageFunction;
import NgocNM5_Assignment.Ass3.Ex4_TiKiApp.Function.ProductGridFunction;
import NgocNM5_Assignment.Ass3.Ex4_TiKiApp.Function.ProductViewFunction;
import org.testng.annotations.Test;

public class TestCase extends BaseTest {

    @Test
    public void tc_Exercise1(){
        HomePageFunction homePageFunction = new HomePageFunction(driver);
        ProductGridFunction productGridFunction = new ProductGridFunction(driver);
        ProductViewFunction productViewFunction = new ProductViewFunction(driver);

        System.out.println("testcase01");
        homePageFunction.toBestsellerOfElectronic();
        productGridFunction.toAProductOfElectronic();
        productViewFunction.verifyProductInformation();
    }

    @Test
    public void tc_Exercise2(){
        HomePageFunction homePageFunction = new HomePageFunction(driver);
        ProductGridFunction productGridFunction = new ProductGridFunction(driver);
        ProductViewFunction productViewFunction = new ProductViewFunction(driver);

        System.out.println("testcase02");
        homePageFunction.toLaptopOfCategory();
        productGridFunction.toAProductsOfLaptop();

    }
}
