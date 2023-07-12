package NgocNM5_Assignment.Ass1.Function;

import NgocNM5_Assignment.Ass1.Core.BasePage;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import java.util.List;

public class CommomFunction extends BasePage {

    public CommomFunction(AndroidDriver driver){
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

    public void verifyText(By locator, String text){
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        Assert.assertEquals(element.getText(), text);
    }

    public void isDisplayed(By locator){
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(locator));
        Assert.assertTrue(element.isDisplayed());
    }

    public void sendKeys(By locator, String value){
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(locator));
        element.clear();
        element.sendKeys(value);
    }
}
