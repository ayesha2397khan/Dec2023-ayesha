package mouseActions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseAction1OMG {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir") +"\\AllDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
        
        Thread.sleep(2000);
		List<WebElement> alllist = driver.findElements(By.xpath("//div[@class='eFQ30H']"));
		Actions act = new Actions(driver);
		for(WebElement temp:alllist)
		{
			act.moveToElement(temp).perform();
			Thread.sleep(2000);
		}
		
	}
}
