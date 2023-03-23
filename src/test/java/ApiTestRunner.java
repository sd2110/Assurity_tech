import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/featurefiles",
        glue = {"stepdefinitions"},
        plugin = { "pretty", "html:target/cucumber-reports/APIAutomationReport.html" },
        monochrome = true
)

public class ApiTestRunner {

}

