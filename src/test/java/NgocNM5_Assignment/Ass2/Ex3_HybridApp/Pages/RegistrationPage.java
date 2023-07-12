package NgocNM5_Assignment.Ass2.Ex3_HybridApp.Pages;

import NgocNM5_Assignment.Ass2.Ex3_HybridApp.Core.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class RegistrationPage {
    public By firstName = By.xpath("//android.widget.EditText[@resource-id='fname']");

    public By lastName = By.xpath("//android.widget.EditText[@resource-id='lname']");

    public By age = By.xpath("//android.widget.EditText[@resource-id='age']");

    public By userName = By.xpath("//android.widget.EditText[@resource-id='username']");

    public By password = By.xpath("//android.widget.EditText[@resource-id='psw']");

    public By registerBtn = By.xpath("//android.widget.Button[@resource-id='register']");

    public By verifyRegistration = By.xpath("//android.view.View[text(),'Registration Success!']");

    public By verifyRegistration02 = By.xpath("//android.webkit.WebView/android.view.View");

    public By verifyFName(String fname){
        return By.xpath("//android.view.View[@text = 'Registration Success!\n" + "Welcome " +  fname + "']");
    }

}
