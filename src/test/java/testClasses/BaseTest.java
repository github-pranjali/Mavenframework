package testClasses;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import pompage.LoginPage;
import pompage.RegisterPage;
import utility.ReadPropData;

public class BaseTest {
	public LoginPage loginpage;
	public RegisterPage register;
	
	public static WebDriver driver;
	@BeforeSuite
	public void initBrowser() throws IOException
	
	{
ChromeOptions options = new ChromeOptions();
		
	options.addArguments("start-maximized");
		options.addArguments("--incognito");
		
	//	options.addArguments("window-size=1400,3468");
		
	//	options.addArguments("--Headless");
	ReadPropData rp = new ReadPropData();
	String browserName = rp.getPropData("browser");
		
	if(browserName.equals("Chrome"))
	{
	
	 driver = new ChromeDriver(options);
	}
	else if(browserName.equals("Firefox"))
	{
		driver = new FirefoxDriver();
	}
		// driver.manage().window().maximize();
		 driver.get("https://rahulshettyacademy.com/client");
		
	}
	
	@BeforeClass
	public void createObject()
	{
		 loginpage = new LoginPage(driver);
		 
		 register = new RegisterPage(driver);
				 
	}
	
	@AfterSuite
	public void tearDown()
	{
		driver.quit();
	}

}
