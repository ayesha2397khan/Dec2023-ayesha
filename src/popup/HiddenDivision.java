package popup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenDivision {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\AllDriver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	
	driver.get("https://www.flipkart.com/");
	Thread.sleep(2000);
	String text1 = driver.findElement(By.xpath("//p[@class='_1-pxlW']")).getText();
	System.out.println(text1);
	String text2 = driver.findElement(By.xpath("//div[@class='_1Ijv5h']")).getText();
	System.out.println(text2);
	driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("ayesha99@gmail.com");
	driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("Samsung");
}
}
