package stepdefination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;
import java.util.Map;

import io.cucumber.datatable.DataTable;

public class RegistrationSteps {

	@Given("user is on registration page")
	public void user_is_on_registration_page() {
		System.out.println("user is on registration");
	}

	@When("user enters following details")
	public void user_enters_following_details(DataTable dataTable) {
	    
		List<Map<String, String>> userData = dataTable.asMaps(String.class, String.class);
		
		System.out.println(userData.get(0));
		System.out.println("------------------------------------------");
		System.out.println(userData.get(0).get("FirstName"));
		System.out.println(userData.get(0).get("LastName"));
		System.out.println(userData.get(0).get("EmailId"));
		System.out.println(userData.get(0).get("PhoneNum"));
		System.out.println(userData.get(0).get("City"));
	}

	@Then("user click on register button")
	public void user_click_on_register_button() {
		System.out.println("user click on register button");
	}

	@Then("user generates successfully in application")
	public void user_generates_successfully_in_application() {
		System.out.println("user generate successfully");
	}
}
