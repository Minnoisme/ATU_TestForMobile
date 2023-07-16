package Assignment.Ass4.StepDefination;

import Assignment.Ass4.core.GoogleChromBase;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestFeature_Ex3 extends GoogleChromBase {

    @Given("a level is started")
    public void a_level_is_started() {
        System.out.println("This step is : a level is started");
    }
    @When("the player pushes the 'A' button Or the player pushes the 'B' button")
    public void the_player_pushes_the_button_or_the_player_pushes_the_button() {
        System.out.println("This step is : the player pushes the 'A' button Or the player pushes the 'B' button");
    }
    @Then("Mario jumps straight up")
    public void mario_jumps_straight_up() {
        System.out.println("This step is : Mario jumps straight up");
    }

    @When("the player pushes the {string} button")
    public void the_player_pushes_the_button(String string) {
        System.out.println("This step is : the player pushes the" + string + "button");
    }

}
