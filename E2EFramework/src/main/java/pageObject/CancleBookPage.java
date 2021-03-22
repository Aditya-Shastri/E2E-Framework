package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CancleBookPage {
	
   public WebDriver driver;
   
   //xpath for the Objects present in the Login Page
	
   By ActivityName =By.xpath("//div[@class='widget-content']/table//tr[2]/td[1]");
   By BookedFrom =By.xpath("//div[@class='widget-content']/table//tr[2]/td[2]");
   By BookedTo =By.xpath("//div[@class='widget-content']/table//tr[2]/td[3]");
   By BookedBy =By.xpath("//div[@class='widget-content']/table//tr[2]/td[4]");
   By PlayerName = By.xpath("//div[@class='widget-content']/table//tr[2]/td[5]");
   By CancleBooking = By.xpath("//a[@class='btn btn-danger']");
   
/**
 * @param driver
 */
   public CancleBookPage(WebDriver driver) {
	
	this.driver = driver;

   }
   
   //Get Activityname
   
   public WebElement ActivityName() {
	   
	   return driver.findElement(ActivityName);
   }
   
   //Get BookedFrom
   
   public WebElement BookedFrom() {
	   
	   return driver.findElement(BookedFrom);
   }
   
   //Submit BookedTO
   
    public WebElement BookedTo() {
	   
	   return driver.findElement(BookedTo);
   }
   
    //Submit Booked By
   
    public WebElement BookedBy() {
 	   
 	   return driver.findElement(BookedBy);
    }
    
    
    public WebElement PlayerName() {
 	   
 	   return driver.findElement(PlayerName);
    }
    
    
    public WebElement CancleButton() {
 	   
 	   return driver.findElement(CancleBooking);
    }
    
    
    
    
    
}
