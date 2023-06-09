package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		plugin = {"pretty","html:target/cucumberreport.html",
				"pretty", "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
				
				
		features="src/test/resources/features",
		glue="StepdefinitionHomepage",
		dryRun=false,
		monochrome=true,
		publish=true,
		tags = ""
		
		
		
		)


public class TestRunner {

}
