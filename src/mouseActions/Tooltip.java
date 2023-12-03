package mouseActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Tooltip {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir") +"\\AllDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.globalsqa.com/demo-site/tooltip/");
		Thread.sleep(2000);
		driver.switchTo().frame(3);
		WebElement img = driver.findElement(By.xpath("//img[@alt='Tower Bridge']"));
	    Actions act = new Actions(driver);
	    act.moveToElement(img).perform();
	    Thread.sleep(2000);
	}
}
