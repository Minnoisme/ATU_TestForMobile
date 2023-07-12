package NgocNM5_Assignment.Ass3.Ex4_TiKiApp.Pages;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;

import static NgocNM5_Assignment.Ass3.Ex4_TiKiApp.Core.BasePage.driver;

public class HomePage {
    public By menuBar(String tabName){
        return new AppiumBy.ByAccessibilityId(tabName);
    }

    // At Category
    public By category(int position){
        return By.xpath("//androidx.recyclerview.widget.RecyclerView[2]/android.view.ViewGroup" +
                "/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[" + position + "]");
    }

    public By leftCategory(int position){
        return By.xpath("//android.view.ViewGroup/android.view.ViewGroup/" +
                "androidx.recyclerview.widget.RecyclerView[1]/android.view.ViewGroup[" + position + "]");
    }

    public By dropDown = By.id("vn.tiki.app.tikiandroid.productList:id/ivSortToggle");

    public By dropDownList(int position){
        return  By.xpath("//android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/" +
                "android.view.ViewGroup[" + position + "]");
    }

    public By latopCategory = By.xpath("//android.view.ViewGroup[9]");

}
