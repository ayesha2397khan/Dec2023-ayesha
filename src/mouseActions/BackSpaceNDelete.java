package mouseActions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BackSpaceNDelete {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\AllDriver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.get("https://www.flipkart.com/");
	Thread.sleep(2000);
	 driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Samsung");
	Actions act = new Actions(driver);
	act.sendKeys(Keys.BACK_SPACE).perform();
	Thread.sleep(2000);
	act.sendKeys(Keys.BACK_SPACE).perform();
	Thread.sleep(2000);
   act.keyDown(Keys.CONTROL).sendKeys("A"+"C").keyUp(Keys.CONTROL).sendKeys(Keys.DELETE).build().perform();
   
	
	
}
}
