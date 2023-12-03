package multipleWindowsHandler;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RereshWindowID {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\AllDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.mahaconnect.in/jsp/index.html");
		Thread.sleep(2000);
	
		String winid = driver.getWindowHandle();
		System.out.println(winid);
		driver.navigate().refresh();
		String winid2 = driver.getWindowHandle();
		System.out.println(winid2);
		
	}
}
