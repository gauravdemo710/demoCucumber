package orangeHRMPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import GenericUtility.PropertiesUtility;

public class DashboardPage {

	private WebDriver driver;
	private PropertiesUtility pobj ;
	
	public DashboardPage(WebDriver driver) {
		this.driver = driver;
		pobj = new PropertiesUtility("./src/main/resources/Locators/dashboardPageLocators.properties");
	}
	
	// Locators
	private By pageHeader() {
		return By.cssSelector(pobj.readDataFromProperty("pageTitle"));
	}
	
	// Reusable Methods
	public String getDashboardPageHeader() {
		return driver.findElement(pageHeader()).getText();
	}
}
