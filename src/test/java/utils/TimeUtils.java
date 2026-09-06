package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class TimeUtils {
    public WebDriver driver;

    public WebDriverWait wait;

    public TimeUtils(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver , Duration.ofSeconds(20));
    }

    public void clearWhenVisible(WebElement element){
        wait.until(ExpectedConditions.visibilityOf(element)).clear();
    }

    public void clickWhenVisible(WebElement element){
        wait.until(ExpectedConditions.visibilityOf(element)).click();
    }

    public void typeWhenVisible(WebElement element , String input){
        wait.until(ExpectedConditions.visibilityOf(element)).sendKeys(input);
    }

    public boolean isVisible(WebElement element){
        return wait.until(ExpectedConditions.visibilityOf(element)).isDisplayed();
    }
}
