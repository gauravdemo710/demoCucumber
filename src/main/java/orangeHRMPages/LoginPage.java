package orangeHRMPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import GenericUtility.PropertiesUtility;
import GenericUtility.SeleniumUtility;

public class LoginPage {

	private WebDriver driver;
	private PropertiesUtility pobj ;
	private SeleniumUtility selObj;
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		pobj = new PropertiesUtility("./src/main/resources/Locators/loginPageLocators.properties");
		selObj = new SeleniumUtility(driver);
	}
	
	// Locator Methods
	private By usernameField() {
		return By.name(pobj.readDataFromProperty("usernameTextField"));
	}
	
	private By passwordField() {
		return By.name(pobj.readDataFromProperty("passwordTextField"));
	}
	
	private By loginBtn() {
		return By.cssSelector(pobj.readDataFromProperty("loginBtn"));
	}
	
	private By pageTitle() {
		return By.cssSelector(pobj.readDataFromProperty("pageTitle"));
	}
	
	
	// Reusable Methods
	public void enterUsername(String username) {
	//	driver.findElement(usernameField()).sendKeys(username);
		selObj.enterTextInElement(usernameField(), username);
	}
	
	public void enterPassword(String password) {
		selObj.enterTextInElement(passwordField(), password);
	}
	
	public void clickOnLoginBtn() {
		selObj.clickOnElement(loginBtn());
	}
	
	public String getLoginPageTitle() {
		return selObj.fetchElementText(pageTitle());
	}
}







