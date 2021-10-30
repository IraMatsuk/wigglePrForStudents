package com.stv.factory.factorypages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ResetPage extends FactoryPage {
    @FindBy(xpath ="//*[@id=\"wiggle\"]")
    private WebElement resetContainer;

    public boolean isResetContainerDisplayed() {
        return resetContainer.isDisplayed();
    }
}
