package listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultipleSelect {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\AllDriver\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://demoqa.com/select-menu");
		Thread.sleep(2000);
//car dropdown		
		WebElement carlist = driver.findElement(By.xpath("//select[@id='cars']"));
		Select s = new Select(carlist);
		Thread.sleep(2000);
//select the opetion		
		s.selectByIndex(0);
		Thread.sleep(2000);
		s.selectByValue("saab");
		Thread.sleep(2000);
		s.selectByVisibleText("Audi");
		Thread.sleep(2000);
//deselect opetion
		s.deselectByIndex(1);
//multiple status
		boolean listbox = s.isMultiple();
		System.out.println("is listbox multiselectable = " +listbox);
		Thread.sleep(2000);
		driver.close();
}
}