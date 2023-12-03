package mouseActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sayal\\eclipse-workspace\\selenium\\AllDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://demoqa.com/droppable");
		Thread.sleep(2000);
	
		WebElement dragble = driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement dropble = driver.findElement(By.xpath("(//div[@id='droppable'])[1]"));
		Actions act = new Actions(driver);
		//act.dragAndDrop(dragble, dropble).perform();
		act.moveToElement(dragble).clickAndHold().moveToElement(dropble).release().build().perform();
		
		
		
		
		
		
	}
}
