package NgocNM5_Assignment.Ass1.Function;

import NgocNM5_Assignment.Ass1.Core.BasePage;
import NgocNM5_Assignment.Ass1.Pages.ProductGridPage;
import NgocNM5_Assignment.Ass1.Utils.Tab;
import io.appium.java_client.android.AndroidDriver;

public class ProductGridFunction extends BasePage {

    public ProductGridFunction(AndroidDriver driver) {
        super(driver);
    }

    ProductGridPage productGridPage = new ProductGridPage();
    CommomFunction commomFunction = new CommomFunction(driver);

    public void toAProductOfATab(String tabName, int productPosition){
        commomFunction.click(productGridPage.tab(tabName));
        driver.getPageSource();
        commomFunction.click(productGridPage.products, productPosition);
    }

    public void toAProductOfATab02(String tabName){
        commomFunction.click(productGridPage.tab(tabName));
        driver.getPageSource();
        commomFunction.click(productGridPage.products, 1);
    }

    public void verifyDisplayGridBrands(){
        commomFunction.isDisplayed(productGridPage.addToMyBrandsBtn);
        commomFunction.isDisplayed(productGridPage.tab(Tab.ProductGrid.NEWEST));
        commomFunction.isDisplayed(productGridPage.tab(Tab.ProductGrid.ON_SALE));
        commomFunction.isDisplayed(productGridPage.tab(Tab.ProductGrid.LOWEST_PRICE));
    }
}
