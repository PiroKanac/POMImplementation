package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPage {

	@FindBy(name="fld_username") WebElement usernameTextBox;
	@FindBy(name="fld_email") WebElement emailTextBox;
	@FindBy(xpath="//*[@id=\"tab-content1\"]/form/input[4]") WebElement passwordTextBox;
	
	//*******Second Approach*************
	//@Find(how=How.XPATH, using="//*[@id=\\\"tab-content1\\\"]/form/input[4]") WebElement passwordTextBox;
	
	//**********When you don't wont to look for the element again in a method*************
	//@Find(how=How.XPATH, using="//*[@id=\\\"tab-content1\\\"]/form/input[4]")
	//@CacheLookup WebElement passwordTextBox;
	
	
	public void enterUsername() 
	{
		usernameTextBox.sendKeys("Testing");
	}
	
	public void enterEmail() 
	{
		emailTextBox.sendKeys("Testing");
	}
	
	public void enterPassword() 
	{
		passwordTextBox.sendKeys("abcd123");
	}
	
	public void enterConfirmPassword() 
	{
		
	}
	
	public void selectAddressTypeHome() 
	{
		
	}
}
