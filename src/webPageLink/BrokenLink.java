package webPageLink;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLink {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\AllDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	    driver.get("https://www.maharashtra.gov.in/");
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("All Broken links --->"+links.size());
		for(WebElement brokens:links) {
			System.out.println(brokens.getText());
		}
		
		
		
		
		
	}
}
