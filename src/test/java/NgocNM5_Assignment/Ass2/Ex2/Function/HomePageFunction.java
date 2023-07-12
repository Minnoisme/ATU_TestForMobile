package NgocNM5_Assignment.Ass2.Ex2.Function;

import NgocNM5_Assignment.Ass2.Ex2.Core.BasePage;
import NgocNM5_Assignment.Ass2.Ex2.Pages.HomePage;
import NgocNM5_Assignment.Ass2.Ex2.Pages.ProductGirdPage;
import io.appium.java_client.android.AndroidDriver;

public class HomePageFunction extends BasePage {
    public HomePageFunction(AndroidDriver driver) {
        super(driver);
    }

    HomePage homePage = new HomePage();
    CommonFunction commonFunction = new CommonFunction(driver);

    public void toShpMall(){
        commonFunction.click(homePage.shopeeMall);
    }

    public void toShpMall02(){
        commonFunction.click(homePage.category, 11);
    }
}
