package multipleWindowsHandler;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program3 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\AllDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.mahaconnect.in/jsp/index.html");
		Thread.sleep(2000);
		String singleWid = driver.getWindowHandle();
		System.out.println( singleWid );
		Thread.sleep(2000);
		driver.findElement(By.xpath("//p[@id='loginbtns']/a[1]/img")).click();
		Thread.sleep(2000);
		Set<String> windos = driver.getWindowHandles();
		ArrayList<String> al = new ArrayList<String>(windos);
		for(String temp:windos)
		{
			System.out.println(temp);
		}
		System.out.println(al);
		System.out.println(al.get(1).toString());
		driver.switchTo().window((String) al.get(1));
		Thread.sleep(2000);
		
		System.out.println(driver.getCurrentUrl());
		driver.findElement(By.xpath("//input[@id='userLogin:captchaInput']")).sendKeys("ayesha99");
		
		driver.switchTo().window(al.get(0));
		driver.findElement(By.xpath("//a[text()='Utility Bill Payment']")).click();
		
		driver.quit();
	}
}
