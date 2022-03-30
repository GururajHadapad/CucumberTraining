package util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import pageFactory.CreateNewOrgPage;
import pageFactory.HomePage;
import pageFactory.LoginPage;
import pageFactory.OrgInfoPage;
import pageFactory.OrgPage;

public class Pages {
public static LoginPage loginPage;
public static HomePage homePage;
public static OrgPage orgPage;
public static OrgInfoPage orgInfoPage;
public static CreateNewOrgPage createNewOrgPage;


public static void loadPages(WebDriver driver) {
	
	loginPage=PageFactory.initElements(driver, LoginPage.class);
	homePage=PageFactory.initElements(driver, HomePage.class);
	orgPage=PageFactory.initElements(driver, OrgPage.class);
	orgInfoPage=PageFactory.initElements(driver, OrgInfoPage.class);
	createNewOrgPage=PageFactory.initElements(driver, CreateNewOrgPage.class);

}
}
