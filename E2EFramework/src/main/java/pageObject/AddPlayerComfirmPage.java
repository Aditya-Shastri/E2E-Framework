package pageObject;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;

public class AddPlayerComfirmPage {
	
      public WebDriver driver;
	
	//xpath for the Time Player selection page
	
	By SlotFull = (By.xpath("//label[@id='lbler']"));
	By EnterName =(By.xpath("//input[@id='tags']"));
	By AddName=(By.xpath("//input[@id='btnadd']"));
	By SaveButton =(By.xpath("//input[@id='btnSave']"));
	
	
	
	//defining COnstructor
	
		public AddPlayerComfirmPage(WebDriver driver) {
			
			this.driver = driver;

		   }
		
		public WebElement Slotcheck() {
			   
			   return driver.findElement(SlotFull);
		   }
		 	
		public WebElement GetName() {
			   
			   return driver.findElement(EnterName);
			   
		   }
		
		public WebElement AddName() {
			   
			   return driver.findElement(AddName);
		   }

		public WebElement GetBooking() {
			   
			   return driver.findElement(SaveButton);
		   }
}
