package TestRunner;

import org.junit.runner.RunWith;
	
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "C:\\Users\\newas\\eclipse-workspace\\Cucumber_Project\\Feature\\LoginFeature.feature",
		glue = "stepDefination",
		tags  = "@sanity" ,
		dryRun = false,
		monochrome = true,
		plugin= {"pretty","html:target/Cucumber_Report/reports_html.html"}
		)

public class Run {
// Do not write here
}
