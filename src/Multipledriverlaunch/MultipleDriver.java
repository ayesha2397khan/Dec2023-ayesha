package Multipledriverlaunch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultipleDriver {
public static void main(String[] args) throws InterruptedException 
{
	WebDriver driver=null;
	String browsername="firefox";
	
	if(browsername.equalsIgnoreCase("chrome")) 
	{
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\AllDriver\\chromedriver.exe");
		driver =new ChromeDriver();
	}
	else if(browsername.equalsIgnoreCase("firefox")) 
	{
		System.setProperty("webdriver.firefox.marionette",System.getProperty("user.dir")+"\\AllDriver\\geckodriver.exe");
		driver =new FirefoxDriver();
	}
	else if(browsername.equalsIgnoreCase("edge")) 
	{
		System.setProperty("webdriver.edge.driver",System.getProperty("user.dir")+"\\AllDriver\\msedgedriver.exe");
		driver =new EdgeDriver();
	}
	driver.get("https://www.amazon.in/");
	Thread.sleep(2000);
	driver.close();
}
}
