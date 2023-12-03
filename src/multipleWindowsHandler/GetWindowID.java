package multipleWindowsHandler;
//use to method 
//1.getwindowhandle 
//2.getwindowhandles
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWindowID {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\AllDriver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	
	driver.get("https://www.mahaconnect.in/jsp/index.html");
	Thread.sleep(2000);
	String winhId = driver.getWindowHandle();
	System.out.println( winhId );

}
}
//F7E47A9D3B919C2B4375D6B7B6E38B05
//674139DFA603FFB770989F47B4DA387B