package mouseActions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CustomizedListBox2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\AllDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		Thread.sleep(2000);
		WebElement monthlist = driver.findElement(By.xpath("//select[@id='month']"));
		
	    Actions act = new Actions(driver);
	    act.click(monthlist).perform();
	    String expmonth="May";
	    String actmonth="";
	    int j=1;
	    act.click(monthlist).perform();
	    
	    for(int i=1; i<=12; i++) 
	    {
	    	act.sendKeys(Keys.ARROW_UP).perform();
	    }
	    
	    Thread.sleep(2000);
	    while(!actmonth.equals(expmonth))
	    {
	    	act.sendKeys(Keys.ARROW_DOWN).perform();
	    	Thread.sleep(2000);
	    	j++;
	    	actmonth=driver.findElement(By.xpath("//select[@id='month']/option["+j+"]")).getText();
	    }
	    act.sendKeys(Keys.ENTER).perform();
	  
	}
}
