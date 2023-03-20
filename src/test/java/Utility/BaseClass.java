package Utility;
	import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
//	import org.testng.Reporter;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
	
	public class BaseClass {
		public static WebDriver driver;
		public static void launchbrowser() {
			System.setProperty("webdriver.chrome.driver.","C:\\Drivers\\chromedriver.exe");
			driver= new ChromeDriver();
			
		}
		public static void openapplication(String url2) {
			driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
			driver.navigate().to(url2);
//			Reporter.log("Application is opened");
		}
		public static void closeapplication() {
			driver.quit();
//			Reporter.log("Application is closed");
		}
	}