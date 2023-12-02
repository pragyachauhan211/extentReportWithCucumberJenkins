package stepDefinition;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class extentReport1 {
	// public static int reportAlreadyInit=1;
	public static int ID = 1;
	public int counter=1;
	public static ExtentReports extentReporter;
	public static File file = new File("C:\\Users\\pragy\\OneDrive\\Desktop\\ExtentRepNew\\REPORT\\ExtentReport.html");
	static List<Integer> list = new ArrayList<Integer>();	
	stepDef stepDefObj = new stepDef();
	
	public void extentReportPopUp() throws Throwable
	{
		stepDefObj.check_more_outcomes();
		list.add(counter);	
		counter++;		
		System.out.println("The list is: "+list.toString());
		System.out.println("The list size is "+list.size());
				
	}
	

	public static int generateReport() throws Exception {

		if (ID == 1) {
			extentReport1.initReport();
		}

		return ID;

	}

	public static void initReport() throws Exception {
		extentReporter = new ExtentReports();
		ExtentSparkReporter spark = new ExtentSparkReporter(file);
		// spark.loadJSONConfig(new
		// File("C:\\Users\\arvin\\eclipse-workspace\\ExtentReport2\\src\\test\\resources\\extentInJSON.json"));
		extentReporter.attachReporter(spark);
		// extentReporter.flush();
		// Desktop.getDesktop().browse(file.toURI());
	}

	public static void main(String[] args) throws Throwable {

	}
}
