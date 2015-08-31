package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Css {

	public static void main(String[] args) {
		WebDriver k =new FirefoxDriver();
		k.get("https://www.facebook.com");
		k.findElement(By.cssSelector("input[id='email']")).sendKeys("ramadevi.bsnl@gmail.com");
	}

}
