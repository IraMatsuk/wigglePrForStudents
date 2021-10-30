package com.stv.factory.factorytests;

import com.stv.factory.factorypages.*;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MainFactoryTest extends BasicFactoryTest {

    MainFactoryPage mainFactoryPage = new MainFactoryPage();

    @Test (description = "Assert the main page is loaded and search field is visible")
    public void assertSearchFieldIsDisplayed() {
        boolean actualResult = mainFactoryPage .isSearchFieldDisplayed();
        Assert.assertEquals(actualResult, true, "Search field isn't visible");
    }

    @Test (description = "Assert the word is typed", dependsOnMethods = "assertSearchFieldIsDisplayed")
    public void assertWordIsTyped() {
        mainFactoryPage.inputInSearchField();
        Assert.assertEquals(new SearchPage().isSearchContainerDisplayed(), true, "The word isn't typed in search field");
    }

    @Test (description = "Assert the item is clicked and loaded", dependsOnMethods = "assertWordIsTyped")
    public void assertItemIsClicked() {
        mainFactoryPage.clickOnTrustButton();
        mainFactoryPage.clickOnItemLink();
        Assert.assertEquals(new ItemPage().isItemContainerDisplayed(), true, "Add to basket button isn't visible");
    }

    @Test (description = "Assert the add to basket is displayed", dependsOnMethods = "assertItemIsClicked")
    public void assertAddToBasketIsDisplayed() {
        boolean actualResult = mainFactoryPage.isAddToBasketDisplayed();
        Assert.assertEquals(actualResult, true, "Add to basket button isn't visible");
    }

    @Test (description = "Assert the login page is loaded", dependsOnMethods = "assertAddToBasketIsDisplayed")
    public void assertLoginPageIsOpened() {
        mainFactoryPage.clickOnAccountLink();
        Assert.assertEquals(new LoginPage().isYourLoginDisplayed(), true, "Login page isn't loaded properly");
    }

    @Test (description = "Assert the login page is loaded", dependsOnMethods = "assertLoginPageIsOpened")
    public void assertLoginPageIsDisplayed() {
        boolean actualResult = mainFactoryPage.isAccountPageDisplayed();
        Assert.assertEquals(actualResult, true, "Account link isn't visible");
    }

    @Test (description = "Assert the reset password page is loaded", dependsOnMethods = "assertLoginPageIsDisplayed")
    public void assertResetPasswordLinkIsClicked() {
        mainFactoryPage.clickOnForgottenPasswordLink();
        Assert.assertEquals(new ResetPage().isResetContainerDisplayed(), true, "Reset password page isn't loaded properly");
    }

    @Test (description = "Assert the reset password page is displayed", dependsOnMethods = "assertResetPasswordLinkIsClicked")
    public void assertResetPasswordPageIsDisplayed() {
        boolean actualResult = mainFactoryPage.isResetPasswordPageDisplayed();
        Assert.assertEquals(actualResult, true, "Reset password page isn't displayed");
    }
}
