package POM;

import org.openqa.selenium.By;
import Utility.BaseClass;


public class YoutubeSearchPOM extends BaseClass{
	// OBJECTS
			static By box_search=By.name("search_query");
			static By btn_search=By.id("search-icon-legacy");
			static By song_Sayyoni=By.xpath("//*[@id=\"video-title\"]/yt-formatted-string");
	// FUNCTIONS
			public static void entersearch(String search) {
			driver.findElement(box_search).sendKeys(search);
			}
			public static void clickonsearchbtn() {
			driver.findElement(btn_search).click();
		}
			public static void clickonsong() {
			driver.findElement(song_Sayyoni).click();
			}
			
}
