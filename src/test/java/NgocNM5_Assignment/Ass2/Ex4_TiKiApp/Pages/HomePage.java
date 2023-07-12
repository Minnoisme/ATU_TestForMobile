package NgocNM5_Assignment.Ass2.Ex4_TiKiApp.Pages;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;

public class HomePage {
    public By tab(String tabName){
        return new AppiumBy.ByAccessibilityId(tabName);
    }

    public By menuBar = By.xpath("//android.widget.FrameLayout");

    public By categories = By.xpath("//android.widget.FrameLayout[@content-desc='Danh mục']/android.widget.ImageView");

    public By category = By.xpath("//androidx.recyclerview.widget.RecyclerView[2]/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup");

    public By latopCategory = By.xpath("//android.view.ViewGroup[9]");

}
