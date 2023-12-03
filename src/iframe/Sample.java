package iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//NoSuchElementexeption
//1.locator check again and get confirm
//2.any change in ui devleoper
//we need to check any parent html with tagname "iframe"

public class Sample {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\AllDriver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.get("https://jqueryui.com/selectable/");
	Thread.sleep(2000);
	WebElement frame = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));

//webelement
	driver.switchTo().frame(frame);
	Thread.sleep(2000);

	driver.findElement(By.xpath("(//ol[@id='selectable'])/li[5]")).click();
	
//To switch focus to homepage to any frame	
	driver.switchTo().defaultContent();
	
//Switch focus to parent	
	//driver.switchTo().parentFrame();

	
	driver.findElement(By.xpath("(//li[@class='menu-item'])[1]")).click();
	
	
	
	
}
}
