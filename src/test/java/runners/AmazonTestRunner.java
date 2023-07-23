package runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
	features = {"src/test/resources/features/AmazonSearch.feature"},
	glue = {"stepdefination", "hooks"},
	tags = "@Demohook"
//	plugin = {"pretty"}
)
public class AmazonTestRunner {

}
