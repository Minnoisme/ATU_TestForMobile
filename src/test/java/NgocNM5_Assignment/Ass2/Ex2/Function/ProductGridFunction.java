package NgocNM5_Assignment.Ass2.Ex2.Function;

import NgocNM5_Assignment.Ass2.Ex2.Core.BasePage;
import NgocNM5_Assignment.Ass2.Ex2.Pages.ProductGirdPage;
import io.appium.java_client.android.AndroidDriver;

public class ProductGridFunction extends BasePage {
    public ProductGridFunction(AndroidDriver driver) {
        super(driver);
    }

    ProductGirdPage productGirdPage = new ProductGirdPage();
    CommonFunction commonFunction = new CommonFunction(driver);

    public void toHomeNLife(){
        commonFunction.click(productGirdPage.homeNLife);
        commonFunction.click(productGirdPage.firstProduct);
    }

    public void toHomeNLife02(){
        commonFunction.click(productGirdPage.homeNLife);
        commonFunction.click(productGirdPage.firstProduct);
    }
}
