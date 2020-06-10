package org.testrunnerclass;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"src\\test\\resources\\Feature"},glue= {"org.stepdefinition"},dryRun=false,strict=false,
monochrome=true,
plugin= {"html:reports","json:reports//output.json","rerun:src\\test\\resources//failedTestCase.txt"})
public class TestRunnerClass {

}
