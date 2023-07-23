package hooks;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import browserController.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;


public class BaseHooks {

	public DriverFactory factory = new DriverFactory();
	
	@Before
	public void configBeforeScenario() {
		WebDriver driver = factory.initDriver("chrome");
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
	
	@After(order = 0)
	public void configAfterScenario() {
		DriverFactory.getDriver().quit();
	}
	
	@After(order = 1)
	public void takeScreenshot(Scenario sc) {
		
		if(sc.isFailed()) {
			String screenshotName = sc.getName().replaceAll(" ", "_");
			TakesScreenshot ts = (TakesScreenshot)DriverFactory.getDriver();
			byte[] sourcePath = ts.getScreenshotAs(OutputType.BYTES);
			sc.attach(sourcePath, "image/png", screenshotName);
		}
	}
}




