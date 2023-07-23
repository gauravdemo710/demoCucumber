package runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
	features = {"src/test/resources/features/OrangeHRMLogin.feature"},
	glue = {"stepdefination", "hooks"},
	plugin = {"pretty" , "json:Reports/JsonReports/report.json" ,
			"junit:Reports/JunitReports/report.xml", 
			"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
	monochrome = true,
	publish = true
//	dryRun = true
)
public class OrangeHrmTestRunner {

}
