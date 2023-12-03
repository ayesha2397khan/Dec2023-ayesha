package mouseActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseAction {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir") +"\\AllDriver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.get("https://www.flipkart.com/");
	Thread.sleep(2000);

	Actions act = new Actions(driver);
	WebElement closebtnpoup = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
	act.moveToElement(closebtnpoup);
	act.click().perform();
	
	
}
}
