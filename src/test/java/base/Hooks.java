package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hooks  {
    public static WebDriver driver;

    public static WebDriver setup(){
        System.setProperty("webdriver.chrome.driver" , "D:\\driver\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        return driver;
    }
}
