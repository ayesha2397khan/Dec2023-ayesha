package Xpath;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumXpath {
public static void main(String[] args)  {
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\sayal\\eclipse-workspace\\selenium\\AllDriver\\chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	driver.findElement(By.xpath("//span[@role='button']")).click();
	driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("samsung"); //attribute
	driver.findElement(By.xpath("//div[contains(@class,'line-1')]")).click();   //contains
	driver.findElement(By.xpath("(//a[@class='nav-a  '])[1]")).click();      //index
	WebElement text = driver.findElement(By.xpath("//h2[text()='Starting ₹199 | Shoes & handbags']"));   //text
	System.out.println(text.getText());
	List<WebElement> text2 = driver.findElements(By.xpath("(//div[@class='_1ch8e_'])[2]/following-sibling::div"));     //following-sibling
	for (WebElement webElement : text2) {
		System.out.println(webElement.getText());
	}
	System.out.println("*************************************************************");	
	
		 List<WebElement> text3 = driver.findElements(By.xpath("(//div[@class='_1ch8e_'])[2]/preceding-sibling::div"));
		for( WebElement temp:text3) {
			System.out.println(temp.getText());
		}
	driver.findElement(By.xpath("//input[@class='Pke_EE']/ancestor::div[5]")).click();      //ancestor
        driver.findElement(By.xpath("")).click();
	driver.findElement(By.xpath("")).click();
	
	
	
	
	
}
}
