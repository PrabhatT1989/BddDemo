package StepDefinitions;



import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;

import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "C:\\Users\\Prabhat\\eclipse-workspace\\BddDemo1\\src\\main\\java\\Bdd_Features"
		,glue= "C:\\Users\\Prabhat\\eclipse-workspace\\BddDemo1\\src\\test\\java\\StepDefinitions"
				
		,monochrome = true
		
		
		//I have done ANDing 
		,tags = {"@SmokeTest","@RegressionTest"}
		, dryRun = false
		
		
		// todo Oring
		//	,tags = {"@SmokeTest, @RegressionTest"}
 
		
		
		)

public class TestsRunnerClass {

}
