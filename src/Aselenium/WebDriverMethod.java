package Aselenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverMethod {
	public static void main(String[] args) throws InterruptedException  {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sayal\\eclipse-workspace\\selenium\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().deleteAllCookies();
		
		driver.manage().window().maximize();
		
		String pagetitle= driver.getTitle();
		System.out.println(pagetitle);
		
		String source = driver.getPageSource();
		System.out.println(source );
		
		driver.navigate().to("https://www.flipkart.com/");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		
		String currenturl = driver.getCurrentUrl();
		System.out.println(currenturl);
		
		driver.close();
		
		driver.quit();
		
		
		
		
	}
}
