package browserController;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory {

	private static WebDriver driver;
	private static ThreadLocal<WebDriver> threadLocal = new ThreadLocal<WebDriver>();
	
	public WebDriver initDriver(String browser) {
		if(browser.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			threadLocal.set(driver);
			
		}else if(browser.equals("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			threadLocal.set(driver);
			
		}else if(browser.equals("safari")) {
			WebDriverManager.safaridriver().setup();
			driver = new SafariDriver();
			threadLocal.set(driver);
			
		}else {
			System.out.println("Invalid Browser Input...");
			return null;
		}
		
		threadLocal.get().manage().deleteAllCookies();
		threadLocal.get().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		threadLocal.get().manage().window().maximize();
		
		return threadLocal.get();
	}
	
	public static WebDriver getDriver() {
		
		return threadLocal.get();
	}
}
