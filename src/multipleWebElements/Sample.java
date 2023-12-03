package multipleWebElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir") +"\\AllDriver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.get("https://demoqa.com/automation-practice-form");
	Thread.sleep(2000);
	
//to print all header text	
	System.out.println("***header list***");
	List<WebElement> list = driver.findElements(By.xpath("//form[@id='userForm']/div"));
	System.out.println(list.size());
	for(WebElement temp:list) {
		System.out.println(temp.getText());
	}
	Thread.sleep(2000);
//print all check box text
	System.out.println("***hobbies list***");
	List<WebElement> checklist = driver.findElements(By.xpath("//div[@id='hobbiesWrapper']/div/div"));
	System.out.println(checklist.size());
	for(WebElement temp2:checklist)
	{
		System.out.println(temp2.getText());
	}
//select all check box  //or select any perticular opetion
	for(WebElement hobbylist:checklist) {
		if(hobbylist.getText().equalsIgnoreCase("Reading")) {
			hobbylist.click();
			Thread.sleep(2000);
		}
	}
	
	driver.close();
}
}
