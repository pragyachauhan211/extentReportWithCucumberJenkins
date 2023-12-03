package stepDefinition;

import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class stepDefTest {
	 WebDriver driver;
	
	public static ExtentTest extentTest;
	//extentReport1 extentReport1Obj = new extentReport1();
	
	@BeforeMethod
	public void setUp()
	{
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\pragy\\OneDrive\\Desktop\\ExtentRepNew\\Driver\\chromedriver.exe");		                                              
		  driver = new ChromeDriver();
		  String url = "https://www.browserstack.com/users/sign_in";
		  driver.get(url);
	}
	
	  @Given("^hit the url$")
	    public void hit_the_url() throws Throwable {
        
		  extentReport1Test.extentReporter.flush(); 
		  
		  setUp();
		  extentTest.log(Status.PASS, "Hitting the url");
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		  
	       
	    }

	    @When("^enter username$")
	    public void enter_username() throws Throwable {
	    	
	    	WebElement user = driver.findElement(By.xpath("//input[@id='user_email_login']"));
			user.sendKeys("Pragya");
			extentTest.log(Status.PASS, "Username is entered");
	    	
	    }

	    @Then("^error should come$")
	    public void error_should_come() throws Throwable {
	    	try 
	    	{
	    		
	    	try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}	
	    	
	     WebElement emailError = driver.findElement(By.xpath("//span[text()='Invalid Email']"));
	     String email = emailError.getText();
	     System.out.println(email);
	     
	     //extentTest.pass("Invalid email message: Passed");
	     extentTest.log(Status.PASS, "Email message is showing");
	    	}
	    	 catch (Exception e) {
					e.printStackTrace();
					 //extentTest.fail("Invalid email message: Failed");
				     extentTest.log(Status.FAIL, "Invalid email message: Failed");
				}	
	    }

	    @Given("^maximize it$")
	    public void maximize_it() throws Throwable {
	        
	  			driver.manage().window().maximize();
	  			extentTest.log(Status.PASS, "Window is maximized");
	  			driver.findElement(By.xpath("//button[@id='accept-cookie-notification']")).click();
	      
	    }

	    @When("^and enter password$")
	    public void and_enter_password() throws Throwable {
	    	WebElement password = driver.findElement(By.xpath("//input[@id='user_password']"));
			password.sendKeys("Pragya"); 
			extentTest.log(Status.PASS, "Password is entered");
	    }

	    @Then("^close the browser$")
	    public void check_more_outcomes() throws Throwable {
	        System.out.println("Check more outcomes");
	        driver.quit();
	        extentTest.log(Status.PASS, "Browser closed");
	        extentReport1Test.extentReporter.flush(); 
	    }
	    
	    @Then("^display sign in content$")
	    public void display_sign_in_content() throws Throwable 
	    {
	        Thread.sleep(2000);
	        WebElement SignIn = driver.findElement(By.xpath("(//h1[@class='heading'])[1]"));
	        String sign = SignIn.getText();
	        System.out.println("Content is: "+sign);
	    }
	    
	    @Given("^To check if error message is showing and for that,$")
	    public void to_check_if_error_message_is_showing_and_for_that() throws Throwable {
	    	 extentReport1Test.generateReport();
	          
			  extentTest = extentReport1Test.extentReporter
					  .createTest("Test Case ID: "+extentReport1Test.ID+"<br>"+"<FONT COLOR='GREY'>"+"<i>To check if error message is showing</i></FONT>");
			  extentReport1Test.ID++;
	    }
	    
	    @Given("^To check launching of browser and for that,$")
	    public void to_check_launching_of_browser_and_for_that() throws Throwable {
	    	extentReport1Test.generateReport();
	          
			  extentTest = extentReport1Test.extentReporter
					  .createTest("Test Case ID: "+extentReport1Test.ID+"<br>"+"<FONT COLOR='GREY'>"+"To check launching of browser and for that,</i></FONT>");
			  extentReport1Test.ID++;
	    }

	    
		}	



