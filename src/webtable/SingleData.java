package webtable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SingleData {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\AllDriver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.get("https://chercher.tech/practice/table");
	Thread.sleep(2000);
	String exp="Automation Testing";
	  String act = driver.findElement(By.xpath("//table/tbody/tr[3]/td[3]")).getText();
	System.out.println(act);
	if(act.equalsIgnoreCase(exp)) {
		System.out.println("pass");
	}
	driver.close()
	;
}
}
