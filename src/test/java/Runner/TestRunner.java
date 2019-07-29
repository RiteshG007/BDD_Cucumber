package Runner;

import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;
import cucumber.api.CucumberOptions;



@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/java/Features"
		,glue= {"StepDefinitions"},
				 //plugin = { "pretty", "html:target/cucumber-reports" },
				 plugin = { "pretty", "json:target/cucumber.json" },
				 //tags = {"@Smoke,@Sanity"},////or
				 //tags = {"@Smoke","~@Sanity"},////And
				 monochrome = true)
public class TestRunner {

}
