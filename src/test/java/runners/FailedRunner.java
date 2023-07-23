package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = {"@Rerun/failedScenrioRerun.txt"},
		glue = {"stepdefination", "hooks"},
		plugin = {"pretty" , "json:Reports/JsonReports/report.json" ,
				"junit:Reports/JunitReports/report.xml", 
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
				"rerun:Rerun/failedScenrioRerun.txt"},
		monochrome = true,
		publish = true
)
public class FailedRunner extends AbstractTestNGCucumberTests{

}
