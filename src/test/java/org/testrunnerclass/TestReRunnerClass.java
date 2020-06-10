package org.testrunnerclass;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"@src\\test\\resources//failedtestcase.txt"},glue= {"org.stepdefition"},monochrome=true)

public class TestReRunnerClass {

}
