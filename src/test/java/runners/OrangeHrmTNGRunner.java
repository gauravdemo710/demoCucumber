package runners;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = {"src/test/resources/features/OrangeHRMLogin.feature"},
		glue = {"stepdefination", "hooks"},
		plugin = {"pretty" , "json:Reports/JsonReports/report.json" ,
				"junit:Reports/JunitReports/report.xml", 
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
				"rerun:Rerun/failedScenrioRerun.txt"},
		monochrome = true,
		publish = true
)
public class OrangeHrmTNGRunner extends AbstractTestNGCucumberTests{

//	@Override
//	@DataProvider(parallel = true)
//	public Object[][] scenarios() {
//		return super.scenarios();
//	}
}
