package steps;

import base.Hooks;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import pages.SignUpPage;
import utils.TestData;


public class TestCases {
    public WebDriver driver;

    SignUpPage sp;

    public TestCases(){
        this.driver = Hooks.setup();
        sp = new SignUpPage(driver);
    }

    @Given("user open url")
    public void user_open_url() {
        driver.get(TestData.URL);
    }
    @When("user click signup menu")
    public void user_click_signup_menu() {
        sp.clickSignUpMenu();
    }
    @And("user input name")
    public void user_input_name() {
        sp.enterName(TestData.NAME);
    }
    @And("user input mail address")
    public void user_input_mail_address() {
        sp.enterEmail(TestData.EMAIL);
    }
    @Then("click signup button")
    public void click_signup_button() {
        sp.clickSignupButton();

        sp.Assertion();
    }
}
