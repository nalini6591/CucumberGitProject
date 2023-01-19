package stepdefination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefination {

	@Given("User Launch Crome Browser")
	public void user_launch_crome_browser() {
	
	}

	@When("User Open URL {\"https://www.facebook.com/\"}")
	public void user_open_url(String string) {
	}

	@When("user enter Email {string} and  Pass as  {string}")
	public void user_enter_email_and_pass_as(String string, String string2) {
	
	}

	@When("click on Login button")
	public void click_on_login_button() {
	   
	}

	@Then("Invalid Password")
	public void invalid_password() {
	   
	}

}
