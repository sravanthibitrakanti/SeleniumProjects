package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LinkText {
public static void main(String args[]){
	WebDriver k =new FirefoxDriver();
	k.get("https://www.facebook.com/?_rdr=p");
	k.findElement(By.linkText("Forgot your password?")).click();;
	
}
}
