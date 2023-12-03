package multipleWindowsHandler;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TwoWindowHandle {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\AllDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.mahaconnect.in/jsp/index.html");
		Thread.sleep(2000);
		String singlid = driver.getWindowHandle();
		System.out.println(singlid);
		driver.findElement(By.xpath("//p[@id='loginbtns']/a[1]/img")).click();
		Set<String> twowinid = driver.getWindowHandles();
		for( String temp:twowinid) {
			System.out.println(temp);
		}
		
		
	}
}
