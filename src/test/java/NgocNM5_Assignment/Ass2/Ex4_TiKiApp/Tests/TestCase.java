package NgocNM5_Assignment.Ass2.Ex4_TiKiApp.Tests;

import NgocNM5_Assignment.Ass2.Ex4_TiKiApp.Core.BaseTest;
import NgocNM5_Assignment.Ass2.Ex4_TiKiApp.Function.HomePageFunction;
import NgocNM5_Assignment.Ass2.Ex4_TiKiApp.Function.ProductGridFunction;
import NgocNM5_Assignment.Ass2.Ex4_TiKiApp.Function.ProductViewFunction;
import NgocNM5_Assignment.Ass2.Ex4_TiKiApp.Utils.Tab;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TestCase extends BaseTest {

    @Test
    public void test(){
        HomePageFunction homePageFunction = new HomePageFunction(driver);
        ProductGridFunction productGridFunction = new ProductGridFunction(driver);
        ProductViewFunction productViewFunction = new ProductViewFunction(driver);

        System.out.println("testcase01");
        homePageFunction.toLaptopOfCategory();
        productGridFunction.toAProductsOfLaptop();
        productViewFunction.verifyProductInformation();
    }
}
