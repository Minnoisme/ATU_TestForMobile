package Day3_Interaction;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.offset.ElementOption;
import io.appium.java_client.touch.offset.PointOption;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class Tiki {
    public static AndroidDriver driver;

    @BeforeMethod
    public void setup() throws InterruptedException, MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName", "emulator-5554");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("platformVersion", "8.1");

        capabilities.setCapability("appPackage", "vn.tiki.app.tikiandroid");
        capabilities.setCapability("appActivity", "vn.tiki.app.tikiandroid.ui.SplashActivity");
        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    }

    @Test
    public void test() throws InterruptedException, IOException {
        System.out.println("testcase 01");
        Thread.sleep(3000);

        WebElement menu = driver.findElement(By.xpath("//android.widget.FrameLayout[@content-desc='Danh mục']"));
        WebElement notification = driver.findElement(By.id("vn.tiki.app.tikiandroid:id/navNotifications"));
        notification.click();

        // Tap Mobile Elements: 2 ways: using an element and using x,y coordinates
        // 1. Tab by using an element
        System.out.println("Tab by using an element");
        TouchAction action = new TouchAction(driver);
        action.tap(TapOptions.tapOptions().withElement(ElementOption.element(menu))).perform();

        // 2. Tab by using x,y coordinates
        System.out.println("Tab by using x,y coordinates");
        action.tap(PointOption.point(1191, 2265)).perform();

        // 3. Long press: touch and hold
        System.out.println("Long press: touch and hold");
        action.longPress(PointOption.point(381, 2328)).perform();

        // 4. Swipe and Scroll
        System.out.println("Swipe and Scroll");
        swipe(12, 15, 50, 60);

        // 5. Capturing screenshots
        System.out.println("Capturing screenshots");
        capturingScreenshots("tiki");

    }

    @Test
    public void testcase2() throws InterruptedException, IOException {
        System.out.println("testcase 01");
        Thread.sleep(3000);

        WebElement notification = driver.findElement(By.id("vn.tiki.app.tikiandroid:id/navNotifications"));
        notification.click();

        driver.currentActivity();
        System.out.println("Confirm If App is launched: " + driver.currentActivity());

        driver.closeApp();
        System.out.println("Close the App: ");

        driver.launchApp();
        System.out.println("Launch the App again: ");

        driver.removeApp("vn.tiki.app.tikiandroid");
        System.out.println("Remove App");
        capturingScreenshots("removeApp");

        String path = "D:\\Tester_Ngoc\\Automation Tester_FSoft\\Test For Mobile\\Apk\\Tiki.apk";
        driver.installApp(path);
        System.out.println("Install App again");

        driver.isAppInstalled("vn.tiki.app.tikiandroid");
        System.out.println("Check If App is installed");
    }

    public void swipe(int startx, int starty, int endx, int endy) {
        new TouchAction(driver).longPress(PointOption.point(startx, starty))
                .moveTo(PointOption.point(endx, endy))
                .release().perform();
    }

    public void swipeMobileUp() {
        Dimension size = driver.manage().window().getSize();
        int starty = (int) (size.height * 0.8);
        int endy = (int) (size.height * 0.2);
        int startx = size.width / 2;
        swipe(startx, starty, startx, endy);
    }
    public void swipeMobileDown() {
        Dimension size = driver.manage().window().getSize();
        int starty = (int) (size.height * 0.8);
        int endy = (int) (size.height * 0.2);
        int startx = size.width / 2;
        swipe(startx, endy, startx, starty);
    }
    public void rightLeftSwipe() {
        Dimension size = driver.manage().window().getSize();
        int startx = (int) (size.width * 0.90);
        int endx = (int) (size.width * 0.10);
        int starty = size.height / 2;
        swipe(startx, starty, endx, starty);

    }
    public void leftRightSwipe() {
        Dimension size = driver.manage().window().getSize();
        int startx = (int) (size.width * 0.90);
        int endx = (int) (size.width * 0.10);
        int starty = size.height / 2;
        swipe(endx, starty, startx, starty);
    }

    // 5. Capturing screenshots
    public void capturingScreenshots(String name) throws IOException {
        File screenShot = driver.getScreenshotAs(OutputType.FILE);
        File location = new File("screenshots");
        String screenShotName = location.getAbsolutePath() + File.separator + name + ".png";
        FileUtils.copyFile(screenShot, new File(screenShotName));
    }
}
