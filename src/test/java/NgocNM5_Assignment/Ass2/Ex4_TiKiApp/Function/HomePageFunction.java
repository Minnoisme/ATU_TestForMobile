package NgocNM5_Assignment.Ass2.Ex4_TiKiApp.Function;

import NgocNM5_Assignment.Ass2.Ex4_TiKiApp.Core.BasePage;
import NgocNM5_Assignment.Ass2.Ex4_TiKiApp.Pages.HomePage;
import NgocNM5_Assignment.Ass2.Ex4_TiKiApp.Utils.Tab;
import io.appium.java_client.android.AndroidDriver;
import org.checkerframework.checker.units.qual.C;

public class HomePageFunction extends BasePage {

    public HomePageFunction(AndroidDriver driver) {
        super(driver);
    }

    HomePage homePage = new HomePage();
    CommonFunction commonFunction = new CommonFunction(driver);

    public void toLaptopOfCategory(){
        commonFunction.click(homePage.tab(Tab.HomePage.CATEGORY));
//        commonFunction.click(homePage.menuBar, 24);
        commonFunction.click(homePage.latopCategory);
    }
}
