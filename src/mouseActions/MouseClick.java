package mouseActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseClick {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir") +"\\AllDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
//click
		Actions act = new Actions(driver);
	WebElement closebtnpopup = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
//left click
	act.click(closebtnpopup).perform();
	Thread.sleep(2000);
//right click
	WebElement login = driver.findElement(By.xpath("//a[@class='_1_3w1N']"));
		act.contextClick(login).perform();
		
		
		
		
		
		
		
		
		
	}
}
