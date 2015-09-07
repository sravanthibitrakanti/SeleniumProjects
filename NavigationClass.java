import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NavigationClass {

	public static void main(String[] args) throws InterruptedException {
     WebDriver driver =new FirefoxDriver();
     driver.get("http://stackoverflow.com/");
     driver.findElement(By.xpath("html/body/div[5]/div[1]/div[2]/div[1]/ul/li[1]/a")).click();
     driver.navigate().back();
     Thread.sleep(3);
     driver.navigate().to("http://careers.stackoverflow.com/?utm_source=stackoverflow.com&utm_medium=site-ui&utm_campaign=anon-topbar");
     driver.close();
     
	}

}
