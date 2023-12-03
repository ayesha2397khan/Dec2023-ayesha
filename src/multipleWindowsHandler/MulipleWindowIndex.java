package multipleWindowsHandler;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MulipleWindowIndex {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\AllDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.mahaconnect.in/jsp/index.html");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[text()='Utility Bill Payment']")).click();
		driver.findElement(By.xpath("//a[text()='Lic Premium Payment']")).click();
		driver.findElement(By.xpath("//a[text()='Online Shopping / e-Commerce']")).click();
		driver.findElement(By.xpath("//a[text()='Railway Reservation ']")).click();
		driver.findElement(By.xpath("//a[text()='SBI Credit Card Payment']")).click();
		driver.findElement(By.xpath("//a[text()='Donations']")).click();
		driver.findElement(By.xpath("//a[text()='MSYP online payment']")).click();
		
		Set<String> windowIDs = driver.getWindowHandles();
		ArrayList<String> al = new ArrayList<String>(windowIDs);
		for(int i=1;i<al.size();i++) {
			System.out.println(driver.getTitle());
			driver.switchTo().window(al.get(i));
		}
	}
}
