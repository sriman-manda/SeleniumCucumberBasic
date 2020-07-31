package Steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
	
	@Given("User is on login page")
	public void user_is_on_login_page() {
	    System.out.println("User is on login page");
	}

	@And("user enters username and password")
	public void user_enters_username_and_password() {
		System.out.println("user enters username and password");
	}

	@When("clicks on Login button")
	public void clicks_on_login_button() {
		System.out.println("clicks on Login button");
	}

	@Then("Logged in successfully")
	public void logged_in_successfully() {
		System.out.println("Logged in successfully");
	}





}
