package webDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateMethods {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\AllDriver\\chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	Thread.sleep(2000);
	driver.navigate().to("https://www.flipkart.com/");
	Thread.sleep(2000);
	driver.navigate().to("https://www.amazon.in/");
	Thread.sleep(2000);
	driver.navigate().to("https://www.facebook.com/");
	Thread.sleep(2000);
	driver.navigate().back();
	Thread.sleep(2000);
	driver.navigate().forward();
	Thread.sleep(2000);
	driver.navigate().refresh();
}
}
