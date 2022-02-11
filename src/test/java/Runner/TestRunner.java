package Runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions
        (
                features = {"C:\\Users\\Jyoti\\Desktop\\com.bddFramework\\src\\test\\java\\FeatureFile\\homePageImage.feature"},
                glue= {"StepDefinations"},
                dryRun=true,
                monochrome = false,
               // strict = true
                plugin={"pretty","json:Report/Cucumber.json",
                        "junit:Report/XMLReport.xml",
                        "html:Report/cucumberReport"
                }
        )
public class TestRunner {


}
