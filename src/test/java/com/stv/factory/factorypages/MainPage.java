package com.stv.factory.factorypages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage {
    @FindBy(className = "bem-megamenu__head-container")
    private WebElement mainPageContainer;

    public boolean isUserOnTheMainPage() {
        return mainPageContainer.isDisplayed();
    }

}
