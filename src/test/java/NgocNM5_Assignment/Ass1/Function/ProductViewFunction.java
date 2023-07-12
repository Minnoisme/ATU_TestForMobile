package NgocNM5_Assignment.Ass1.Function;

import NgocNM5_Assignment.Ass1.Core.BasePage;
import NgocNM5_Assignment.Ass1.Pages.ProductViewPage;
import io.appium.java_client.android.AndroidDriver;

public class ProductViewFunction extends BasePage {
    public ProductViewFunction(AndroidDriver driver) {
        super(driver);
    }

    ProductViewPage productViewPage = new ProductViewPage();
    CommomFunction commomFunction = new CommomFunction(driver);

    public void verifyDisplayed(String productName, String productPrice){
        commomFunction.click(productViewPage.noThank);
        commomFunction.verifyText(productViewPage.productName, productName);
        commomFunction.verifyText(productViewPage.productPrice, productPrice);
    }
}
