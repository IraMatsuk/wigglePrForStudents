package com.stv.factory.factorypages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends FactoryPage {
    @FindBy(id = "wiggle")
    private WebElement loginContainer;

    @FindBy(name = "LogOnModel.UserName")
    private WebElement emailContainer;

    @FindBy(name = "LogOnModel.Password")
    private WebElement passwordContainer;

    @FindBy(id= "forgotten-password")
    private WebElement forgottenPassword;

    public boolean isYourLoginDisplayed() {
        return loginContainer.isDisplayed();
    }

    public LoginPage sendEmailField(String email) {
        emailContainer.sendKeys(email);
        return this;
    }

    public LoginPage sendPassword(String password) {
        passwordContainer.sendKeys(password);
        return this;
    }

    public LoginPage clickOnForgottenPasswordLink() {
        forgottenPassword.click();
        return this;
    }
}
