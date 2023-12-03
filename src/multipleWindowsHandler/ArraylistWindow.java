package multipleWindowsHandler;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ArraylistWindow {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\AllDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.mahaconnect.in/jsp/index.html");
		Thread.sleep(2000);
		Set<String> winid = driver.getWindowHandles();
		ArrayList<String> al = new ArrayList<String>(winid);
		for(String id:winid)
		{
			System.out.println(id);
		}
		System.out.println(al);
		System.out.println(al.get(1).toString());
		driver.switchTo().window(al.get(1));
		Thread.sleep(2000);
		
		System.out.println(driver.getCurrentUrl());
		driver.findElement(By.xpath("")).sendKeys("");
		
		driver.switchTo().window(al.get(0));
		driver.findElement(By.xpath("")).click();
		
		
	}
}
