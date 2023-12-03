package screenshot;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrenShot {
public static void main(String[] args) throws InterruptedException, IOException {
	System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+ "\\AllDriver\\chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	Thread.sleep(2000);
	driver.get("https://www.amazon.in/");
	
	File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	
	Date d = new Date();
	String timestamp=d.toString().replace(' ','_' ).replace(':', '_');
	
	
	File desti = new File("C:\\Users\\sayal\\eclipse-workspace\\selenium\\ScreenShotFolder\\"+timestamp+".jpg");
	FileUtils.copyFile(src, desti);
	
	driver.close();
	
	
}
}
