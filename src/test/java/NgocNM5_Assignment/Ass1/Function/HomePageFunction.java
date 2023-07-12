package NgocNM5_Assignment.Ass1.Function;

import NgocNM5_Assignment.Ass1.Core.BasePage;
import NgocNM5_Assignment.Ass1.Pages.HomePage;
import NgocNM5_Assignment.Ass1.Utils.Tab;
import io.appium.java_client.android.AndroidDriver;

public class HomePageFunction extends BasePage {

    public HomePageFunction(AndroidDriver driver) {
        super(driver);
    }

    HomePage homePage = new HomePage();
    CommomFunction commomFunction =new CommomFunction(driver);

    public void toShoes(){
        commomFunction.click(homePage.shoesCategory);
    }

    public void toATab(String tabName){
        commomFunction.click(homePage.tab(tabName));
    }

    public void toATab02(){
        commomFunction.click(homePage.tab(Tab.HomePage.CATEGORIES));
    }

    public void verifyDisplayedCategories(){
        commomFunction.isDisplayed(homePage.allMen);
        commomFunction.isDisplayed(homePage.shoes);
        commomFunction.isDisplayed(homePage.bags);
        commomFunction.isDisplayed(homePage.clothing);
        commomFunction.isDisplayed(homePage.grooming);
    }

    public void searchBrands(String brandsName){
        commomFunction.sendKeys(homePage.search,brandsName);
        commomFunction.click(homePage.resultSearch, 1);
    }




}
