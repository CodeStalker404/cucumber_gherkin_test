package com.codestalker404.cucumber.gherkin_test.steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class HookSteps {
    private static final Logger LOGGER = LoggerFactory.getLogger(HookSteps.class);


    @Before
    public void beforeScenario(Scenario scenario) {
        LOGGER.info("SCENARIO: {}", scenario.getName());
    }

    @After
    public void afterScenario(Scenario scenario) {
        LOGGER.info("END SCENARIO: {}", scenario.getName());
        LOGGER.info("RESULT: {}", (scenario.isFailed() ? "fail\n" : "ok\n"));
    }

}
