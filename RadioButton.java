import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RadioButton {

	public static void main(String[] args) {
		//Handling Dynamic drop downs
  FirefoxDriver driver = new FirefoxDriver();
  driver.get("http://spicejet.com/");
  driver.findElement(By.xpath(".//input[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();
	}

}
