package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	//create constructor for initializing elements using pagefactory.initel
//	public LoginPage(WebDriver driver) {
//		PageFactory.initElements(driver, this);
//	}

	//identify elements by using @FindBy @FindBys and @FindAll
	//declare webelement as private
	@FindBy(name = "user_name") private WebElement usernameTf;
	@FindBy(name = "user_password") private WebElement passwordTf;
	@FindBy(id = "submitButton") private WebElement loginButton;
	
	//provide getter method for private element
	public WebElement getUsernameTf() {
		return usernameTf;
	}
	public WebElement getPasswordTf() {
		return passwordTf;
	}
	public WebElement getLoginButton() {
		return loginButton;
	}

	//bussiness logic
	
	public void logUnPwBL(String username,String password) {
		usernameTf.sendKeys(username);
		passwordTf.sendKeys(password);
		
	}
	
	
}
