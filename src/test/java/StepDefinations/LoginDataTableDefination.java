package StepDefinations;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import util.Base;
import util.Pages;

public class LoginDataTableDefination {
	
	private Base base;

	public LoginDataTableDefination(Base base) {
		this.base=base;
	}
	
	
	
	@Given("I will enter the Url")
	public void i_will_enter_the_url() {
	base.driver.get("http://localhost:8888/");
	}
	@When("In Login page i will enter username and password")
	public void in_login_page_i_will_enter_username_and_password(DataTable dataTable) {
		System.out.println(dataTable);
		List<List<String>> data = dataTable.asLists();
		String username = data.get(0).get(0);
		String password = data.get(0).get(1);
//		driver.findElement(By.name("user_name")).sendKeys(username);
//	    driver.findElement(By.name("user_password")).sendKeys(password);
		Pages.loginPage.logUnPwBL(username, password);
	}
	@When("I will click on login button")
	public void i_will_click_on_login_button() {
		//driver.findElement(By.id("submitButton")).click();
		Pages.loginPage.getLoginButton().click();
	}
	@Then("I will verify Homepage is displayed r not")
	public void i_will_verify_homepage_is_displayed_r_not() {
		String actlTitle = base.driver.getTitle().trim();
		   Assert.assertEquals(actlTitle, "Administrator - Home - vtiger CRM 5 - Commercial Open Source CRM");
		  
	}
}
