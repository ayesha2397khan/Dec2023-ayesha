package screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class Program4 {
	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sayal\\eclipse-workspace\\selenium\\AllDriver\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[@id='nav-logo']"));
		
	    File srcfile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);	
	   
	   String S1=RandomString.make();
	   
		File destin = new File("C:\\Users\\sayal\\eclipse-workspace\\selenium\\ScreenShotFolder\\"+S1+".jpg");
		
		FileHandler.copy(srcfile, destin);
		
		driver.close();
		
		
		
		
	}
}
