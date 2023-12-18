package xpathselenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebLunch {
public static void main(String[] args)  {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\sayal\\eclipse-workspace\\selenium\\AllDriver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	//launch the facebook
	driver.get("https://www.facebook.com/");
	
}
}
