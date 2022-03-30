package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
//	public HomePage(WebDriver driver) {
//		PageFactory.initElements(driver, this);
//	}
	@FindBy(xpath = "//a[text()='Organizations']") private WebElement orgLink;
	public WebElement getOrgLink() {
		return orgLink;
	}
	
}
