package com.tr.psdtraining.bdd.pageObjects;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static com.tr.psdtraining.bdd.support.WebConnector.*;

public class NewEventPO {

    @FindBy(tagName = "h2")
    private WebElement newEventsFromlabel;

    @FindBy(css = "#location")
    private WebElement locationTextField;

    @FindBy(css = "#time")
    private WebElement timeTextField;

    @FindBy(css = "#locationDetails")
    private WebElement locationDetailsTextField;

    @FindBy(css = "#submitEvent")
    private WebElement submitButton;

    public static String eventPageUrl() {
        return getHost() + "/createEvent";
    }

    public void navigateToEventCreationPage() {
        driver.get(eventPageUrl());
    }

    public String returnFormLabelText() {
        waitForElement(10).until(ExpectedConditions.visibilityOf(newEventsFromlabel));
        return newEventsFromlabel.getText();
    }

    public void enterNewEventFormDetails(String location, String time, String locDetails) {
        locationTextField.clear();
        locationTextField.sendKeys(location);
        timeTextField.clear();
        timeTextField.sendKeys(time);
        locationDetailsTextField.clear();
        locationDetailsTextField.sendKeys(locDetails);

    }

    public void clickOnSubmitButton() {
        submitButton.click();
    }
}
