package Runner_files;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(
		plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
		features = "src\\main\\java\\Refer_a_friend_positive_scenario\\Refer_a_friend_positive_scenario.feature",
		glue= {"Refer_a_friend_positive_scenario"},
		monochrome = true,publish = true)

public class Refer_a_friend_positive_scenario_runner extends AbstractTestNGCucumberTests {

}
