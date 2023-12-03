package webDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateTitles {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\AllDriver\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		//geturl
		String title = driver.getTitle();
		System.out.println(title);
		
		//getcurrenturl
		String currenturl = driver.getCurrentUrl();
		System.out.println(currenturl);
		
		//getsource
		String pagesource = driver.getPageSource();
		System.out.println(pagesource);
		
		//manage
		driver.manage().window().maximize();
		
		driver.manage().window().minimize();
		
		driver.manage().deleteAllCookies();
		
		//close
		driver.close();
		
		//quit
		driver.quit();
		
}
}