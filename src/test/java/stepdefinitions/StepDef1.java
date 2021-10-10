package stepdefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDef1 {

	
	@Given("^User is on home-login page of application$")
	public void user_is_on_home_login_page_of_application() throws Throwable {
		System.out.println("User has successfully reached to home page of the application");
	}

	@When("^User enters credentials$")
	public void user_enters_credentials() throws Throwable {
		System.out.println("User Entered the credentials....");
	}

	@When("^click on login button$")
	public void click_on_login_button() throws Throwable {
		System.out.println("Click on login button.......");
	}

	@Then("^User should be logged in successfully$")
	public void user_should_be_logged_in_successfully() throws Throwable {
		System.out.println("User logged in successfully.......");
	}

	@Then("^User should get Invalid credentails error message$")
	public void user_should_get_Invalid_credentails_error_message() throws Throwable {
		System.out.println("User get invalid error message");
	}
	

	@Given("^User is on home page of app \"([^\"]*)\"$")
	public void user_is_on_home_page_of_app(String arg1) throws Throwable {
	   System.out.println("User reached home page of "+arg1);
	}

	@When("^i enter \"([^\"]*)\" and \"([^\"]*)\"$")
	public void i_enter_and(String arg1, String arg2) throws Throwable {
	   System.out.println("Enter cred: user:"+arg1+" and pswd:"+arg2);
	}

	@When("^click on submit button$")
	public void click_on_submit_button() throws Throwable {
	   System.out.println("click on submit button");
	}

	@Then("^validate the \"([^\"]*)\" of login as success or failure$")
	public void validate_the_of_login_as_success_or_failure(String arg1) throws Throwable {
	   System.out.println("STatus:"+arg1);
	}
	
	
	
}
