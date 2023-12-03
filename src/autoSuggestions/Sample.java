package autoSuggestions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\AllDriver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.get("https://www.google.com");
	Thread.sleep(2000);
//search 	
	driver.findElement(By.xpath("//textarea[@class='gLFyf']")).sendKeys("Samsung");
	Thread.sleep(2000);
//print all opetion	
	List<WebElement> opetion = driver.findElements(By.xpath("//div[@class='eIPGRd']"));
	System.out.println(opetion.size());
	for(WebElement temp:opetion) {
		System.out.println(temp.getText());
	}
//click on a opetion
	String exptext = "Samsung Galaxy A14";
	for(WebElement temp:opetion) {
		String acttext = temp.getText();
		if(exptext.equals(acttext)) {
			temp.click();
			break;
		}
	}
	
	
}
}
