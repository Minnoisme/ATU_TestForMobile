package Assignment.Ass4.pages;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;

public class CalculatorPage {
    public By number(String number){
        return By.id("com.google.android.calculator:id/digit_" + number + "");
    }

    public By plus =  By.xpath("//android.widget.Button[@content-desc='plus']");

    public By equal = new AppiumBy.ByAccessibilityId("equals");

    public By result_final = By.id("com.google.android.calculator:id/result_final");

}
