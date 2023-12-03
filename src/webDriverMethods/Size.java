package webDriverMethods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Size {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\AllDriver\\chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	System.out.println(driver.manage().window().getSize());
	Thread.sleep(2000);
	 Dimension d=new Dimension(350,100);
	driver.manage().window().setSize(d);
	System.out.println(driver.manage().window().getSize());
	driver.close();
	
}
}
