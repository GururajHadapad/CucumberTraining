package util;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.google.common.io.Files;

public class WebdriverUtil {

	public static void takIngScreenShot(WebDriver driver,String scenarioName) throws Throwable {
		TakesScreenshot takeScreenShot=(TakesScreenshot)driver;
		File src = takeScreenShot.getScreenshotAs(OutputType.FILE);
		File dest=new File(".\\screenShot\\"+scenarioName+".png");
		Files.copy(src, dest);		
	}
}
