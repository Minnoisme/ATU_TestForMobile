package Day2_WebApp;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class WebApp {
    public static AndroidDriver driver;
    String chromePath = "D:\\Tester_Ngoc\\Automation Tester_FSoft\\Test For Mobile\\chromedriver.exe";
    @BeforeTest
    public void setup() throws InterruptedException, MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
//        capabilities.setCapability(CapabilityType.BROWSER_NAME, "Chrome"); //browser
//        capabilities.setCapability("chromeOptions", ImmutableMap.of("w3c", false));
        capabilities.setCapability("deviceName", "emulator-5554");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("platformVersion", "8.1");

        capabilities.setCapability("browserName", "Chrome");
        capabilities.setCapability("chromedriverExecutable", chromePath);
        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

    }

    @Test
    public void test() throws InterruptedException {
        System.out.println("testcase 01");
        driver.get("https://www.google.com/");
        Thread.sleep(2000);
        WebElement element = driver.findElement(By.name("q"));
        element.sendKeys("”appium testing", Keys.ENTER);
        Thread.sleep(2000);

    }

}
