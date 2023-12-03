package screenshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class WebelementSS {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+ "\\AllDriver\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//img[@class='product-image'])[11]"));
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		String s1=RandomString.make(5);
		
		File desti = new File("C:\\Users\\sayal\\eclipse-workspace\\selenium\\ScreenShotFolder\\"+s1+".jpg");
		FileHandler.copy(src, desti);
		driver.close();
}
}