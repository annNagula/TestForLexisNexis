package suites;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

/**
 * Created by Anu on 09/04/24.
 */

@CucumberOptions(
        features = "src/test/resources/features",
        glue = "stepDefinitions",
        tags = "@suite",
        plugin = {"pretty", "html:target/cucumber-reports"}
)
public class RunSuite extends AbstractTestNGCucumberTests {

}