package Assignment.Ass4.pages;

import org.openqa.selenium.By;

public class SearchPage {
    public By textBox = By.name("q");

    public By googleLogo = By.id("hplogo");

    public By resultsPage = By.id("main");

    public By menuBar(String text){
        return By.xpath("//android.view.View[@text='" + text + "']");
    }

    public By fisrtResult = By.xpath("//android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View[12]");

    public By imageResults = By.xpath("//android.view.View[@resource-id='uGbavf']");

}
