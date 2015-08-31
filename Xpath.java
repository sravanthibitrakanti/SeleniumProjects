package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Xpath {

	public static void main(String[] args) {
		WebDriver var =new FirefoxDriver();
		var.get("http://www.truereligion.com/");
		var.findElement(By.xpath(".//*[@id='homepage_content']/div[2]/div/div[3]/a")).click();;
		

	}

}
