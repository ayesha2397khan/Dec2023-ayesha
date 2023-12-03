package mouseActions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOverAction {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir") +"\\AllDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		Actions act = new Actions(driver);
		List<WebElement> printall = driver.findElements(By.xpath("//a[@class='nav-a  ']"));
		for(WebElement temp:printall) {
			act.moveToElement(temp).perform();
			Thread.sleep(2000);
		}
		
		
		
		
		
		
		
		
		
	}
}
