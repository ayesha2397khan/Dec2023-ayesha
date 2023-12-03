package AS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\sayal\\eclipse-workspace\\selenium\\AllDriver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	
	driver.findElement(By.id("email")).sendKeys("ayesha@2222");
	driver.findElement(By.name("pass")).sendKeys("9999");
	driver.findElement(By.className(""));
	
	
	
	
	
	
	
	
	
}
}
