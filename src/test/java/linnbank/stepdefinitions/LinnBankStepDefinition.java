package linnbank.stepdefinitions;

import io.cucumber.java.en.Given;
import linnbank.utilities.Driver;

public class LinnBankStepDefinition {

    @Given("user go to {string}")
    public void user_go_to(String homepage) {
        Driver.getDriver().get(homepage);


    }

}
