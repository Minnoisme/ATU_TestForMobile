package NgocNM5_Assignment.Ass2.Ex3_HybridApp.Tests;

import NgocNM5_Assignment.Ass2.Ex3_HybridApp.Core.BaseTest;
import NgocNM5_Assignment.Ass2.Ex3_HybridApp.Function.RegistrationFunction;
import org.testng.annotations.Test;

public class TestCase extends BaseTest {

    @Test
    public void tc_Exercise3(){
        RegistrationFunction registrationFunction = new RegistrationFunction(driver);

        registrationFunction.setInformation("Minh", "Ngoc", "22", "MinhMinh245", "minhngoc240501");
        registrationFunction.verifyFName("Minh");
    }
}
