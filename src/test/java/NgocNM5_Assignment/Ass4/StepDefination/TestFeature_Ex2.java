package Assignment.Ass4.StepDefination;

import Assignment.Ass4.core.GoogleChromBase;
import Assignment.Ass4.function.SearchPageFunction;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.net.MalformedURLException;
import java.util.List;

public class TestFeature_Ex2 extends GoogleChromBase {
    SearchPageFunction searchPageFunction = new SearchPageFunction();
    GoogleChromBase appiumBase = new GoogleChromBase();

    @Given("the user navigates to the Google home page")
    public void the_user_navigates_to_the_google_home_page() throws MalformedURLException, InterruptedException {
        System.out.println("This is steps : the_user_navigates_to_the_google_home_page");
        appiumBase.setup();
    }
    @When("the user entered “panda” at the search bar")
    public void the_user_entered_at_the_search_bar() {
        System.out.println("This is steps : the_user_entered_at_the_search_bar ");
        searchPageFunction.searchText("panda");
    }
    @Then("the results page shows links related to “panda”")
    public void the_results_page_shows_links_related_to_panda() {
        System.out.println("This is steps : the_results_page_shows_links_related_to “panda”");
        searchPageFunction.linkisDisplay();
    }
    @Then("image links for “panda”")
    public void image_links_for_panda() {
        System.out.println("This is steps : image_links_for");
        searchPageFunction.clickMenuBarOfGoogle("HÌNH ẢNH");
    }
    @Then("video links for “panda”")
    public void video_links_for_panda() {
        System.out.println("This is steps : video_links_for");
        searchPageFunction.clickMenuBarOfGoogle("VIDEO");
    }

//    case02
    @Given("a web browser is on the Google page")
    public void a_web_browser_is_on_the_google_page() throws MalformedURLException, InterruptedException {
        System.out.println("This is steps : the_user_navigates_to_the_google_home_page");
        appiumBase.setup();
    }
    @When("the search phrase “panda” is entered")
    public void the_search_phrase_panda_is_entered() {
            System.out.println("This is steps : the_search_phrase_panda_is_entered");
            searchPageFunction.searchText("panda");
    }
    @Then("results for “panda” are shown")
    public void results_for_panda_are_shown() {
            System.out.println("This is steps : results_for_panda_are_shown");
        searchPageFunction.linkisDisplay();
    }
    @Then("the following related results are shown")
    public void the_following_related_results_are_shown(DataTable dataTable) {
        System.out.println("This is steps : the_following_related_results_are_shown");
        List<List<String>> data = dataTable.cells();
        searchPageFunction.searchText(data.get(0).get(0).toString());
        searchPageFunction.searchText(data.get(1).get(0).toString());
        searchPageFunction.searchText(data.get(2).get(0).toString());
        searchPageFunction.searchText(data.get(3).get(0).toString());
    }
}
