package com.stv.factory.factorypages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ItemPage extends FactoryPage {
    @FindBy(xpath = "//*[@id=\"wiggle\"]")
    private WebElement productContainer;

    public boolean isItemContainerDisplayed() {
        return productContainer.isDisplayed();
    }
}
