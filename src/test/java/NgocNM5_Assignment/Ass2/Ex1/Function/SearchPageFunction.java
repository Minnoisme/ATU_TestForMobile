package NgocNM5_Assignment.Ass2.Ex1.Function;

import NgocNM5_Assignment.Ass2.Ex1.Core.BasePage;
import NgocNM5_Assignment.Ass2.Ex1.Pages.SearchPage;
import io.appium.java_client.android.AndroidDriver;

public class SearchPageFunction extends BasePage {
    public SearchPageFunction(AndroidDriver driver) {
        super(driver);
    }

    SearchPage searchPage = new SearchPage();
    CommonFunction commonFunction = new CommonFunction(driver);

    public void searchAppium(String text){
        commonFunction.sendKeys(searchPage.textBox, "appium testing");
        commonFunction.click(searchPage.fisrtResult);
    }
}
