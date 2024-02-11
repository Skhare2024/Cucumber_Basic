package com.test;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
	//	plugin = { "pretty","json:target/stepdefinition.json" },
		features="src/test/resources/Features"
		,glue= {"stepDefinition","com/test"}
		
		
		)


public class TestRunner {
	
	public TestRunner() {
		
	}

}
