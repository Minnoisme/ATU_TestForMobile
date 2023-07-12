package NgocNM5_Assignment.Ass3.Ex4_TiKiApp.Function;

import NgocNM5_Assignment.Ass3.Ex4_TiKiApp.Core.BasePage;
import NgocNM5_Assignment.Ass3.Ex4_TiKiApp.Pages.ProductGirdPage;
import io.appium.java_client.android.AndroidDriver;

public class ProductGridFunction extends BasePage {

    public ProductGridFunction(AndroidDriver driver) {
        super(driver);
    }

    ProductGirdPage productGirdPage = new ProductGirdPage();
    CommonFunction commonFunction = new CommonFunction(driver);

    public void toAProductOfElectronic(){
        commonFunction.click(productGirdPage.products(2));
    }

    public void toAProductsOfLaptop(){
        commonFunction.click(productGirdPage.products(3));
    }
}
