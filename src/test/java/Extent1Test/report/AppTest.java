package Extent1Test.report;

import org.testng.annotations.AfterClass;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import stepDefinition.extentReport1Test;
import java.awt.Desktop;

public class AppTest {

	// @RunWith(Cucumber.class)
	@CucumberOptions(features = "src/test/java/feature", glue = "stepDefinition", tags = "@basic", dryRun = false,
			// "com.avenstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
			plugin = { "pretty" }, monochrome = true)

	public class testNGRunner extends AbstractTestNGCucumberTests
	// public class testNGRunner
	{

		@AfterClass
		public void extentReportPopUp() throws Throwable {
			Desktop.getDesktop().browse(extentReport1Test.file.toURI());
		}

	}

}
