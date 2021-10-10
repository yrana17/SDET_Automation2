package stepdefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDef2 {

	@Given("^goto home page$")
	public void goto_home_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("Bg: Home Page");
	}

	@When("^enter cred in form of user n pswd$")
	public void enter_cred_in_form_of_user_n_pswd() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Bg: Enter Cred");
	}

	@Then("^successfull logged$")
	public void successfull_logged() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Bg: Success login");
	}

	@When("^I add product to cart and checkout$")
	public void i_add_product_to_cart_and_checkout() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("Added product to cart n checkout");
	}

	@When("^do payment via credit card$")
	public void do_payment_via_credit_card() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("payment done");
	}

	@Then("^I should recieve order confirmation$")
	public void i_should_recieve_order_confirmation() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("Receive order confirmation");
	}

	@When("^I request for returned product$")
	public void i_request_for_returned_product() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Request for returnnign product");
	}

	@When("^delivery person has picked up$")
	public void delivery_person_has_picked_up() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("pick up of return product");
	}

	@Then("^I should recieve refund message along with its ETA$")
	public void i_should_recieve_refund_message_along_with_its_ETA() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("Refund msg");
	}
	
	
	
}
