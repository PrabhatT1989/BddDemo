package TestsRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;

import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "C:\\Users\\Prabhat\\eclipse-workspace\\BddDemo1\\src\\main\\java\\Bdd_Features\\TagsDemo.feature"
		,glue= "StepDefinitions"
				
		,monochrome = true
		
		,tags = {"@SmokeTest"}
		
		
		)


public class OrangeHRMLogin {	
}
