package NgocNM5_Assignment.Ass2.Ex1.Tests;

import NgocNM5_Assignment.Ass2.Ex1.Function.SearchPageFunction;
import NgocNM5_Assignment.Ass2.Ex1.Function.WebPageFunction;
import NgocNM5_Assignment.Ass2.Ex3_HybridApp.Core.BaseTest;
import NgocNM5_Assignment.Ass2.Ex3_HybridApp.Function.RegistrationFunction;
import org.testng.annotations.Test;

public class TestCase extends BaseTest {

    @Test
    public void tc_Exercise1(){
        driver.get("https://www.google.com/");
        SearchPageFunction searchPageFunction = new SearchPageFunction(driver);
        WebPageFunction webPageFunction = new WebPageFunction(driver);

        searchPageFunction.searchAppium("appium testing");
        webPageFunction.verifyTitle("Appium: Mobile App Automation Made Awesome.");
    }
}
