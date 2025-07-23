package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


/**
 * Created by JP on 5/22/17.
 */
@CucumberOptions(
        glue = "steps",
        plugin = {"pretty","json:target/cucumber.json"},
        features = {"src/test/java/features"}
)
public class TestNGRunner extends AbstractTestNGCucumberTests {
}
