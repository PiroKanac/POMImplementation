package testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Base.InstanciateDriver;
import pages.RegisterPage;

public class TC_001 extends InstanciateDriver{

	@Test
	public void tcase1() {
		//Approach 1
		//RegisterPage register = PageFactory.initElements(driver, RegisterPage.class);
		
		//Approach 2
		RegisterPage register = new RegisterPage();
		PageFactory.initElements(driver, register);
		
		register.enterUsername();
		register.enterEmail();
		register.enterPassword();
		
	}
}
