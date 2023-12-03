package webPageLink;
//a-->find all link on webpage
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Links {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\AllDriver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.get("https://www.facebook.com/");
	
//All link on webpage
	
	List<WebElement> alllinks = driver.findElements(By.tagName("a"));
	System.out.println("Total link on webpage = "+alllinks.size());
	for(WebElement temp:alllinks) {
		System.out.println(temp.getText());
	}
	driver.close();
	
	
	
}
}
