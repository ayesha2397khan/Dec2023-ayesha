package webtable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\sayal\\eclipse-workspace\\selenium\\AllDriver\\chromedriver.exe");
	 WebDriver driver=new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.manage().deleteAllCookies();
	   driver.get("https://chercher.tech/practice/table");
	   String expvalue="Selenium WenDriver";
	   String actValue = driver.findElement(By.xpath("//table/tbody/tr[3]/td[2]")).getText();
	   System.out.println(actValue);
	   if(actValue.equalsIgnoreCase(expvalue))
	   {
		   System.out.println("test case is pass");
	   }
}
}
