package cucumber.examples.java.testNG.runners;

import com.github.mkolisnyk.cucumber.reporting.CucumberResultsOverview;
import com.github.mkolisnyk.cucumber.runner.ExtendedParallelCucumber;
import org.junit.runner.RunWith;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import com.github.mkolisnyk.cucumber.runner.ExtendedCucumber;
import com.github.mkolisnyk.cucumber.runner.ExtendedCucumberOptions;

import cucumber.api.CucumberOptions;

@RunWith(ExtendedParallelCucumber.class)
@ExtendedCucumberOptions(jsonReport = "target/cucumber-report/cucumber.json",
        jsonUsageReport = "target/cucumber-report/cucumber-usage.json",
        usageReport = true,
        detailedReport = true,
        detailedAggregatedReport = true,
        overviewReport = true,
        outputFolder = "target")
@CucumberOptions(plugin = { "html:target/cucumber-report/chrome",
        "json:target/cucumber-report/chrome/cucumber.json", "pretty:target/cucumber-report/chrome/cucumber-pretty.txt",
        "usage:target/cucumber-report/chrome/cucumber-usage.json", "junit:target/cucumber-report/chrome/cucumber-results.xml" },
        features = { "target/test-classes/features" },
        glue = { "cucumber.examples.java.testNG.stepDefinitions" },
        tags = {"@bug_check"}
        )
public class RunCukesTestInTestNG extends AbstractTestNGCucumberTests {

}