package runner;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
        features="features",
        glue="stepDefinition",
        plugin={"json:target/cucumber.json","pretty","html:target/cucumber-reports"},
        tags="@number_of_rooms"
)
public class TestRunnerNew {

}

