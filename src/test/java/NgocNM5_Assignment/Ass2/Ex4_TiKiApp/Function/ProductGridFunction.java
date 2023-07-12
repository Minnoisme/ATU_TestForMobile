package NgocNM5_Assignment.Ass2.Ex4_TiKiApp.Function;

import NgocNM5_Assignment.Ass2.Ex4_TiKiApp.Core.BasePage;
import NgocNM5_Assignment.Ass2.Ex4_TiKiApp.Pages.HomePage;
import NgocNM5_Assignment.Ass2.Ex4_TiKiApp.Pages.ProductGirdPage;
import NgocNM5_Assignment.Ass2.Ex4_TiKiApp.Utils.Tab;
import io.appium.java_client.android.AndroidDriver;

public class ProductGridFunction extends BasePage {

    public ProductGridFunction(AndroidDriver driver) {
        super(driver);
    }

    ProductGirdPage productGirdPage = new ProductGirdPage();
    CommonFunction commonFunction = new CommonFunction(driver);

    public void toAProductsOfLaptop(){
        commonFunction.click(productGirdPage.laptop);
        commonFunction.click(productGirdPage.firstProducts);
    }
}
