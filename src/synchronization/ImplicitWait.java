package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\AllDriver\\chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	
//implicit wait
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
	driver.get("https://softwaretestingo.blogspot.com/2020/08/how-to-use-explicit-wait-in-selenium.html");
	driver.findElement(By.xpath("//button[@onclick='timedText()']")).click();
	Thread.sleep(5000);
	String text = driver.findElement(By.xpath("//button[@onclick='timedText()']/following::p")).getText();
	System.out.println(text);
	
	
	
}
}
