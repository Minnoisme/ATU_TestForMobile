package NgocNM5_Assignment.Ass2.Ex4_TiKiApp.Function;

import NgocNM5_Assignment.Ass2.Ex4_TiKiApp.Core.BasePage;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import java.util.List;

public class CommonFunction extends BasePage {
    public CommonFunction(AndroidDriver driver) {
        super(driver);
    }

    public void click(By locator){
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(locator));
        element.click();
    }

    public void click(By locator, int position){
        List<WebElement> elementList = wait.until(ExpectedConditions.visibilityOfAllElements(driver.findElement(locator)));
        elementList.get(position - 1).click();
    }

    public void verifyText(By locator){
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        System.out.println(element.getText());
    }

    public void displayed(By locator){
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(locator));
        element.click();
        Assert.assertTrue(element.isDisplayed());
    }

    public void imageDisplayed(By locator){
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        Assert.assertTrue(element.isEnabled());
    }
}
