package NgocNM5_Assignment.Ass1.Pages;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;

public class ProductGridPage {
    public By tab(String tabName){
        return new AppiumBy.ByAccessibilityId(tabName);
    }

    public By products = By.id("com.shopstyle:id/layout");
    public By addToMyBrandsBtn = By.id("com.shopstyle:id/linAddToBrand");

}
