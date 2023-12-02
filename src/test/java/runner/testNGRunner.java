package runner;

import java.awt.Desktop;
import org.testng.annotations.AfterClass;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import stepDefinition.extentReport1;

//@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/feature", glue = "stepDefinition", tags = "@basic", dryRun = false,
		// "com.avenstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
		plugin = { "pretty" }, monochrome = true)
 
public class testNGRunner extends AbstractTestNGCucumberTests
//public class testNGRunner
{
 
	@AfterClass
	public void extentReportPopUp() throws Throwable 
	{
		Desktop.getDesktop().browse(extentReport1.file.toURI());
	}

}
