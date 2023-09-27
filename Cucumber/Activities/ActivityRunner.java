package TestRunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

//@RunWith(Cucumber.class)
//@CucumberOptions(
//        features = "features",
//        glue = {"stepDefinitions"},
//       // tags = "@activity1"
//        tags = "@activity2"
//)

//@RunWith(Cucumber.class)
//@CucumberOptions(
//        features = "features",
//        glue = {"stepDefinitions"},
//        //tags = "@activity3"
//        //tags = "@activity4"
//        tags = "@activity5"
@RunWith(Cucumber.class)
@CucumberOptions(
        features = "features",
        glue = {"stepDefinitions"},
        tags = "@SimpleAlert",
        plugin = {"json: test-reports-test/json-report.json"},
        monochrome = true
)


public class ActivityRunner {
    //empty
}