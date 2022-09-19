package utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverUtils {
	
	static WebDriver driver;
	
	public  static void createDriver() {
		PropertyUtils.initProperty();
		if(PropertyUtils.getProperty("os").equals("windows"))
		{
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/src/test/resources/drivers/chromedriver.exe");
		}else{
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/src/test/resources/drivers/chromedriver");
		}

		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	public static WebDriver getDriver()
	{
		return driver;
	}

}
