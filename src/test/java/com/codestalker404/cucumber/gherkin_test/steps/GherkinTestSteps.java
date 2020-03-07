package com.codestalker404.cucumber.gherkin_test.steps;

import com.codestalker404.cucumber.gherkin_test.pojos.Credentials;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;
import java.util.Map;

public class GherkinTestSteps {
    private static final Logger LOGGER = LoggerFactory.getLogger(GherkinTestSteps.class);

    @Given("^I start an scenario$")
    public void iStartAnScenario() {
        LOGGER.info("I'm starting an scenario!");
    }

    @When("^I fill my credentials object with user (.*) and password (.*)$")
    public void iFillMyCredentialsObjectWithUserAndPassword(String user, String password) {
        Credentials credentials = new Credentials(user, password);

        LOGGER.info("{}", credentials);
    }

    @When("^I fill my Credentials objects using lists$")
    public void iFillMyCredentialsObjectsUsingLists(DataTable dataTable) {
        //TODO fill objects
        List<List<String>> tableList = dataTable.asLists(String.class);
        LOGGER.info("Table={}", tableList);

        for(int i = 0; i < tableList.size(); i++) {
            List<String> row = tableList.get(i);
            LOGGER.info("Row {}={}", i, row);
            for(String field : row) {
                LOGGER.info("Field='{}'", field);
            }
        }
    }

    @When("^I fill my Credentials objects using maps$")
    public void iFillMyCredentialsObjectsUsingMaps(DataTable dataTable) {
        //TODO fill objects
        List<Map<String, String>> mapList = dataTable.asMaps(String.class, String.class);
        LOGGER.info("Table={}", mapList);

        for(int i = 0; i < mapList.size(); i++) {
            Map<String, String> row = mapList.get(i);
            LOGGER.info("Row {}={}", i, row);
            LOGGER.info("User='{}'", row.get("user"));
            LOGGER.info("Password='{}'", row.get("password"));
        }
    }

    @When("^I fill my Credentials objects using a single list$")
    public void iFillMyCredentialsObjectsUsingTransformers(DataTable dataTable) {
        List<Credentials> tableList = dataTable.asList(Credentials.class);

        for(Credentials credentials : tableList) {
            LOGGER.info("{}", credentials);
        }
    }

    @Then("^I say goodbye$")
    public void iSayGoodbye() {
        LOGGER.info("Goodbye!");
    }
}
