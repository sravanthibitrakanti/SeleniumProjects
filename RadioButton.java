package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RadioButton {

	public static void main(String[] args) {
		WebDriver k =new FirefoxDriver();
		k.get("http://www.echoecho.com/htmlforms10.htm");
		//k.findElement(By.xpath("//input[@value='Milk']")).click();
		int var=k.findElements(By.xpath("//input[@name='group1']")).size();
		System.out.println(var);
		for(var=0;var<3;var++){
			//k.findElements(By.xpath("//input[@name='group1']")).get(1).click();
			String text=k.findElements(By.xpath("//input[@name='group1']")).get(var).getAttribute("value");
			if(text.equals("Cheese")){
				k.findElements(By.xpath("//input[@name='group1']")).get(var).click();
			}
		}
		

	}

}
