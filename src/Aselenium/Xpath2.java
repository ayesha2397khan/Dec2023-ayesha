package Aselenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath2 {
	public static void main(String[] args) throws InterruptedException  {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sayal\\eclipse-workspace\\selenium\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		
		List<WebElement> text = driver.findElements(By.xpath("(//div[@class='_1ch8e_'])[1]/following-sibling::div"));   //following-sibling
		for (WebElement webElement : text) {
		System.out.println(webElement.getText());	
		}
		
		List<WebElement> text1 = driver.findElements(By.xpath("(//div[@class='_1ch8e_'])[2]/preceding-sibling::div")); //predending-sibling
		for( WebElement temp:text1) {
			System.out.println(temp.getText());
		}
		
		
	}
}
