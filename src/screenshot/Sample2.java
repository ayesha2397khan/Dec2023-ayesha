package screenshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample2 {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\AllDriver\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
	    File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	  File desti = new File("C:\\Users\\sayal\\eclipse-workspace\\selenium\\ScreenShotFolder\\ask.jpg");
	    FileUtils.copyFile(src, desti);
	driver.close();		
}
}