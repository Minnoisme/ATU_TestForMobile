package NgocNM5_Assignment.Ass3.Ex4_TiKiApp.Function;

import Day3_Interaction.Tiki_SrcollAndSwipe;
import NgocNM5_Assignment.Ass3.Ex4_TiKiApp.Core.BasePage;
import NgocNM5_Assignment.Ass3.Ex4_TiKiApp.Pages.HomePage;
import NgocNM5_Assignment.Ass3.Ex4_TiKiApp.Utils.Tab;
import io.appium.java_client.android.AndroidDriver;

public class HomePageFunction extends BasePage {

    public HomePageFunction(AndroidDriver driver) {
        super(driver);
    }

    HomePage homePage = new HomePage();
    CommonFunction commonFunction = new CommonFunction(driver);

    public void toBestsellerOfElectronic(){
        commonFunction.click(homePage.menuBar(Tab.HomePage.CATEGORY));
        commonFunction.click(homePage.category(5));
        commonFunction.click(homePage.dropDown);
        commonFunction.click(homePage.dropDownList(2));
    }

    public void toLaptopOfCategory(){
        commonFunction.click(homePage.menuBar(Tab.HomePage.CATEGORY));
        commonFunction.swipeMobileToClick(homePage.crossBorder, 160, 1775, 160, 650);
        commonFunction.swipeMobileToClick(homePage.latopCategory, 1001, 1775, 1001, 650);
        commonFunction.click(homePage.latopCategory);
        commonFunction.click(homePage.laptop);

    }

}
