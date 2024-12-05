package runner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/features",  // Path to the feature files
        glue = "stepDefinitions",                 // Package where step definition classes are
        plugin = {"pretty", "html:target/cucumber-reports"}, // Optional: reports and console output
        monochrome = true, // Optional: makes the console output more readable
        tags = "@LoginTest" // Optional: run specific tags if needed
)
public class TestRunner extends AbstractTestNGCucumberTests {
    // This class will run the feature files specified in @CucumberOptions
}

