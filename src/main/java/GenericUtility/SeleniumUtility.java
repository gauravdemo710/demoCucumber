package GenericUtility;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumUtility {

	private WebDriver driver;
	
	public SeleniumUtility(WebDriver driver) {
		this.driver = driver;
	}
	
	public void enterTextInElement(By element, String text) {
		driver.findElement(element).sendKeys(text);
	}
	
	public void clickOnElement(By element) {
		driver.findElement(element).click();
	}
	
	public void waitAndClickOnElement(By element) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(element)).click();
	}
	
	public String fetchElementText(By element) {
		return driver.findElement(element).getText();
	}
	
	public void acceptAlert() {
		driver.switchTo().alert().accept();
	}
}

















