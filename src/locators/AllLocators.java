package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllLocators {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\sayal\\eclipse-workspace\\selenium\\AllDriver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	//launch the facebook
	driver.get("https://www.facebook.com/");
	Thread.sleep(2000);
	//click create new account
	driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
	Thread.sleep(2000);
	//first name
	driver.findElement(By.name("firstname")).sendKeys("aisha");
	Thread.sleep(2000);
	//last name
	driver.findElement(By.name("lastname")).sendKeys("khan");
	Thread.sleep(2000);
	//mobile
	driver.findElement(By.name("reg_email__")).sendKeys("7984612");
	Thread.sleep(2000);
	//password
	driver.findElement(By.id("password_step_input")).sendKeys("2328");
	Thread.sleep(2000);
	//gender
	driver.findElement(By.xpath("(//input[@class='_8esa'])[1]")).click();
	Thread.sleep(2000);
	//link test
	driver.findElement(By.linkText("href=\"https://about.meta.com/")).click();
	Thread.sleep(2000);
	//partial link test
	driver.findElement(By.partialLinkText(""));
	//signup button
	driver.findElement(By.xpath("//button[@name='websubmit']")).click();
	Thread.sleep(2000);
	driver.close();
}
}
