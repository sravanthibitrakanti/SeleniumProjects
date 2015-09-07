import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LinkTest {
	//login to facebook using wrong credentials
	//navigate back to homepage
	//click on forgot password link
	//submit email id requesting password

	public static void main(String[] args) {
		WebDriver driver =new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath(".//input[@id='email']")).sendKeys("terster");
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("tester");
		driver.findElement((By.xpath(".//input[@type='submit']"))).click();
		driver.navigate().back();
		driver.findElement(By.partialLinkText("Forgot ")).click();
		driver.findElement(By.id("identify_email")).sendKeys("tester@gmail.com");
		driver.findElement(By.name("did_submit")).click();
		
		
	}

}
