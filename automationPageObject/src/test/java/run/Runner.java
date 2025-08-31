package run;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(                                                                
		
		tags = "",
		features = "",
		glue = "",
		publish = true,
		plugin = {"pretty","html:target/cucumber-report.html","json:target/cucumber-reportJson"}
				
		)




public class Runner {

}
