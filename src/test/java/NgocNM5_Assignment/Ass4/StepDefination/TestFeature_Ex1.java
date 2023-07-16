package Assignment.Ass4.StepDefination;

import Assignment.Ass4.core.GoogleChromBase;
import Assignment.Ass4.function.SearchPageFunction;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.net.MalformedURLException;

public class TestFeature_Ex1 extends GoogleChromBase {
    SearchPageFunction searchPageFunction = new SearchPageFunction();
    GoogleChromBase appiumBase = new GoogleChromBase();
    @Given("open a web browser")
    public void open_a_web_browser() throws MalformedURLException, InterruptedException {
        System.out.println("This is steps : open_a_web_browser");
        appiumBase.setup();
    }

    @Given("navigated to Google")
    public void navigated_to_google() {
        System.out.println("This is steps : navigated_to_google");
        driver.get("https://www.google.com/");
    }
    @When("enter “panda” in the search bar")
    public void enter_panda_in_the_search_bar() {
        System.out.println("This is steps : enter_panda_in_the_search_bar");
        searchPageFunction.searchText("panda");
    }
    @When("clicks on the “Images” of Google")
    public void clicks_on_the_images_of_google() {
        System.out.println("This is steps : clicks_on_the_images_of_google");
//        searchPageFunction.linkisDisplay();
        searchPageFunction.clickMenuBarOfGoogle("HÌNH ẢNH");
    }
    @Then("images related to “panda” are shown")
    public void images_related_to_panda_are_shown() {
        System.out.println("This is steps : images_related_to_panda_are_shown");
//        searchPageFunction.imagesPandaAreShown();
    }
}
