package com.stv.bdd.steps;

import com.stv.factory.factorypages.*;
import com.stv.factory.factorytests.MainFactoryTest;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchSteps extends MainFactoryTest {
    MainFactoryPage mainFactoryPage = new MainFactoryPage();
    ItemPage itemPage = new ItemPage();
    LoginPage loginPage = new LoginPage();

    @Given("Search field is displayed on the main page")
    public void search_field_is_displayed_on_the_main_page() {
        mainFactoryPage.isSearchFieldDisplayed();
    }
    @When("User typed a word in search field and press enter")
    public void user_typed_a_word_in_search_field_and_press_enter() {
        mainFactoryPage.inputInSearchField();
    }
    @When("User should navigate to Product page")
    public void user_should_navigate_to_product_page() {
        itemPage.isItemContainerDisplayed();
    }

    @When("User clicks on the first product on Product page")
    public void user_clicks_on_the_first_product_on_product_page() {
        mainFactoryPage.clickOnTrustButton();
        mainFactoryPage.clickOnItemLink();
    }
    @When("User should navigate to Item page")
    public void user_should_navigate_to_item_page() {
        itemPage.isItemContainerDisplayed();
    }
    @When("User check is Add to basket button displayed")
    public void user_check_is_add_to_basket_button_displayed() {
        mainFactoryPage.isAddToBasketDisplayed();
    }
    @And("User clicks on Your account link")
    public void user_clicks_on_your_account_link() {
        mainFactoryPage.clickOnAccountLink();
    }

    @And("User clicks on link Forgotten your password")
    public void user_clicks_on_link_forgotten_password() {
        loginPage.clickOnForgottenPasswordLink();
    }

    @Then("User should navigate to Reset password page")
    public void user_should_navigate_to_forgotten_password_page() {
        mainFactoryPage.isResetPasswordPageDisplayed();
    }
}
