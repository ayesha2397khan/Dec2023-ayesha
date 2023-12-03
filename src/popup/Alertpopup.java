package popup;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertpopup {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\AllDriver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.get("https://demoqa.com/alerts");
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//button[@id='alertButton']")).click();
	Thread.sleep(2000);
	Alert alt = driver.switchTo().alert();
	String text = alt.getText();
	System.out.println(text);
	Thread.sleep(2000);
	alt.accept();
	
	String alrttext = driver.findElement(By.xpath("(//div[@class='col-md-6'])[1]")).getText();
	System.out.println(alrttext);
	driver.close();
}
}
