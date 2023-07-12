package NgocNM5_Assignment.Ass2.Ex1.Function;

import NgocNM5_Assignment.Ass2.Ex1.Core.BasePage;
import NgocNM5_Assignment.Ass2.Ex1.Pages.WebPage;
import io.appium.java_client.android.AndroidDriver;

public class WebPageFunction extends BasePage {

    public WebPageFunction(AndroidDriver driver) {
        super(driver);
    }

    WebPage webPage = new WebPage();
    CommonFunction commonFunction = new CommonFunction(driver);

    public void verifyTitle(String verify){
        commonFunction.verifyTitle(webPage.title, verify);
    }
}
