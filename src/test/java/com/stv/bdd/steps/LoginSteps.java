package com.stv.bdd.steps;

import com.stv.factory.factorypages.LoginPage;
import com.stv.factory.factorytests.MainFactoryTest;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static com.stv.framework.core.lib.WigglePageURLs.ACCOUNT_URL;

public class LoginSteps extends MainFactoryTest {
    WebDriver driver;
    LoginPage loginPage = new LoginPage();
    private static final String EMAIL = "matsukirina1.20@gmail.com";
    private static final String PASSWORD = "NewPassw0rd1";

    @Given("User is on a login page")
    public void user_is_on_a_login_page() {
        String exePath = "C:\\chromedriver_win32\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", exePath);
        driver = new ChromeDriver();
        driver.get(ACCOUNT_URL);
        loginPage.isYourLoginDisplayed();
        System.out.println("This step detect that user is on a login page");
    }
    @When("User enter valid {string} in Email address field")
    public void user_enter_valid_in_email_address_field(String email) {
        loginPage.sendEmailField(email);
        //driver.findElement(By.name("LogOnModel.UserName")).sendKeys(EMAIL);
        System.out.println("This step enter the email address on the login page");
    }
    @When("User enter valid {string} in Password field")
    public void user_enter_valid_in_password_field(String password) {
        loginPage.sendPassword(password);
        //driver.findElement(By.name("LogOnModel.Password")).sendKeys(PASSWORD);
        System.out.println("This step enter the password on the login page");
    }
    @When("User clicks on checkbox to show password")
    public void user_clicks_on_checkbox_to_show_password() {
        WebElement checkBox = driver.findElement(By.id("passwordToggle"));
        checkBox.click();
        if (checkBox.isSelected()) {
            System.out.println("This step click on checkbox to show password");
        } else {
            System.out.println("Checkbox is Toggled Off");
        }
    }

    @When("User clicks on button")
    public void user_clicks_on_button() {
        WebDriverWait wait = new WebDriverWait(driver, 20);
        WebElement button = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[id*='qa-login'")));
        button.click();

        System.out.println("This step click on the sign in button");
    }

    @Then("User should navigate to User Account page")
    public void user_should_navigate_to_user_account_page() {
        String expectedUrl = driver.getCurrentUrl();
        String actualUrl = "https://www.wiggle.co.uk/secure/myaccount/logon?returnUrl=%2Fsecure%2Faccount";
        if (actualUrl.equals(expectedUrl)) {
            System.out.println("This step throw on the user account page");
        }
    }
}
