package Day2_WebApp;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class HybridTestApp {
    public static AndroidDriver driver;

    @BeforeTest
    public void setup() throws InterruptedException, MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();

        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("platformVersion", "8.1");
        capabilities.setCapability("deviceName", "emulator-5554");

        capabilities.setCapability("appPackage", "com.example.hybridtestapp");
        capabilities.setCapability("appActivity", "com.example.hybridtestapp.MainActivity");
        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    }

    @Test
    public void test() throws InterruptedException {
        System.out.println("testcase 01");
        Thread.sleep(2000);

        String fname = "Minh";

        WebElement firstName = driver.findElement(By.xpath("//android.widget.EditText[@resource-id='fname']"));
//        firstName.sendKeys("Minh");
        firstName.sendKeys(fname);
        Thread.sleep(2000);

        WebElement lastName = driver.findElement(By.xpath("//android.widget.EditText[@resource-id='lname']"));
        lastName.sendKeys("Ngoc");
        Thread.sleep(2000);

        WebElement age = driver.findElement(By.xpath("//android.widget.EditText[@resource-id='age']"));
        age.sendKeys("22");
        Thread.sleep(2000);

        WebElement userName = driver.findElement(By.xpath("//android.widget.EditText[@resource-id='username']"));
        userName.sendKeys("MonMon");
        Thread.sleep(2000);

        WebElement password = driver.findElement(By.xpath("//android.widget.EditText[@resource-id='psw']"));
        password.sendKeys("minhngoc240501");
        Thread.sleep(2000);

        WebElement registerBtn = driver.findElement(By.xpath("//android.widget.Button[@resource-id='register']"));
        registerBtn.click();

        WebElement verifyRegistration = driver.findElement(By.xpath("//android.webkit.WebView/android.view.View"));
        System.out.println(verifyRegistration.getText());

        WebElement verifyFName = driver.findElement(By.xpath("//android.view.View[@text = 'Registration Success!\n" + "Welcome " +  fname + "']"));
        System.out.println(verifyFName.getText());

        Assert.assertEquals(verifyRegistration, verifyFName);
    }
}
