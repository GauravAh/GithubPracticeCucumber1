package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/features",
        glue ={"stepdefinitions","hooks"},
        monochrome = true,
        dryRun = false,
        tags = "@sanity",
        plugin = {"pretty",
                "html:target-reports/cucumber-reports/cucumber.html",
        },
        publish = true
)
public class TestRunner extends AbstractTestNGCucumberTests {
}
