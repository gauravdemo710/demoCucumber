package stepdefination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AmazonSearch {

	@Given("user is on home page of amazon")
	public void user_is_on_home_page_of_amazon() {
	   
		System.out.println("Step 1 : user is on home page");
	}

	@When("^user search \"([^\"]+)\" in amazon for ([\\d]+) quantity$")
	public void user_search_in_amazon_for_quantity(String product, Integer quantity) {
		
		System.out.println("Step 2 : search for " + product + " product in " + quantity + " item");
	}

	@Then("user will get product search result")
	public void user_will_get_product_search_result() {

		System.out.println("Step 3 : product result display");
	}
	
	@Given("user will navigate to sign in page")
	public void user_will_navigate_to_sign_in_page() {
		System.out.println("user navigate to sign in");
	}

	@When("user proivde mobile number")
	public void user_proivde_mobile_number() {
		System.out.println("user enter mobile number");
	}

	@When("click on continue button")
	public void click_on_continue_button() {
		System.out.println("user click on continue button");
	}

	@Then("user provide password")
	public void user_provide_password() {
		System.out.println("user enter password");
	}

	@Then("click on sign in button")
	public void click_on_sign_in_button() {
		System.out.println("user click on sign in button");
	}

	@Then("user will login successfully")
	public void user_will_login_successfully() {
		System.out.println("user login successfully");
	}

	@Given("click on language settings")
	public void click_on_language_settings() {
		System.out.println("user click on language settings");
	}

	@When("user Select the preference language")
	public void user_select_the_preference_language() {
		System.out.println("user select preference langugae");
	}

	@Then("user clicked on preference language")
	public void user_clicked_on_preference_language() {
		System.out.println("user click on preference language");
	}

	@Then("user click on save changes")
	public void user_click_on_save_changes() {
		System.out.println("user click on save button");
	}

	@When("user select a product")
	public void user_select_a_product() {
		System.out.println("user select a product");
	}

	@When("user click on add to cart")
	public void user_click_on_add_to_cart() {
		System.out.println("user click on add to cart button");
	}

	@Then("user proceed to checkout")
	public void user_proceed_to_checkout() {
		System.out.println("user procced for checkout");
	}

	@Then("user make the payment")
	public void user_make_the_payment() {
		System.out.println("user makes payment");
	}
	
	@Then("verify user is loggedIn")
	public void verify_user_is_logged_in() {
	   System.out.println("verification for login is done");
	}


}


