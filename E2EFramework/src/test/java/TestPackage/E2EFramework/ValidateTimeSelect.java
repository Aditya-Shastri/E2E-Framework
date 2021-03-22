package TestPackage.E2EFramework;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Resources.Base;
import junit.framework.Assert;
import pageObject.AddPlayerComfirmPage;
import pageObject.LoginPage;
import pageObject.TimeSlotPage;

public class ValidateTimeSelect extends Base {
	
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
			
		TimeSlotPage Login1 = new TimeSlotPage(driver);
		
		Assert.assertEquals(Login1.ValidateUserName().getText(), "welcome Shastriji");
		
		//Add Implicit Wait
		
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.MICROSECONDS);
	
		//Date Entered for Booking
		
		Login1.Enterdate().click();
		
		Login1.Enterdate().clear();
		
		Login1.Enterdate().sendKeys(DataProperties.getProperty("Date"));
		
		Login1.DateSelect().click();
		
		//Add Implicit Wait
		
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.MICROSECONDS);
		
		//Select Sports Activity
		
		 Select Sel2 =new Select(Login1.SelectActivity());
		
		 Sel2.selectByValue("2");
		 
		//show appointment
		 
		 Login1.ShowAppointment().click();
		 
		//Add Implicit Wait
			
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			
		//Select the TimeSlot
	
		Login1.NavigatetoConfirm().click();
		
		//Add Implicit Wait
		
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.MICROSECONDS);
				
		
		
	}
				
  @AfterTest  
  public void Teardown()
  {
	  driver.close();
	  driver= null;
  }
		
		
}


