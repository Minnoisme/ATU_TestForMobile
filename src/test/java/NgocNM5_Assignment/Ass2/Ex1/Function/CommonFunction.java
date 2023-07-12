package NgocNM5_Assignment.Ass2.Ex1.Function;

import NgocNM5_Assignment.Ass2.Ex3_HybridApp.Core.BasePage;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

public class CommonFunction extends BasePage {
    public CommonFunction(AndroidDriver driver) {
        super(driver);
    }

    public void sendKeys(By locator, String value){
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(locator));
        element.clear();
        element.sendKeys(value);
    }

    public void click(By locator){
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(locator));
        element.click();
    }

    public void verifyTitle(By locator, String text){
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        Assert.assertEquals(element.getText(), text);
    }

}
