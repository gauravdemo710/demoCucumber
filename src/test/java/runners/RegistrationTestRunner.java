package runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
	features = {"src/test/resources/features/Login.feature"},
	glue = {"stepdefination", "hooks"},
	plugin = {"pretty" , "json:Reports/JsonReports/report.json" ,
			"junit:Reports/JunitReports/report.xml"},
	monochrome = true,
	publish = true
)
public class RegistrationTestRunner {

}

/*
 * json report	-> "json:Reports/JsonReports/report.json"
 * xml / Junit report -> "junit:Reports/JunitReports/report.xml"
 * cucumber report -> publish = true
 */
