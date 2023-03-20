package POM;

import org.openqa.selenium.By;
import Utility.BaseClass;


public class Monster extends BaseClass{
	// OBJECTS
	static By txt_username=By.id("signInName");
	static By txt_password=By.id("password");
	static By btn_login=By.xpath("//*[@id=\"topHeader\"]/div[2]/div[2]/div/div[2]/ul/li[1]/a/span");
	static By btn_login2=By.id("signInbtn");
	// FUNCTIONS
	public static void login(String un,String pw) {
	driver.findElement(txt_username).sendKeys(un);
	driver.findElement(txt_password).sendKeys(pw);
	}
	public static void clickonloginbtn() {
	driver.findElement(btn_login).click();
//	Reporter.log("Login is completed");
	}
	public static void clickonloginbtn2() {
	driver.findElement(btn_login2).click();
//	Reporter.log("Login is completed");
	}
}


