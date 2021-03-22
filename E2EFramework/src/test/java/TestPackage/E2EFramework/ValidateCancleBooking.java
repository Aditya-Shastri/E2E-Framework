package TestPackage.E2EFramework;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Resources.Base;
import junit.framework.Assert;
import pageObject.CancleBookPage;
import pageObject.LoginPage;
import pageObject.TimeSlotPage;

public class ValidateCancleBooking extends Base
{

	@BeforeTest
	public void Initalize() throws IOException {
		
				
		driver=GetData();
		
		driver.get(DataProperties.getProperty("url"));
		
	}
	
   @Test
	
	public void ValidateLogin() throws IOException
	{
		
		LoginPage Obj1 = new LoginPage(driver);
		
		Obj1.UserNameField().sendKeys(DataProperties.getProperty("Username"));
		
		Obj1.PasswordField().sendKeys(DataProperties.getProperty("Password"));
		
		Obj1.SubmitButton().click();
			
        TimeSlotPage TS1 =new TimeSlotPage(driver);
		
		TS1.ValidateBookingCancel().click();
			
	/*	CancleBookPage CB1 = new CancleBookPage(driver);
		
		System.out.println("Court number :" +CB1.ActivityName().getText());
		
		System.out.println("BookedFrom :" +CB1.BookedFrom().getText());
		
		System.out.println("BookedTo :" +CB1.BookedTo().getText());
		
		System.out.println("BookedBy :" +CB1.BookedBy().getText());
		
		System.out.println("PlayerName :" +CB1.PlayerName().getText());	*/
		
		//Cancel the booking
      	
	//	CB1.CancleButton().click();
		
		driver.navigate().refresh();
		
		driver.navigate().back();//navigation back to home page
		
        //Add Implicit Wait
		
	    driver.manage().timeouts().implicitlyWait(100,TimeUnit.MICROSECONDS);
	
	
		TS1.ValidateLogout().click();
		
        //Add Implicit Wait
		
	    driver.manage().timeouts().implicitlyWait(100,TimeUnit.MICROSECONDS);
		
	}

@AfterTest  
public void Teardown()
{
	  driver.close();
	  driver= null;
}
	
	
}
