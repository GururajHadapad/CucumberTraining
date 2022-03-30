package StepDefinations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import util.Base;
import util.Pages;

public class LoginStepDefinations {

	private Base base;

	public LoginStepDefinations(Base base) {
		this.base=base;
	}


	@Given("I will enter the URL")
	public void i_will_enter_the_url() {
		base.driver.get("http://localhost:8888/");
	}
	@When("Loginpage is displayed i will enter the valid username and password")
	public void loginpage_is_displayed_i_will_enter_the_valid_username_and_password() {
		//	    driver.findElement(By.name("user_name")).sendKeys("admin");
		//	    driver.findElement(By.name("user_password")).sendKeys("admin");
		Pages.loginPage.logUnPwBL("admin", "admin");

	}
	@When("I will click on the login button")
	public void i_will_click_on_the_login_button() {
		//driver.findElement(By.id("submitButton")).click();
		Pages.loginPage.getLoginButton().click();
	}
	@Then("I will verify homepage is displayed or not")
	public void i_will_verify_homepage_is_displayed_or_not() {
		String actlTitle = base.driver.getTitle().trim();
		Assert.assertEquals(actlTitle, "Administrator - Home - vtiger CRM 5 - Commercial Open Source CRM");
		
	}

	@When("Loginpage is displayed i will enter the invalid username and invalid password")
	public void loginpage_is_displayed_i_will_enter_the_invalid_username_and_invalid_password() {
		//driver.findElement(By.name("user_name")).sendKeys("adm");
		// driver.findElement(By.name("user_password")).sendKeys("adm");
		Pages.loginPage.logUnPwBL("adm", "adm");

	}
	@Then("I will verify error message is displayed or not")
	public void i_will_verify_error_message_is_displayed_or_not() {
		String actlErrMsg = base.driver.findElement(By.xpath("//div[@class='errorMessage']")).getText().trim();
		Assert.assertEquals(actlErrMsg, "You must specify a valid username and password.");

	}
}
