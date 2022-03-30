package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions
(
		features = {".\\src\\test\\java\\Features"},
		glue = {"StepDefinations"},
		dryRun = false,
		plugin = {"pretty",
				"html:cucumber.html",
                "json:cucumber.json"
		},
		monochrome = true
		
		
		)

public class RunnerIo extends AbstractTestNGCucumberTests{

}
