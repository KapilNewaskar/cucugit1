package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver ldriver;
	
	public LoginPage(WebDriver rDriver ){
		ldriver=rDriver; // rDriver = remote driver
		PageFactory.initElements(rDriver, this);
	}
	
	@FindBy(id= "Email")
	WebElement email;
	
	@FindBy(id= "Password")
	WebElement password;
	
	@FindBy(xpath= "//button[@class='button-1 login-button']")
	WebElement loginBtn;
	
	@FindBy(linkText = "Logout")
	WebElement logoutBtn;
	
	public void enterEmail(String EmailAdd) {
		email.clear();
		email.sendKeys(EmailAdd);
	}
	
	public void enterPassword(String Password) {
		password.clear();
		password.sendKeys(Password);
	}
	
	public void clickOnLoginBtn() {
		loginBtn.click();
	}
	
	public void clickOnLogoutBtn() {
		logoutBtn.click();
	}
	
}
