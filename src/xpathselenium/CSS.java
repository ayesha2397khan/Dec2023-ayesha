package xpathselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//CSS---->Cascading Style Sheets
//Tag and id=tag#id
//TAg and class=tag.value of class
//Tag and attribute=tag[attribute=value]
//Tag,class and attribute=tag.valoueofclass[attribute=value]
//sub-string=start with=^,ends with=$, contains=*),tag[attribute^=substring]
public class CSS {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\sayal\\eclipse-workspace\\selenium\\AllDriver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.saucedemo.com/v1/");
	//id=tag#id
	driver.findElement(By.cssSelector("input#user-name")).sendKeys("standard_user");
	//tag[attribute=value]
	driver.findElement(By.cssSelector("input[name=password]")).sendKeys("secret_sauce");
	//tag.value of class
	driver.findElement(By.cssSelector("input.btn_action")).click();
	//
	String currentwindowhandle=driver.getWindowHandle();
	driver.switchTo().window(currentwindowhandle);
	
	//tag.valoueofclass[attribute=value]
	//driver.findElement(By.cssSelector("button.btn[name=btn_primary btn_inventory")).click();
			
	
	
	
	
	
}
}
