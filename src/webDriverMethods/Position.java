package webDriverMethods;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Position {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\AllDriver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	System.out.println(driver.manage().window().getPosition());
	
	//position 1
	Point p1 = new Point(100,200);
	driver.manage().window().setPosition(p1);
	
	//position 2
	Point p2=new Point(100,500);
	driver.manage().window().setPosition(p2);
	
	//position 3
	Point p3=new Point(700,700);
	driver.manage().window().setPosition(p3);
	
	Thread.sleep(10000);
	driver.close();
}
}
