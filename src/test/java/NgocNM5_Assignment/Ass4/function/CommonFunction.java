package Assignment.Ass4.function;

import Day4_Cucumber.core.AppiumBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

public class CommonFunction extends AppiumBase {
    public void click(By locator){
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(locator));
        element.click();
    }

    public void sendKeys(By locator, String value){
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(locator));
        element.clear();
        element.sendKeys(value);
    }

    public void isDisplay(By locator){
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        Assert.assertTrue(element.isEnabled());
    }

    public String getText(By locator){
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(locator));
        String text = element.getText();
        return text;
    }

    public void verifyTitle(By locator, String text){
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        Assert.assertEquals(element.getText(), text);
    }
}
