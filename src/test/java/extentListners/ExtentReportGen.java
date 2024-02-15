package extentListners;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportGen {
	
		
		
		static ExtentReports extent;
		
		
		public static ExtentReports extentReportGenerator() {
			
			String file =System.getProperty("user.dir")+"//reports//9SeptBatchReport.html";
		
		ExtentHtmlReporter reporter=new ExtentHtmlReporter (file);
		
		
		reporter.config().setTheme(Theme.DARK);
		reporter.config().setReportName("AutomationTestReport");
		
		 extent =new ExtentReports();
		
		extent.attachReporter(reporter);
		
		extent.setSystemInfo("Environment","QA");
		extent.setSystemInfo("Executed by","9 Sept Batch");
		
		extent.setSystemInfo("Executed on", "Chrome browser");
		return extent;
		}
		

	}




