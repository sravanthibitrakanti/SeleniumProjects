package Basics;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class StaticDropDown {

	public static void main(String[] args) {
WebDriver k =new FirefoxDriver();
k.get("http://spicejet.com/");
Select var =new Select(k.findElement(By.xpath(".//*[@id='ctl00_mainContent_ddl_Adult']")));
var.selectByIndex(1);
k.findElement(By.xpath(".//*[@id='ctl00_mainContent_chk_IndArm']")).click();
//System.out.println(k.findElement(By.xpath(".//*[@id='ctl00_mainContent_chk_IndArm']")).isSelected());

	}

}
