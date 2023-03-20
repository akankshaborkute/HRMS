package POM;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import Utility.BaseClass;

public class MonsterPOM2 extends BaseClass {
	static By job_title=By.id("SE_home_autocomplete");
	static By job_location=By.name("lmy");
//	static By job_exp=By.className("search-item-inner");
//	static By job_exp=By.xpath("//*[text()='Experience']");
	static By search_btn=By.xpath("//*[@id=\"search-block-expend\"]/div[6]/input");

	public static void enter_Title(String title) {
		driver.get(driver.getCurrentUrl());
		driver.findElement(job_title).sendKeys(title);
	}
	public static void enter_Location(String location) {		
		driver.findElement(job_location).sendKeys(location);
	}
	
	public static void enter_experience() {
//		driver.switchTo().frame("google_ads_top_frame");
//		public static void enter_experience(String exp1) {
//		driver.findElement(job_exp).sendKeys(Keys.ARROW_DOWN);
//		driver.findElement(job_exp).sendKeys(exp1);
		//Select st=new Select(driver.findElement(job_exp));
		//st.selectByIndex(2);
		
		WebElement obj = driver.findElement(By.xpath("//span[text()='Experience']"));
		obj.click();
	    driver.findElement(By.xpath("//*[text() = \"1 Year\"]")).click();
		
		
	}
	public static void click_Search_btn() {
		driver.findElement(search_btn).click();
	}
}