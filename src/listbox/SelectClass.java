package listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectClass {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\AllDriver\\chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.get("https://www.facebook.com/");
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
	Thread.sleep(2000);
	WebElement monthDropDown = driver.findElement(By.xpath("//select[@id='month']"));
	 Select s = new Select(monthDropDown);
	 Thread.sleep(2000);
//select by index
	 s.selectByIndex(1);
	 Thread.sleep(2000);
//select by value
	 s.selectByValue("1");
	 Thread.sleep(2000);
//select by visible text
	 s.selectByVisibleText("feb");
	 Thread.sleep(2000);
	 
	 driver.close();

}
}
