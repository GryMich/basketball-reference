package pl.bbr.grymich.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import pl.bbr.grymich.BbrTest;

public class Logowanie {
	
	WebDriver driver; 
	
	@FindBy (linkText = "Login")
	WebElement LoginLink; 
	
public Logowanie () {
	driver = BbrTest.openBbr (); 
	
}
	public void goToLoginPage () {
		LoginLink.click ();
	}

}
