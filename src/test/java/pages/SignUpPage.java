package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import utils.TimeUtils;

public class SignUpPage {
    public WebDriver driver;

    public TimeUtils wait;

    @FindBy(xpath = "//a[normalize-space()='Signup / Login']")
    public WebElement signupMenu;

    @FindBy(xpath = "//input[@placeholder='Name']")
    public WebElement nameField;

    @FindBy(xpath = "//input[@data-qa='signup-email']")
    public WebElement mailField;

    @FindBy(xpath = "//button[normalize-space()='Signup']")
    public WebElement signupBtn;


    public SignUpPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver , this);

        wait = new TimeUtils(driver);
    }

    public void clickSignUpMenu(){
        wait.clickWhenVisible(signupMenu);
    }

    public void enterName(String name){
        wait.typeWhenVisible(nameField ,name);
    }

    public void enterEmail(String mail){
        wait.typeWhenVisible(mailField, mail);
    }

    public void clickSignupButton(){
        wait.clickWhenVisible(signupBtn);
    }

    public void Assertion(){
        String expectedUrl = "https://www.automationexercise.com/signup";

        String actualUrl = driver.getCurrentUrl();

        Assert.assertEquals(expectedUrl , actualUrl);
        System.out.println("Our Expected URL : " + expectedUrl);
    }
}
