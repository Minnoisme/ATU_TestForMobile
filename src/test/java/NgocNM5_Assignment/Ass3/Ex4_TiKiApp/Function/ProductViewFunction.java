package NgocNM5_Assignment.Ass3.Ex4_TiKiApp.Function;

import NgocNM5_Assignment.Ass3.Ex4_TiKiApp.Core.BasePage;
import NgocNM5_Assignment.Ass3.Ex4_TiKiApp.Pages.ProductViewPage;
import io.appium.java_client.android.AndroidDriver;

public class ProductViewFunction extends BasePage {
    public ProductViewFunction(AndroidDriver driver) {
        super(driver);
    }

    ProductViewPage productViewPage = new ProductViewPage();
    CommonFunction commonFunction = new CommonFunction(driver);

    public void verifyProductInformation(){
        commonFunction.verifyText(productViewPage.name);
        commonFunction.verifyText(productViewPage.price);
        commonFunction.imageDisplayed(productViewPage.image);
    }
}
