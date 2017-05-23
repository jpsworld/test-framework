package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;


/**
 * Created by JP on 5/22/17.
 */
@CucumberOptions(
        glue = "steps",
        format = {"json:target/cucumber.json", "html:target/site/cucumber-pretty"},
        features = {"src/test/java/features"}
)
public class TestNGRunner extends AbstractTestNGCucumberTests {
}
