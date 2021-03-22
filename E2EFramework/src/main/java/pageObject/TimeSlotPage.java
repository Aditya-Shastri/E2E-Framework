package pageObject;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;

public class TimeSlotPage {
	
	public WebDriver driver;
	
	//xpath for the Time slot selection page
	
	By DateChoise = By.xpath("//input[@id='DateFrom']");
	By DateSelect= By.xpath("//img[@class='ui-datepicker-trigger']");
	By ActivitySelect =By.id("Activity");
	By AppointmentShow = By.xpath("//button[@id='btnshow']");
	By TimeSelect =By.xpath("//div[@id='result']/div[2]/div[1]/a[@class='shortcut Available'][2]"); // for selecting the time slot 1PM to 2 PM
	By Username = By.xpath("//h2[contains(text(),'welcome Shastriji')]");
	By AFterLogin =By.xpath("//a[@class='dropdown-toggle']//h2[contains(text(),'welcome Shastriji')]");
	By Logout =By.xpath("//a[@class='dropdown-toggle'][contains(@href,'/Logout')]");
	By Rules = By.xpath("//a[contains(@href,'/Rules')]");
	By CancelBooking = By.xpath("//a[contains(@href,'/CancelBooking')]");
	By Help = By.xpath("//a[contains(@href,'/Help')]");
	
	
//defining COnstructor
	
	public TimeSlotPage(WebDriver driver) {
		
		this.driver = driver;

	   }

//Select Help option
	
	 public WebElement ValidateHelp() {
		   
		   return driver.findElement(Help);
	   }
	
//Select WebElement for Entering Date
	
	 public WebElement Enterdate() {
		   
		   return driver.findElement(DateChoise);
	   }
	//Select WebElement for Entering Date
	 
	 public WebElement DateSelect() {
		   
		   return driver.findElement(DateSelect);
	 }
	 
//Select WebElement for Validate Username after login
	 
	 public WebElement ValidateUserName() {
		   
		   return driver.findElement(AFterLogin);
	   }

	//Select WebElement for Logout
	 
	 public WebElement ValidateLogout() {
		   
		   return driver.findElement(Logout);
		   
	   }
	 
	 //Select WebElement for Help
	 
	 public WebElement CheckRule() {
		   
		   return driver.findElement(Rules);
	   }
	 
	 //Select WebElement for CancelBooking
	 public WebElement ValidateBookingCancel() {
		   
		   return driver.findElement(CancelBooking);
	   }
	 
	//Select WebElement for SelectActivity
	
	 public WebElement SelectActivity() {
		   
		   return driver.findElement(ActivitySelect);
	   }

	//Select WebElement for Show Appointment
	 
	 public WebElement ShowAppointment() {
		   
		   return driver.findElement(AppointmentShow);
	   }
	 
	//Select WebElement for Confirm Button
	 
	 public WebElement NavigatetoConfirm() {
		   
		   return driver.findElement(TimeSelect);
	   }
}
