package StepDefinations;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import util.Base;
import util.Pages;

public class CreateOrgStepDefination {

	private Base base;

	public CreateOrgStepDefination(Base base) {
		this.base=base;
	}



	@Given("I will enter the URL {string}")
	public void i_will_enter_the_url(String URL) {
		base.driver.get(URL);
	}
	@Given("In Loginpage i will enter username {string} and password {string}")
	public void in_loginpage_i_will_enter_username_and_password(String username, String password) {
		//		base.driver.findElement(By.name("user_name")).sendKeys(username);
		//		base.driver.findElement(By.name("user_password")).sendKeys(password);
		Pages.loginPage.logUnPwBL(username, password);
	}
	@Given("Click on login button")
	public void click_on_login_button() {
		//base.driver.findElement(By.id("submitButton")).click();
		Pages.loginPage.getLoginButton().click();;
	}
	@When("In Homepage click on organization link")
	public void in_homepage_click_on_organization_link() {
		//base.driver.findElement(By.xpath("//a[text()='Organizations']")).click();
		Pages.homePage.getOrgLink().click();
	}
	@When("In create organization page i will click on create organization image")
	public void in_create_organization_page_i_will_click_on_create_organization_image() {
		//base.driver.findElement(By.xpath("//img[@title='Create Organization...']")).click();
		Pages.orgPage.getCrtOrgImg().click();
	}
	@When("I will enter organization name as {string} and click on save button")
	public void i_will_enter_organization_name_as_and_click_on_save_button(String orgName) {
		Random	random=new Random();
		int ran=random.nextInt(100);
		//		base.driver.findElement(By.name("accountname")).sendKeys(orgName+" "+ran);
		//		base.driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();
		Pages.createNewOrgPage.getOrgName().sendKeys(orgName+" "+ran);
		Pages.createNewOrgPage.getSaveButton().click();

	}
	@Then("I will verify Organization {string} is created or not")
	public void i_will_verify_organization_is_created_or_not(String orgname) {
		//		String  crtdOrgName=base.driver.findElement(By.xpath("//span[@class='dvHeaderText']")).getText();
		//		Assert.assertTrue(crtdOrgName.contains(orgname));
		String crtOrgName = Pages.orgInfoPage.getAclCrtdOrgName().getText().trim();
		System.out.println(crtOrgName);
		System.out.println(orgname);
		Assert.assertTrue(crtOrgName.contains(orgname));
	}

	@When("I will enter organization name as {string}")
	public void i_will_enter_organization_name_as(String org) {
		Random	random=new Random();
		int ran=random.nextInt(100);
		//base.driver.findElement(By.name("accountname")).sendKeys(org+" "+ran);
		Pages.createNewOrgPage.getOrgName().sendKeys(org+" "+ran);
	}
	@When("i will choose Industry type as {string}")
	public void i_will_choose_industry_type_as(String indname) {
		//WebElement industryType=base.driver.findElement(By.name("industry"));
		WebElement IndDrop = Pages.createNewOrgPage.getIndSel();
		Select	select=new Select(IndDrop);
		select.selectByValue(indname);
		//base.driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();
		Pages.createNewOrgPage.getSaveButton().click();;
	}

	@When("I will verify organization is created with {string} and {string}")
	public void i_will_verify_organization_is_created_with_and(String orgname, String indType) {
		//		String  crtdOrgName=base.driver.findElement(By.xpath("//span[@class='dvHeaderText']")).getText();
		String crtOrgName = Pages.orgInfoPage.getAclCrtdOrgName().getText().trim();
		Assert.assertTrue(crtOrgName.contains(orgname));
		//		String  crtdIndType=base.driver.findElement(By.xpath("//span[@id='dtlview_Industry']")).getText().trim();
		//		Assert.assertEquals(crtdIndType, indType);

	}
}
