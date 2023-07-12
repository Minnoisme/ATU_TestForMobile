package NgocNM5_Assignment.Ass2.Ex3_HybridApp.Function;

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

    public void verifyRegistration02(By locator){
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        System.out.println(element.getText());
    }

    public void verify(By locator1, By locator2){
        WebElement element1 = wait.until(ExpectedConditions.visibilityOfElementLocated(locator1));
        WebElement element2 = wait.until(ExpectedConditions.visibilityOfElementLocated(locator2));
        Assert.assertEquals(element1, element2);
    }

}
