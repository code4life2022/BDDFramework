package Runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        glue = "Step_definitions",
        //features = "src/test/resources/Features",
       // features = "src/test/resources/Features/cartFunctionality.feature",
        features = "src/test/resources/Features/login.feature",

        dryRun = false,
        tags = "@scenario_outline",
        plugin = {
                "html:report/default-report",
                "json:report/cucumber.json"
        }






)
public class CucumberRunner {


}
