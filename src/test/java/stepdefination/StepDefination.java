package stepdefination;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Assert;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.ReadConfig;
import webtransProject.Login;

public class StepDefination extends Base {
	
	@Before
	public void setUp() throws Exception {
		
		readConfig = new ReadConfig();		//create obj of ReadConfig java class
		System.out.println("setup method executed");
		
		String browser =  readConfig.getBrowser(); //browser = chrome
		if(browser.equalsIgnoreCase("Chrome")) {
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			Thread.sleep(1000);
		}else if(browser.equalsIgnoreCase("firefox")) {
			driver=new FirefoxDriver();
			driver.manage().window().maximize();
		}else if(browser.equalsIgnoreCase("IE")) {
			driver=new InternetExplorerDriver();
		}
		
	}
	
	
		
	
	@Given("User Launch Chrome Browser")
	public void user_launch_chrome_browser() throws Exception {
//		System.setProperty("webdriver.chrome.driver","E:\\Nalini\\automation testing\\SOFTWARE\\chromedriver_win32\\chromedriver.exe");
//		driver = new ChromeDriver();
	//	Thread.sleep(2000);
	//	ChromeOptions chromeOptions = new ChromeOptions();
		//chromeOptions.addArguments("--remote-allow-origins=*","ignore-certificate-errors");

		//driver = new ChromeDriver();
		
		Log = new Login(driver);
		Thread.sleep(2000);

	}

	@When("User Open URL {string}")
	public void user_open_url(String url) throws Exception {
		driver.get(url);
		Thread.sleep(2000);

		  driver.manage().window().maximize();
		  Thread.sleep(2000);
	    
	}

	@When("user enter unmae as {string} and  pwd as  {string}")
	public void user_enter_unmae_as_and_pwd_as(String string, String string2) {
	
		Log.setUserName(string);
		Log.setPassword(string2);
			  
	}

	@When("click on Login button")
	public void click_on_login_button() {
	    Log.clickLogin();
	}

	@Then("Page title should be {string}")
	public void page_title_should_be(String string) {
		Assert.assertEquals(string, driver.findElement(By.xpath("//h2[text()='WebTrans']")).getText());
	
	}
	
	@When("User Select Branch as {string}")
	public void user_select_branch_as(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("Select Fin_Yr as {string}")
	public void select_fin_yr_as(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("Click on Submit Button.")
	public void click_on_submit_button() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	
	@Then("Close Broswer")
	public void close_broswer() {
	    driver.close();
	}
	
	@After
	public void tearDown(Scenario sc) throws Exception {
		
		System.out.println("Tear down method executed");
		
		if(sc.isFailed()==true) {
			
			String filewithPath="C:\\Users\\Admin\\eclipse-workspace\\MavenProject23\\Screeshot\\failedScrenshot.png";
		
			//convert WebDriver object into TakeScreenshot
			
			TakesScreenshot scrShot=((TakesScreenshot)driver);
			
			//call getScreenshotAs to store image file
			
			File scrFile=scrShot.getScreenshotAs(OutputType.FILE);
			
			File destFile=new File(filewithPath);
			
			try {
				FileUtils.copyFile(scrFile, destFile);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		}
		
		Thread.sleep(2000);
		driver.quit();
	}

	
}
