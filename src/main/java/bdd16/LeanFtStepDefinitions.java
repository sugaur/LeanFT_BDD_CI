package bdd16;

import java.io.IOException;
import com.hp.lft.report.ReportException;
import com.hp.lft.sdk.GeneralLeanFtException;
import com.hp.lft.sdk.*;
import com.hp.lft.sdk.web.*;
import com.hp.lft.verifications.*;
import static org.junit.Assert.*;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LeanFtStepDefinitions {

    public LeanFtStepDefinitions() {}
    Browser browser;

    @Given("^pre-condition statement$")
    public void pre_condition_statement() throws Throwable {
        browser= BrowserFactory.launch(BrowserType.CHROME);
        browser.navigate("http://newtours.demoaut.com/");

    }

    @When("^action statement$")
    public void action_statement() throws Throwable {
        browser.describe(EditField.class, new EditFieldDescription.Builder()
                .name("userName")
                .tagName("INPUT")
                .type("text").build()).highlight();
        browser.describe(EditField.class, new EditFieldDescription.Builder()
                .name("userName")
                .tagName("INUT")
                .type("text").build()).setValue("tutorial");

        browser.describe(EditField.class, new EditFieldDescription.Builder()
                .name("password")
                .tagName("INPUT")
                .type("password").build()).highlight();
        browser.describe(EditField.class, new EditFieldDescription.Builder()
                .name("password")
                .tagName("INPUT")
                .type("password").build()).setValue("tutorial");

        browser.describe(Image.class, new ImageDescription.Builder()
                .alt("Sign-In")
                .tagName("INPUT")
                .type(com.hp.lft.sdk.web.ImageType.BUTTON).build()).highlight();

        browser.describe(Image.class, new ImageDescription.Builder()
                .alt("Sign-In")
                .tagName("INPUT")
                .type(com.hp.lft.sdk.web.ImageType.BUTTON).build()).click();

    }


    @Then("^expectation statement$")
    public void expectation_statement() throws Throwable {

    }
    //Implementation of feature’s steps

}