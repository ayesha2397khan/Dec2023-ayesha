package Aselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath1 {
public static void main(String[] args) throws InterruptedException  {
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\sayal\\eclipse-workspace\\selenium\\Drivers\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//input[@value='radio1']")).click();                                 //attribute
	Thread.sleep(2000);
	
	String text1= driver.findElement(By.xpath("//h1[text()='Practice Page']")).getText();     //text
	System.out.println(text1);
	Thread.sleep(2000);
	
     driver.findElement(By.xpath("//img[contains(@class,'Class')]")).click();                  //contains
    Thread.sleep(2000);
	
    driver.findElement(By.xpath("(//button[@class='btn btn-primary'])[1]")).click();          //index
   	Thread.sleep(2000);
	
	driver.close();
}
}
