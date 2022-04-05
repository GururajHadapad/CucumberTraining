package StepDefinations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.github.bonigarcia.wdm.WebDriverManager;
import util.Base;
import util.Pages;
import util.PropertyUtil;
import util.WebdriverUtil;

public class Hook {
	private Base base;

	public Hook(Base base) {
		this.base=base;
	}
	@Before
	public void beforeScenario() throws Throwable {
		String browser = PropertyUtil.getPropertyValue("browser");
		//String browser = System.getProperty("browser");
		if (browser.equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			base.driver=new ChromeDriver();
			base.driver.get("http://localhost:8888");
			base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			base.driver.manage().window().maximize();
		}
		else if(browser.equalsIgnoreCase("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			base.driver=new FirefoxDriver();
			base.driver.get("http://localhost:8888");
			base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			base.driver.manage().window().maximize();
		}
		else
		{
			System.out.println("Browser read from util is invalid :"+browser);
		}

		Pages.loadPages(base.driver);
	}
	@After
	public void afterScenario(Scenario scenario) throws Throwable 
	{
		if (scenario.isFailed()) {
			//WebdriverUtil.takIngScreenShot(base.driver, scenario.getName());
			TakesScreenshot ts=(TakesScreenshot)base.driver;
			byte[] scrnShtBytes = ts.getScreenshotAs(OutputType.BYTES);
			scenario.attach(scrnShtBytes, "image/png", scenario.getName());
		}
		base.driver.close();
	}


}
