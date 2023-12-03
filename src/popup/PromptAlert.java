package popup;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PromptAlert {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\AllDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://demoqa.com/alerts");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath(" //button[@id='promtButton']")).click();
		Thread.sleep(2000);
		Alert promtalert = driver.switchTo().alert();
		String pmttext = promtalert.getText();
		System.out.println(pmttext);
		promtalert.sendKeys("Ayesha");
		Thread.sleep(2000);
		promtalert.accept();
		
}
	}
