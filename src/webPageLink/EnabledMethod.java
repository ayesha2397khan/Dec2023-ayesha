package webPageLink;
//check element is available or not ----->isEnabled() method
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EnabledMethod {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\AllDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.flipkart.com/");
	
		List<WebElement> link = driver.findElements(By.tagName("a"));
		System.out.println("Total link on webpage--->"+link.size());
		for(WebElement weblink:link) {
			//System.out.println(weblink.getText()+"-"+weblink.isEnabled());
			System.out.println(weblink.getAttribute("href"));
		}
		
	}
}
