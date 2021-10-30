package com.stv.factory.factorypages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainFactoryPage extends FactoryPage {
    @FindBy(name = "LogOnModel.Password")
    private WebElement password;


    @FindBy(className = "bem-header__input-group")
    private WebElement mainPage;

    @FindBy(xpath = "//button[contains(text(),'Accept All Cookies')]")
    private WebElement trustButton;

    @FindBy(id = "rs")
    private WebElement searchInput;

    @FindBy(className ="bem-product-thumb__image-link--grid")
    private WebElement productLink;

    @FindBy(id = "quickBuyButton")
    private WebElement addToBasketButton;

    @FindBy(id = "accountLink")
    private WebElement accountLink;

    @FindBy(id = "wiggle")
    private WebElement yourAccountPage;

    @FindBy(xpath = "//*[@id=\"forgotten-password\"]")
    private WebElement forgottenPasswordLink;

    @FindBy(xpath = "//*[@id=\"wiggle\"]")
    private WebElement resetPasswordPage;

    public boolean isSearchFieldDisplayed() {
        return mainPage.isDisplayed();
    }

    public void clickOnTrustButton(){
        trustButton.click();
    }

    public MainFactoryPage inputInSearchField() {
        searchInput.sendKeys("Swim");
        searchInput.sendKeys(Keys.ENTER);
        return this;
    }

    public MainFactoryPage clickOnItemLink() {
        productLink.click();
        return this;
    }

    public boolean isAddToBasketDisplayed(){
        return addToBasketButton.isDisplayed();
    }

    public MainFactoryPage clickOnAccountLink(){
        accountLink.click();
        return this;
    }

    public boolean isAccountPageDisplayed() {
        return yourAccountPage.isDisplayed();
    }

    public MainFactoryPage clickOnForgottenPasswordLink() {
        forgottenPasswordLink.click();
        return this;
    }

    public boolean isResetPasswordPageDisplayed() {
        return resetPasswordPage.isDisplayed();
    }
}
