package com.stv.factory.factorypages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchPage extends FactoryPage{
    @FindBy(className = "bem-header__input-group")
    private WebElement searchContainer;

    public boolean isSearchContainerDisplayed(){
        return searchContainer.isDisplayed();
    }
}
