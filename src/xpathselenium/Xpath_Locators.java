package xpathselenium;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_Locators {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\sayal\\eclipse-workspace\\selenium\\AllDriver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
//open driver	
	driver.get("https://www.saucedemo.com/v1/");
//loacte username by id
	driver.findElement(By.id("user-name")).sendKeys("standard_user");
//locate password	 by name
	driver.findElement(By.name("password")).sendKeys("secret_sauce");
//loacte submit by classname
	driver.findElement(By.className("btn_action")).click();
//locate by tagname	
	driver.findElement(By.tagName("input")).sendKeys("standard_user");
//locate by linktext
	driver.findElement(By.linkText("Sauce Labs Bolt T-Shirt")).click();
//locate by partiallinktext	
	driver.findElement(By.partialLinkText("Bolt")).click();
//
	
	
	
	
	
	
}
}
