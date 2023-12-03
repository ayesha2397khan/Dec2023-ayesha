package webtable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rowdata {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sayal\\eclipse-workspace\\selenium\\AllDriver\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.manage().deleteAllCookies();
		   driver.get("https://chercher.tech/practice/table");
		   Thread.sleep(2000);
		   List<WebElement> rowtext = driver.findElements(By.xpath("//table/tbody/tr[2]"));
		 for ( WebElement webElement : rowtext) {
			System.out.println(webElement.getText());
		}
		   
	}  
}
