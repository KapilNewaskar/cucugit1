package stepDefination;

import org.apache.tools.ant.types.CommandlineJava.SysProperties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObject.LoginPage;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class LoginTest {

	public LoginPage Loginpg;
	public WebDriver driver;

	@Given("User should launch chrome browser")
	public void user_should_launch_chrome_browser() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		Loginpg = new LoginPage(driver);
	}

	@When("User open URL {string}")
	public void user_open_url(String URL) {
		driver.get(URL);
	}

	@When("User enters Email {string} and password {string}")
	public void user_enters_email_and_password(String EmailAdd, String Password) {
		Loginpg.enterEmail(EmailAdd);
		Loginpg.enterPassword(Password);

	}

	@When("click on login")
	public void click_on_login() {
		Loginpg.clickOnLoginBtn();

	}

	@Then("Page title should be {string}")
	public void page_title_should_be(String expectedTitle) {

		String actualTitle = driver.getTitle();
		if (actualTitle.equals(expectedTitle)) {
			System.out.println("Title of the page is: " + expectedTitle);
	}
		else {
			System.out.println("Title of the page should be: " + expectedTitle + " but found: " + actualTitle);
		Assert.assertTrue(false);
		}
	}

	@When("User click on logout")
	public void user_click_on_logout() {
		Loginpg.clickOnLogoutBtn();
	}

	@Then("Close browser")
	public void close_browser() throws Exception {
		Thread.sleep(5000);
		driver.quit();

	}
}
