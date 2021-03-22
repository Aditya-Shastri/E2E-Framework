package Resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base {
	
	//Data Driven access define for the data property file
	
	//Declear the Driver here as Global veriable
	
	public static WebDriver driver;
	public Properties DataProperties;
	

public WebDriver GetData() throws IOException {
	
DataProperties = new Properties();
	
FileInputStream Fis = new FileInputStream("G:\\Workspace\\E2EFramework\\src\\main\\java\\Resources\\Data.properties");
	
DataProperties.load(Fis);	

String BrowserName = DataProperties.getProperty("Browser");

System.out.println(BrowserName);

if(BrowserName.equalsIgnoreCase("Chrome"))
{
	System.setProperty("webdriver.gecko.driver","G:\\Workspace\\learnSelenium1\\lib\\Gikodriver\\geckodriver.exe");
	
	driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	
	
}

else if(BrowserName.equalsIgnoreCase("FireFox"))

{
	System.setProperty("webdriver.gecko.driver","G:\\Workspace\\learnSelenium1\\lib\\Gikodriver\\geckodriver.exe");
	
    driver = new FirefoxDriver();
	
	driver.manage().window().maximize();
}

    //driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

    return driver;

}

public void getScreenshot(String result) throws IOException
{
	File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(src, new File("C://test//"+result+"screenshot.png"));
	
}

/*
//Take Screenshot from the page on success
 * 

public void getPassScreenshot(String Testcase) throws IOException
{
	File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	
	FileUtils.copyDirectory(src, new File("F://Test Screenshots//Test Pass Screenshots//" +Testcase + "Screenshot.png"));
	
}

//Take Screenshot from the page on Fail

public void getFailScreenshot(String Testcase) throws IOException
{
	File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	
	FileUtils.copyDirectory(src, new File("F://Test Screenshots//Test Fail Screenshots//" +Testcase + "Screenshot.png"));
	

}*/
}