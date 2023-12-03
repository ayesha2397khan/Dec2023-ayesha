package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StartsWithXpath {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\sayal\\eclipse-workspace\\selenium\\AllDriver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://artoftesting.com/samplesiteforselenium");
	driver.findElement(By.xpath("//input[starts-with(@id,'fname')]")).sendKeys("Ayesha Khan");
	
}
}
