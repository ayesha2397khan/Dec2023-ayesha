package chromelaunch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenChrome {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\AllDriver\\chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	driver.get("https://drive.google.com/");
}
}
