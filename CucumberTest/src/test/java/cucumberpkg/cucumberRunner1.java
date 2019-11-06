package cucumberpkg;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

	@RunWith(Cucumber.class)
	@CucumberOptions(plugin= {"pretty", "html:src/cucumber-reports", "json:target/report.json"},
	features= {"CucumberTest/src/test/resources/cucumberpkg/testmeapplication.feature"})
 public class cucumberRunner1{
		
	}
