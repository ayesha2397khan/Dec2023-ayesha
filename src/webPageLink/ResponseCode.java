package webPageLink;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ResponseCode {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\AllDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	    driver.get("https://www.maharashtra.gov.in/");
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("All Broken links --->"+links.size());
		
		for(WebElement broken:links) {
			String linkURl=broken.getAttribute("href");
		    URL url=new URL(linkURl);
		    HttpURLConnection httUrlconnect = (HttpURLConnection)url.openConnection();
		    if(httUrlconnect.getResponseCode()==200) {
		    	System.out.println(linkURl+"--->"+"valid link"+"--->"+httUrlconnect.getResponseCode()+"---->"+httUrlconnect.getResponseMessage());
		    }
		    else if(linkURl==null) {
		    	System.out.println(linkURl);
		    }
		    else {
		    	System.out.println(linkURl+"--->"+"Broken  link"+"--->"+httUrlconnect.getResponseCode()+"---->"+httUrlconnect.getResponseMessage());
		    }
		}
}
}