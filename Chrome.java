package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Chrome {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","/Users/hballuru/Documents/Eclipse/chromedriver" );
		WebDriver var =new ChromeDriver();
		var.get("http://www.facebook.com");
		var.findElement(By.xpath("//input[@id='pass']")).click();
		var.close();
		
	}

}
