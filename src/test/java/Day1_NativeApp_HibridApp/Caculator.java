package Day1_NativeApp_HibridApp;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class Caculator {
    public static AndroidDriver driver;
    @BeforeTest
    public void setup() throws InterruptedException, MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName", "emulator-5554");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("platformVersion", "8.1");

        capabilities.setCapability("appPackage", "com.google.android.calculator");
        capabilities.setCapability("appActivity", "com.android.calculator2.Calculator");
        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);

    }

    @Test
    public void test() throws InterruptedException {
        System.out.println("testcase 01");
        Thread.sleep(3000);
        WebElement numberFive = driver.findElement(By.id("com.google.android.calculator:id/digit_8"));
        numberFive.click();
        int number = 1;
        WebElement element = driver.findElement(By.id("com.google.android.calculator:id/digit_" + number + ""));
        element.click();


//        public By number(int number)  {return By.id("com.google.android.calculator:id/digit_" + number + "");}
    }

}
