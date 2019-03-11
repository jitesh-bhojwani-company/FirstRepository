package stepDefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
public class stepDefinition<WebDriver> {

    @Given("^User is on Tours and Travels page$")
    public void user_is_on_tours_and_travels_page() throws Throwable {
        
    	WebDriver driver = new chromedriver();
    	
    }

    @When("^User signup with following details$")
    public void user_signup_with_following_details() throws Throwable {
        
    }

    @Then("^Home page is populated$")
    public void home_page_is_populated() throws Throwable {
        
    }

}