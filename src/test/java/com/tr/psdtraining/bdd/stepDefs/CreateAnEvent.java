package com.tr.psdtraining.bdd.stepDefs;

import com.tr.psdtraining.bdd.pageObjects.CurrentEventPO;
import com.tr.psdtraining.bdd.pageObjects.NewEventPO;
import com.tr.psdtraining.bdd.support.WebConnector;
import cucumber.api.java.en.*;
import org.openqa.selenium.support.PageFactory;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;

public class CreateAnEvent {

    NewEventPO newEventPO = PageFactory.initElements(WebConnector.driver, NewEventPO.class);
    CurrentEventPO currentEventPO = PageFactory.initElements(WebConnector.driver, CurrentEventPO.class);

    @Given("^I go to Event creation page$")
    public void i_go_to_Event_creation_page() throws Throwable {
        newEventPO.navigateToEventCreationPage();
    }

    @When("^I see the \"([^\"]*)\" form$")
    public void i_see_the_form(String expectedFormLabel) throws Throwable {
        String actualFormLabel = newEventPO.returnFormLabelText();
        assertThat(actualFormLabel, containsString(expectedFormLabel));

    }

    @And("^I type the \"([^\"]*)\", \"([^\"]*)\" and \"([^\"]*)\"$")
    public void i_type_the_and(String location, String time, String locDetails) throws Throwable {
        newEventPO.enterNewEventFormDetails(location, time, locDetails);
    }

    @And("^I click on Submit button$")
    public void i_click_on_Submit_button() throws Throwable {
        newEventPO.clickOnSubmitButton();
    }

    @Then("^I should navigate to the \"([^\"]*)\" page$")
    public void i_should_navigate_to_the_page(String expectedFormLabel) throws Throwable {
        String actualFormLabel = currentEventPO.returnFormLabelText();
        assertThat(actualFormLabel, containsString(expectedFormLabel));
    }
}
