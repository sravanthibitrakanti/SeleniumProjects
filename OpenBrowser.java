package Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class OpenBrowser {

	public static void main(String[] args) {
		WebDriver var=new FirefoxDriver();
		var.get("http://www.google.com");
		System.out.println(var.getCurrentUrl());
		System.out.println(var.getTitle());
		var.close();

	}

}
