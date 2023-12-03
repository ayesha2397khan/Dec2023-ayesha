package WebElementInterface;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllInterface {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\AllDriver\\chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.get("https://www.facebook.com/");
	WebElement createAcc = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
//click the button
	createAcc.click();
	Thread.sleep(2000);
//sendkeys
	WebElement firstname = driver.findElement(By.xpath("//input[@name='firstname']"));
	firstname.sendKeys("aisha");
	Thread.sleep(2000);
//clear
	firstname.clear();
//sendkeys
	firstname.sendKeys("ayesha");
	Thread.sleep(2000);
//gettext
	String text = driver.findElement(By.xpath("(//p[@class='_58mv'])[1]")).getText();
	System.out.println(text);
	Thread.sleep(2000);
//getattribute
	String atri = firstname.getAttribute("class");
	System.out.println(atri);
	Thread.sleep(2000);
//gettagname
	String tag = firstname.getTagName();
	System.out.println(tag);
	Thread.sleep(2000);
//getlocation
	driver.findElement(By.xpath("(//input[@data-type='text'])[1]")).getLocation();
	Point location = firstname.getLocation();
	System.out.println(location);
	int x = location.getX();
	System.out.println(x);
	int y = location.getY();
	System.out.println(y);
	Thread.sleep(2000);
//getsize
	Dimension firstn = firstname.getSize();
	System.out.println(firstn);
	System.out.println(firstn.getHeight());
	System.out.println(firstn.getWidth());
	Thread.sleep(2000);
//isSelected
	WebElement female = driver.findElement(By.xpath("(//input[@class='_8esa'])[1]"));
	System.out.println(female.isSelected());
	female.click();
	Thread.sleep(2000);
//isDisplyaed
	boolean logo = driver.findElement(By.xpath("//img[@class='fb_logo _8ilh img']")).isDisplayed();
	System.out.println(logo);
//isEnabled
     WebElement signup = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
     boolean btnstatus = signup.isEnabled();
     System.out.println(btnstatus);
     Thread.sleep(2000);
//submit
     signup.click();
     Thread.sleep(2000);
	
	driver.close();
}
}
