package testClasses;

import java.io.IOException;

import org.testng.annotations.Test;

import extentListners.TestNGListners;
import utility.ReadPropData;
import utility.TimeValueGenerator;

public class RegisterTest extends TestNGListners {
	@Test(priority = 1)
	public void registerUser() throws IOException
	{
		test.info("Clicking on register");
		register.clickOnRegister();
		test.info("entering the details of user");
		ReadPropData rp = new ReadPropData();
		
		String data = rp.getPropData("emailaddress");
		
		register.enteringDetails(TimeValueGenerator.getTime()+data);
	}
	@Test(priority = 2)
	public void navToLoginPage()
	{
		test.info("Clicking on login button");
		register.clickOnLoginButton();
	}

}
