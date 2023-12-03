package Aselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath3 {
public static void main(String[] args) throws InterruptedException  {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sayal\\eclipse-workspace\\selenium\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		WebElement text = driver.findElement(By.xpath("//h2[starts-with(text(),'Facebook')]"));    //starts-with
		System.out.println(text.getText());
		
		driver.findElement(By.xpath("//h2[ends-with(text(),'Facebook')]"));
		
}
}