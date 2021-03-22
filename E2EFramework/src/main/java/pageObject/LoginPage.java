package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	
   public WebDriver driver;
   
   //xpath for the Objects present in the Login Page
	
   By UserName =By.id("Email");
   By Password = By.id("Password");
   By LoginButton =By.xpath("//button[@class='button btn btn-success btn-large']");
/**
 * @param driver
 */
   public LoginPage(WebDriver driver) {
	
	this.driver = driver;

   }
   
   //Get UserName field
   
   public WebElement UserNameField() {
	   
	   return driver.findElement(UserName);
   }
   
   //Get Password Field
   
   public WebElement PasswordField() {
	   
	   return driver.findElement(Password);
   }
   
   //Submit Button
   
    public WebElement SubmitButton() {
	   
	   return driver.findElement(LoginButton);
   }
   
   
   
}
