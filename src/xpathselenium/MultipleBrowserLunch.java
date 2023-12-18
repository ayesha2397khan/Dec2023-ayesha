package xpathselenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleBrowserLunch {
public static void main(String[] args) throws InterruptedException {
	
	WebDriver driver=null;
	String browsername="chrome";
	
	if(browsername.equalsIgnoreCase("chrome")) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sayal\\eclipse-workspace\\selenium\\AllDriver\\chromedriver.exe");
		driver=new ChromeDriver();
		
	}
	driver.get("https://www.amazon.in/");
	Thread.sleep(2000);
	driver.close();
	
	
	
	
	
	
	
	
	
}
}
