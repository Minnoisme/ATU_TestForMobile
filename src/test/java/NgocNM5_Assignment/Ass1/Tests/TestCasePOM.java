package NgocNM5_Assignment.Ass1.Tests;

import NgocNM5_Assignment.Ass1.Core.BaseTest;
import NgocNM5_Assignment.Ass1.Function.HomePageFunction;
import NgocNM5_Assignment.Ass1.Function.OnBoardingFunction;
import NgocNM5_Assignment.Ass1.Function.ProductGridFunction;
import NgocNM5_Assignment.Ass1.Function.ProductViewFunction;
import NgocNM5_Assignment.Ass1.Utils.Tab;
import org.testng.annotations.Test;

public class TestCasePOM extends BaseTest {

    @Test(priority = 1)
    public void tc_Exercise1(){
        OnBoardingFunction onBoardingFunction = new OnBoardingFunction(driver);
        HomePageFunction homePageFunction = new HomePageFunction(driver);
        ProductGridFunction productGridFunction = new ProductGridFunction(driver);
        ProductViewFunction productViewFunction = new ProductViewFunction(driver);

        onBoardingFunction.toShopMen();
        homePageFunction.toShoes();
//        productGridFunction.toAProductOfATab(Tab.ProductGrid.LOWEST_PRICE, 1);
        productGridFunction.toAProductOfATab02(Tab.ProductGrid.LOWEST_PRICE);
        productViewFunction.verifyDisplayed("Test GC", "$1–35");
    }

    @Test(priority = 2)
    public void tc_Exercise2(){
        OnBoardingFunction onBoardingFunction = new OnBoardingFunction(driver);
        HomePageFunction homePageFunction = new HomePageFunction(driver);

        onBoardingFunction.toShopMen();
//        homePageFunction.toATab(Tab.HomePage.CATEGORIES);
        homePageFunction.toATab02();
        homePageFunction.verifyDisplayedCategories();

    }

    @Test(priority = 3)
    public void tc_Exercise3(){
        OnBoardingFunction onBoardingFunction = new OnBoardingFunction(driver);
        HomePageFunction homePageFunction = new HomePageFunction(driver);
        ProductGridFunction productGridFunction = new ProductGridFunction(driver);

        onBoardingFunction.toShopMen();
        homePageFunction.toATab(Tab.HomePage.BRANDS);
        homePageFunction.searchBrands("Aer");
        productGridFunction.verifyDisplayGridBrands();
    }
}
