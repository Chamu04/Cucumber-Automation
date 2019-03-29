package stepDefinations;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
public class MyStepDefinitions {

    @Given("^User iss on landing page$")
    public void user_iss_on_landing_page() throws Throwable {
        System.out.println("Navigated to Home Page");
    }

    @When("^Userr login with Username and Password$")
    public void userr_login_with_username_and_password() throws Throwable {
        System.out.println("Navigated to Home Page");
    }

    @Then("^Homee page is populated$")
    public void homee_page_is_populated() throws Throwable {
        System.out.println("Navigated to Home Page");
    }

    @And("^Cardss are displayed$")
    public void cardss_are_displayed() throws Throwable {
        System.out.println("Navigated to Home Page");
    }

}