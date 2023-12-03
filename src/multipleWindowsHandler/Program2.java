package multipleWindowsHandler;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\AllDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.mahaconnect.in/jsp/index.html");
		Thread.sleep(2000);
		String id = driver.getWindowHandle();
		System.out.println(id);
		driver.findElement(By.xpath("//p[@id='loginbtns']/a[1]/img")).click();
		Thread.sleep(2000);
		Set<String> winid = driver.getWindowHandles();
		ArrayList al = new ArrayList<>();
		for(String temp: winid)
		{
			al.add(temp);
			System.out.println(temp);
		}
		System.out.println(al);
		driver.switchTo().window((String) al.get(1));
		
		driver.findElement(By.xpath("//input[@id='userLogin:userName']")).sendKeys("ayehsa99");
		
		
		
		
	}
}
