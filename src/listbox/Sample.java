package listbox;

import java.util.List;

//UnsupportedOperationException ------when we perform single select in diselect option error goes to --UnsupportedOperationException
//diselect option only perform on ---MULTIPLE SELECT OPETION

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Sample {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\AllDriver\\chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.get("https://demoqa.com/select-menu");
	Thread.sleep(2000);
//color dropdown
	WebElement color = driver.findElement(By.xpath("//select[@id='oldSelectMenu']"));
	Select s = new Select(color);
	Thread.sleep(2000);
//select the opetion
	s.selectByValue("3");
	Thread.sleep(2000);
//s.deselectByValue("3");---NOT SUPPORT IS SELECT
//is multiple status	
	boolean listboxopetion = s.isMultiple();
	System.out.println("is list box multiselectable = " +listboxopetion);
	Thread.sleep(2000);
//get all Opetion from list box
	System.out.println("***list of all items***");
	List<WebElement> opetions = s.getOptions();
	for(WebElement temp:opetions) {
		System.out.println(temp.getText());
	}
	Thread.sleep(2000);
//get all selected opetion
	System.out.println("***get all selected opetion***");
	List<WebElement> selectedall = s.getAllSelectedOptions();
	System.out.println(selectedall.size());
	
	for(WebElement allopetion:selectedall) {
		System.out.println(allopetion.getText());
	}
//get first select opetion	
	System.out.println("***fist selected opetion***");
	WebElement firstselect = s.getFirstSelectedOption();
	System.out.println(firstselect.getText());
	driver.close();
}
}
