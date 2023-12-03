package mouseActions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CopyNPaste {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\AllDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		Thread.sleep(2000);
	     WebElement searchbox = driver.findElement(By.xpath("//input[@name='q']"));
	     searchbox.sendKeys("Samsung");
		Thread.sleep(2000);
		Actions act = new Actions(driver);
//Select all content
		act.keyDown(Keys.CONTROL).sendKeys("A").keyUp(Keys.CONTROL).build().perform();
		Thread.sleep(2000);
//copy
		act.keyDown(Keys.CONTROL).sendKeys("C").keyUp(Keys.CONTROL).build().perform();
		Thread.sleep(2000);
//clear
		searchbox.clear();
		Thread.sleep(2000);
//paste
		 act.keyDown(Keys.CONTROL).sendKeys("V").keyUp(Keys.CONTROL).build().perform(); 
	}
}
