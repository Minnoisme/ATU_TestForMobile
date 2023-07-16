package Assignment.Ass4.core;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class GoogleChromBase {
    public static AndroidDriver driver;
    public static WebDriverWait wait;
    String chromePath = "D:\\Tester_Ngoc\\Automation Tester_FSoft\\Test For Mobile\\chromedriver.exe";

    public void setup() throws InterruptedException, MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
//        capabilities.setCapability(CapabilityType.BROWSER_NAME, "Chrome"); //browser
//        capabilities.setCapability("chromeOptions", ImmutableMap.of("w3c", false));
        capabilities.setCapability("deviceName", "emulator-5554");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("platformVersion", "9.0");

        capabilities.setCapability("browserName", "Chrome");
        capabilities.setCapability("chromedriverExecutable", chromePath);
        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    }
}
