package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ById {

	public static void main(String[] args) {
		WebDriver k =new FirefoxDriver();
		k.get("https://www.facebook.com/?_rdr=p");
		k.findElement(By.id("email")).sendKeys("ramadevi.bsnl@gmail.com");
		k.findElement(By.id("pass")).sendKeys("lakshmirama");
		k.findElement(By.xpath(".//*[@id='u_0_x']")).click();
		

	}

}
