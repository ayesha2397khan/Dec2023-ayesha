package mouseActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Program1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir") +"\\AllDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
	   Actions act = new Actions(driver);
//leftclick
	  WebElement clickbtn = driver.findElement(By.xpath("//a[@class='nav-a  '][1]"));
	  act.moveToElement(clickbtn).click().perform();
		Thread.sleep(2000);
	   
//rightclick
	  WebElement rightclick = driver.findElement(By.xpath("//a[text()=' Electronics ']"));
	  act.contextClick(rightclick).perform();
//	  
//doubleclick		
    act.doubleClick(rightclick).perform();
		
		
		
		
		
	}
}
