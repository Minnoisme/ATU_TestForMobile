package Assignment.Ass4.function;

import Assignment.Ass4.core.GoogleChromBase;
import Assignment.Ass4.pages.SearchPage;

public class SearchPageFunction extends GoogleChromBase {

    SearchPage searchPage = new SearchPage();
    CommonFunction commonFunction = new CommonFunction();

    public void searchText(String text){
        commonFunction.click(searchPage.googleLogo);
        System.out.println("Google Logo is display");
        commonFunction.sendKeys(searchPage.textBox, text);
    }

    public void linkisDisplay(){
        commonFunction.isDisplay(searchPage.resultsPage);
        System.out.println("Links related to “panda” are shown on the results page.");
    }

    public void clickMenuBarOfGoogle(String text){
        commonFunction.click(searchPage.menuBar(text));
    }

    public void imagesPandaAreShown(){
        commonFunction.isDisplay(searchPage.imageResults);
    }
}
