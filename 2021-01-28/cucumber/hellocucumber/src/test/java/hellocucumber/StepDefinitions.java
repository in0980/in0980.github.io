package hellocucumber;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.*;

class Sextou {
    static String sextou(String today) {
        return "Friday".equals(today) ? "Sextou" : "Nope";
    }
}

public class StepDefinitions {

    private String today;
    private String actualAnswer; 

    @Given("today is Thursday")
    public void today_is_thursday() {
        today = "Thursday";
    }

    @Given("today is Friday")
    public void today_is_friday() {
        today = "Friday";
    }

    @Given("today is {string}")
    public void today_is(String string) {
        today = string;
    }

    
    @When("I ask whether it's Friday yet")
    public void i_ask_whether_it_s_friday_yet() {
        actualAnswer = Sextou.sextou(today);
    }
    
    @Then("I should be told {string}")
    public void i_should_be_told(String expectedAnswer) {
        assertEquals(expectedAnswer, actualAnswer);
    }
    
}
