package NgocNM5_Assignment.Ass1.Function;

import NgocNM5_Assignment.Ass1.Core.BasePage;
import NgocNM5_Assignment.Ass1.Pages.OnBoardingPage;
import io.appium.java_client.android.AndroidDriver;

public class OnBoardingFunction extends BasePage {
    public OnBoardingFunction(AndroidDriver driver){
        super(driver);
    }

    OnBoardingPage onBoardingPage = new OnBoardingPage();
    CommomFunction commomFunction = new CommomFunction(driver);

    public void toShopMen(){
        commomFunction.click(onBoardingPage.notNowBtn);
        commomFunction.click(onBoardingPage.shopMen);
    }
}
