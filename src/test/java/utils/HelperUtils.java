package utils;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class HelperUtils {
	
	public static void explcitWaitUntilVisible(WebDriver driver,WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	public static void scrollToElement(WebDriver driver,WebElement element){
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", element);
	}
	public static void explcitWaitUntilClickable(WebDriver driver,WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}

	public static void captureScreenshot(WebDriver driver,String path) throws IOException {
		TakesScreenshot screenshot = (TakesScreenshot)driver;
		File srcImg = screenshot.getScreenshotAs(OutputType.FILE);
		
		File destImg = new File(path);
		
		FileUtils.copyFile(srcImg, destImg);
	}
}
