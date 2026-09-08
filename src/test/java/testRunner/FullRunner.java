package testRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/resources/features" , glue = {"steps"},
        monochrome = true,
        tags = "",
        plugin = {"pretty", "html:Report/report-1.html", "junit:target/cucumber-junit-report.xml"}

)

public class FullRunner extends AbstractTestNGCucumberTests {
}
