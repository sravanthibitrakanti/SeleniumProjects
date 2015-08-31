package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class JavaPopUps {

	public static void main(String[] args) {
		FirefoxDriver k =new FirefoxDriver();
		k.get("http://www.tizag.com/javascriptT/javascriptalert.php");
		k.findElement(By.xpath("html/body/table[3]/tbody/tr[1]/td[2]/table/tbody/tr/td/div[4]/form/input")).click();
		System.out.println(k.switchTo().alert().getText());
        k.switchTo().alert().accept();
        
		
	}

}
