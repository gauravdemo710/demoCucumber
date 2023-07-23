package stepdefination;


import org.openqa.selenium.WebDriver;

import browserController.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import orangeHRMPages.DashboardPage;
import orangeHRMPages.LoginPage;

public class LoginOrangeHrmSteps {

	WebDriver driver = DriverFactory.getDriver();
	LoginPage loginPage = new LoginPage(driver);
	DashboardPage dashBoardPage = new DashboardPage(driver);
	
	@Given("user is on login page")
	public void user_is_on_login_page() {
		String loginPageTitle = loginPage.getLoginPageTitle();
		System.out.println(loginPageTitle);
	}
	
	@When("user enters username as {string}")
	public void user_enters_username_as(String username) {
		loginPage.enterUsername(username);
	}
	
	@When("user enters password as {string}")
	public void user_enters_password_as(String password) {
		loginPage.enterPassword(password);
	}
	
	@When("user click on login button")
	public void user_click_on_login_button() throws InterruptedException {
		loginPage.clickOnLoginBtn();
		Thread.sleep(2000);
	}
	
	@Then("user will be on dashboard page")
	public void user_will_be_on_dashboard_page() {
		String dashBoardHeader = dashBoardPage.getDashboardPageHeader();
		System.out.println(dashBoardHeader);
	}
}
