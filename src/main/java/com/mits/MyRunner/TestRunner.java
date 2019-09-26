package com.mits.MyRunner;

import org.junit.runner.RunWith;
/*import org.testng.annotations.Test;*/
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
/*
import cucumber.api.testng.AbstractTestNGCucumberTests;
*/

@RunWith(Cucumber.class)
@CucumberOptions(
		features="C:\\Users\\mitsind475\\git\\IND_MITS_SeleniumProject\\Cucumber_SeleniumTest\\src\\main\\java\\com\\mits\\features\\GenericAutomation.feature",
		glue= {"com.mits.stepDefinations"},
		plugin = {"html:target/cucumber-html-report1","json:target/cucumber-report/cucumber.json1"})



public class TestRunner 
{				        
		
	
}

/* 
		        "json:target/cucumber.json", "pretty:target/cucumber-pretty.txt",
		        "usage:target/cucumber-usage.json", "junit:target/cucumber-results.xml",*/

