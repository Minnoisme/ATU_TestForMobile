package NgocNM5_Assignment.Ass2.Ex3_HybridApp.Function;

import NgocNM5_Assignment.Ass2.Ex3_HybridApp.Core.BasePage;
import NgocNM5_Assignment.Ass2.Ex3_HybridApp.Pages.RegistrationPage;
import io.appium.java_client.android.AndroidDriver;

public class RegistrationFunction extends BasePage {
    public RegistrationFunction(AndroidDriver driver) {
        super(driver);
    }

    RegistrationPage registrationPage = new RegistrationPage();
    CommonFunction commonFunction = new CommonFunction(driver);

    public void setInformation(String fname, String lname, String age, String username, String psw){
        commonFunction.sendKeys(registrationPage.firstName, fname);
        commonFunction.sendKeys(registrationPage.lastName, lname);
        commonFunction.sendKeys(registrationPage.age, age);
        commonFunction.sendKeys(registrationPage.userName, username);
        commonFunction.sendKeys(registrationPage.password, psw);
        commonFunction.click(registrationPage.registerBtn);
    }

    public void verifyFName(String text){
        commonFunction.verifyRegistration02(registrationPage.verifyRegistration);
        commonFunction.verifyRegistration02(registrationPage.verifyFName(text));
        commonFunction.verify(registrationPage.verifyRegistration, registrationPage.verifyFName(text));
    }

}
