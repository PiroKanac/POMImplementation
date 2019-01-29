package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class InstanciateDriver 
{
  
	public WebDriver driver;
	
	@BeforeMethod
	public void startBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vnikolic\\Downloads\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://thetestingworld.com/testings");
	}
	
	@AfterMethod
	public void closeBrowser() {
		driver.close();
	}
	
}
