package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		plugin = {"pretty","html:target/cucumberreport.html"},
		features="src/test/resources/features",
		glue="StepdefinitionHomepage",
		dryRun=false,
		monochrome=true,
		tags="@SignInPage"
		
		
		
		)
public class TestNGRunner extends AbstractTestNGCucumberTests{

	
	
}
