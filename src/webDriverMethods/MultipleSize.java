package webDriverMethods;


import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleSize {
	public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\AllDriver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
//defualt browser size on launch	
	System.out.println(driver.manage().window().getSize());
	Thread.sleep(2000);
//size-1
   Dimension d1 = new Dimension(350,100);
	driver.manage().window().setSize(d1);
	System.out.println(driver.manage().window().getSize());

	Thread.sleep(2000);
//size-2
	Dimension d2=new Dimension(700,700);
	driver.manage().window().setSize(d2);
	Thread.sleep(2000);
//size-3
	Dimension d3=new Dimension(1000,400);
	driver.manage().window().setSize(d3);
	Thread.sleep(2000);
	driver.close();
}
}