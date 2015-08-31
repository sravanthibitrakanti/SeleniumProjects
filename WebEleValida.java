package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebEleValida {

	public static void main(String[] args) {
		WebDriver k =new FirefoxDriver();
		k.get("http://theoatmeal.com/");
		k.findElement(By.xpath(".//*[@id='nav_comics']/h3/a")).click();
		boolean j=k.findElements(By.xpath(".//*[@id='nav_quizzes']/h3/a")).contains(".//*[@id='nav_comics']/h3/a");
		if(j==false){
			System.out.println("There is no such element");
		}
		
	}

}
