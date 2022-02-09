package com.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\Feature\\amazon.feature",glue="src\\test\\java\\com\\stepdef\\StepDefinition.java")
public class TestRunner {

}
