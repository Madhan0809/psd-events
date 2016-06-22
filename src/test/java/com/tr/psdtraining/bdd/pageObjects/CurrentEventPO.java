package com.tr.psdtraining.bdd.pageObjects;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static com.tr.psdtraining.bdd.support.WebConnector.driver;
import static com.tr.psdtraining.bdd.support.WebConnector.getHost;
import static com.tr.psdtraining.bdd.support.WebConnector.waitForElement;

public class CurrentEventPO {

    @FindBy(tagName = "h2")
    private WebElement currentEventFromlabel;

    public String returnFormLabelText() {
        waitForElement(10).until(ExpectedConditions.visibilityOf(currentEventFromlabel));
        return currentEventFromlabel.getText();
    }

}
