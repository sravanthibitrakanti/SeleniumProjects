import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenBrowser {

	public static void main(String[] args) throws InterruptedException {
		//Get Title name and length
		// Get Page URL and verify if that is a correct page opened
		//Get Page Source
		WebDriver driver =new FirefoxDriver();
		driver.get("https://www.google.com/?gws_rd=ssl");
		System.out.println(driver.getTitle());
		int titleLength=driver.getTitle().length();
		System.out.println(titleLength);
	    String actualUrl="https://www.google.com/?gws_rd=ssl";
        String currentUrl= driver.getCurrentUrl();
        if(actualUrl.equals(currentUrl)){
        	System.out.println("Successsfully opened the website www.google.com");
        }else
        {
        	System.out.println("Verification failed");
      
        }
		
		Thread.sleep(2);
		driver.close();	

	}

}
