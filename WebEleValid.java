package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebEleValid {

	public static void main(String[] args) throws InterruptedException {
		WebDriver k =new FirefoxDriver();
		k.get("http://www.makemytrip.com/");
		k.findElement(By.xpath(".//*[@id='widget_row']/div[1]/div/div[2]/ul/li[3]/a/span[2]")).click();
		k.findElement(By.xpath("html/body/img")).click();
		Thread.sleep(100);
		k.findElement(By.xpath(".//*[@id='contents']/div[3]/button")).isDisplayed();
		
		}
	}


