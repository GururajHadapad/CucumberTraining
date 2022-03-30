package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateNewOrgPage {
	
//public CreateNewOrgPage(WebDriver driver) {
//	PageFactory.initElements(driver, this);
//}
@FindBy(xpath = "//input[@title='Save [Alt+S]']") private WebElement saveButton;
@FindBy(name = "accountname") private WebElement orgName;
@FindBy(name = "industry")private WebElement indSel;

public WebElement getIndSel() {
	return indSel;
}
public WebElement getSaveButton() {
	return saveButton;
}
public WebElement getOrgName() {
	return orgName;
}



}
