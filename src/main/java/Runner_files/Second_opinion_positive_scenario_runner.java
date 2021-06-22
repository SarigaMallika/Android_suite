package Runner_files;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
features = "src\\main\\java\\Second_opinion_positive_scenario\\Second_opinion_positive_scenario.feature",
glue= {"Second_opinion_positive_scenario"},
monochrome = true,publish = true)
public class Second_opinion_positive_scenario_runner extends AbstractTestNGCucumberTests{

}
