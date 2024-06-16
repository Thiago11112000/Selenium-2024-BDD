package runner;

import io.cucumber.java.After;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"json:target/reports/cucumberTestes.json" , "html:target/reports.html"},
        features = "src/test/resources/features",
        glue = {"steps"},
        tags = "@login"
)
public class RunTests extends RunBase {
    @AfterClass
    public static void stop() {
     getDriver().quit();
        }
    }

