package screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Program2 {
public static void main(String[] args) throws IOException, InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\sayal\\eclipse-workspace\\selenium\\AllDriver\\chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	driver.get("https://www.amazon.in/");
	Thread.sleep(2000);
   File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
   File destiFile=new File("C:\\Users\\sayal\\eclipse-workspace\\selenium\\ScreenShotFolder\\Amz.jpg");
   FileHandler.copy(src, destiFile);
   driver.close();
}
}
