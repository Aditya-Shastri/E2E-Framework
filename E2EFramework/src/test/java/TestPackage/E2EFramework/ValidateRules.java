package TestPackage.E2EFramework;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Resources.Base;
import junit.framework.Assert;
import pageObject.LoginPage;
import pageObject.TimeSlotPage;

public class ValidateRules extends Base
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
		
		TS1.CheckRule().click();
		
		//Add Implicit Wait
		
	    driver.manage().timeouts().implicitlyWait(100,TimeUnit.MICROSECONDS);
	    
	    driver.navigate().back();
	    
	    Assert.assertEquals(TS1.ValidateUserName().getText(), "welcome Shastriji");
	
		
	}	

    @AfterTest  
    public void Teardown()
    {
    	
      driver.manage().timeouts().implicitlyWait(50,TimeUnit.MICROSECONDS);
  	  
      driver.close();
  	  
      driver = null;
    }
  	
	
	
}
