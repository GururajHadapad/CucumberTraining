package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrgPage {
//	public OrgPage(WebDriver driver) {
//		PageFactory.initElements(driver, this);
//	}
	@FindBy(xpath = "//img[@title='Create Organization...']") private WebElement crtOrgImg;
	
	
	public WebElement getCrtOrgImg() {
		return crtOrgImg;
	}

	
	
	
	


	
}
