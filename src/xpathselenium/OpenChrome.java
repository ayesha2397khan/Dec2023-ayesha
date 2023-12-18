package xpathselenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenChrome {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\sayal\\eclipse-workspace\\selenium\\AllDriver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
}
}
