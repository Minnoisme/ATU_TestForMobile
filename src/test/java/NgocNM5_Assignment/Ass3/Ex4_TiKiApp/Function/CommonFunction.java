package NgocNM5_Assignment.Ass3.Ex4_TiKiApp.Function;

import NgocNM5_Assignment.Ass3.Ex4_TiKiApp.Core.BasePage;
import NgocNM5_Assignment.Ass3.Ex4_TiKiApp.Core.BaseTest;
import com.google.common.collect.ImmutableList;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import java.time.Duration;
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
        Assert.assertTrue(element.isDisplayed());
    }

    public void swipeMobileToClick(By locator, int startX, int startY, int endX, int endY) {
        for (int i = 0; i <= 10; i++){
            if (driver.findElements(locator).size() != 0)
                break;
            swipe(startX, startY, endX, endY);
        }
    }

    public void swipe(int startx, int starty, int endx, int endy) {
        new TouchAction(driver).longPress(PointOption.point(startx, starty))
                .moveTo(PointOption.point(endx, endy))
                .release().perform();
    }

    // =========== Soft code ==========
    public enum ScrollDirection{
        UP, DOWN, LEFT, RIGHT
    }
    public void scroll(By locator, ScrollDirection scrollDirection, double scrollRatio){
        for(int i = 0; i <= 10; i++) {
            Duration SCROL_DUR = Duration.ofMillis(300);
            if (driver.findElements(locator).size() != 0)
                break;

            // get size of tiki driver
            Dimension size = BaseTest.driver.manage().window().getSize();
            System.out.println(size);
            Point midPoint = new Point((int) (size.width * 0.5), (int) (size.height * 0.5));

            // scroll down
            int bottom = midPoint.y + (int) (midPoint.y * scrollRatio);
            int top = midPoint.y - (int) (midPoint.y * scrollRatio);
            int left = midPoint.x + (int) (midPoint.x * scrollRatio);
            int right = midPoint.x - (int) (midPoint.x * scrollRatio);

            if (scrollDirection == ScrollDirection.UP) {
                swipe02(new Point(midPoint.x, top), new Point(midPoint.x, bottom), SCROL_DUR);
            } else if (scrollDirection == ScrollDirection.DOWN) {
                swipe02(new Point(midPoint.x, bottom), new Point(midPoint.x, top), SCROL_DUR);
            } else if (scrollDirection == ScrollDirection.LEFT) {
                swipe02(new Point(left, midPoint.y), new Point(right, midPoint.y), SCROL_DUR);
            } else {
                swipe02(new Point(right, midPoint.y), new Point(left, midPoint.y), SCROL_DUR);
            }
        }

    }

    public void swipe02(Point start, Point end, Duration duration){
        PointerInput input = new PointerInput(PointerInput.Kind.TOUCH, "finger1");
        Sequence swipe = new Sequence(input, 0);
        swipe.addAction(input.createPointerMove(Duration.ZERO, PointerInput.Origin.viewport(), start.x, start.y));
        swipe.addAction(input.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));

        swipe.addAction(input.createPointerMove(duration, PointerInput.Origin.viewport(), end.x, end.y));
        swipe.addAction(input.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
        ((AppiumDriver) BaseTest.driver).perform(ImmutableList.of(swipe));
    }

}



