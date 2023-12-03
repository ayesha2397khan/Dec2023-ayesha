package autoSuggestions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+ "\\AllDriver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.get("https://www.amazon.in/");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("iphone");
	Thread.sleep(2000);
	List<WebElement> allsuggest = driver.findElements(By.xpath("//div[@class='s-suggestion-container']"));
	System.out.println(allsuggest.size());
	for(WebElement temp:allsuggest) {
		System.out.println(temp.getText());
	}
	driver.close();
}
}
