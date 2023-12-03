package mouseActions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DropDown {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sayal\\eclipse-workspace\\selenium\\AllDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		WebElement closepop = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		closepop.click();
		
        Actions act = new Actions(driver);
        
		WebElement electronicitemslist = driver.findElement(By.xpath("//div[@class='eFQ30H'][4]"));
		act.moveToElement(electronicitemslist).perform();
		
		WebElement cameras = driver.findElement(By.xpath("//a[@class='_6WOcW9'][1]"));
		act.moveToElement(cameras).perform();
		
		List<WebElement> all = driver.findElements(By.xpath("//div[@class='_3XS_gI']"));
		for(WebElement temp:all) {
			System.out.println(temp.getText());
			act.moveToElement(temp).perform();
		}
	}
}
