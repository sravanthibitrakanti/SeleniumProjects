package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DynamicDropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver k =new FirefoxDriver();
		k.get("http://spicejet.com/");
		k.findElement(By.xpath(".//input[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();
        k.findElement(By.xpath(".//a[@value='GOI']")).click();
        k.findElement(By.xpath(".//input[@id='ctl00_mainContent_ddl_destinationStation1_CTXT']")).click();
        k.findElement(By.xpath(".//a[@value='IXE']")).click();
	}

}
