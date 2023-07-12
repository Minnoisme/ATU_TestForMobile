package NgocNM5_Assignment.Ass1.Pages;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;

public class HomePage {
    public By notNowBtn = By.id("com.shopstyle:id/skipText");
    public By shoesCategory = new AppiumBy.ByAccessibilityId("Shoes");

    public By tab(String tabName){
        return new AppiumBy.ByAccessibilityId(tabName);
    }

    public By allMen = By.xpath("//android.widget.TextView[contains(@text, 'All Men')]");
    public By clothing = By.xpath("//android.widget.TextView[contains(@text, 'Clothing')]");
    public By bags = By.xpath("//android.widget.TextView[contains(@text, 'Bags')]");
    public By shoes = By.xpath("//android.widget.TextView[contains(@text, 'Shoes')]");
    public By accessories = By.xpath("//android.widget.TextView[contains(@text, 'Accessories')]");
    public By grooming = By.xpath("//android.widget.TextView[contains(@text, 'Grooming')]");

    public By search = By.id("com.shopstyle:id/search_src_text");
    public By resultSearch = By.id("com.shopstyle:id/filterName");

}
