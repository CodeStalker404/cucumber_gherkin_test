package com.codestalker404.cucumber.gherkin_test;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/cucumber_features/",
        plugin = {"pretty"}
)
public class RunCucumberTest {
}
