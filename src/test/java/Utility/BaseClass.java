package Utility;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
//	import org.testng.Reporter;
	
	public class BaseClass {
		public static WebDriver driver;
		public static void launchbrowser() {
			System.setProperty("webdriver.chrome.driver.","C:\\Drivers\\chromedriver.exe");
			driver= new ChromeDriver();
		}
		public static void openapplication(String urla) {
			driver.get(urla);
//			Reporter.log("Application is opened");
		}
		public static void closeapplication() {
			driver.quit();
//			Reporter.log("Application is closed");
		}
	}