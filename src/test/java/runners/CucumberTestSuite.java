package runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "stepdefinition",
        plugin = {"pretty", "html:target/cucumber-reports.html"},
        snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class CucumberTestSuite {
}
