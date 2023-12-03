package Handlewebpage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DypatilForm {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\AllDriver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://www.dypatil.edu/application-form/");
	driver.findElement(By.name("first_name")).sendKeys("john");
	driver.findElement(By.name("middle_name")).sendKeys("amy");
	driver.findElement(By.name("surname")).sendKeys("jhonsen");
	driver.findElement(By.name("nationality")).sendKeys("indian");
	driver.findElement(By.name("religion")).sendKeys("muslim");
	driver.findElement(By.name("blood_group")).sendKeys("A+");
	driver.findElement(By.name("address_line_one")).sendKeys("100");
	driver.findElement(By.name("address_line_two")).sendKeys("pune");
	driver.findElement(By.name("address_city")).sendKeys("mumbai");
	driver.findElement(By.name("address_pincode")).sendKeys("400500");
	driver.findElement(By.name("address_state")).sendKeys("delhi");
	driver.findElement(By.name("address_district")).sendKeys("manali");
	driver.findElement(By.name("email")).sendKeys("john123@gmail.com");
	driver.findElement(By.name("telephone")).sendKeys("123546789");
	driver.findElement(By.name("fax")).sendKeys("123");
	driver.findElement(By.name("mobile")).sendKeys("987654");
	driver.findElement(By.name("father_mobile")).sendKeys("123546789");
	driver.findElement(By.name("mother_mobile")).sendKeys("123546789");
	driver.findElement(By.name("class_x_board_and_year")).sendKeys("2012");
	driver.findElement(By.name("class_x_percentage_or_grade")).sendKeys("80");
	driver.findElement(By.name("class_x_subject[]")).sendKeys("English");
	driver.findElement(By.name("class_x_total_marks[]")).sendKeys("100");
	driver.findElement(By.name("class_x_marks_obtained[]")).sendKeys("45");
	driver.findElement(By.name("class_xii_board_and_year")).sendKeys("2014");
	driver.findElement(By.name("class_xii_percentage_or_grade")).sendKeys("65");
	driver.findElement(By.name("class_xii_stream")).sendKeys("science");
	driver.findElement(By.name("class_xii_subject[]")).sendKeys("Physics");
	driver.findElement(By.name("class_xii_total_marks[]")).sendKeys("100");
	driver.findElement(By.name("class_xii_marks_obtained[]")).sendKeys("55");
	driver.findElement(By.name("other_exam_name")).sendKeys("Enternce exam Doctors");
	driver.findElement(By.name("other_exam_year")).sendKeys("2022");
	driver.findElement(By.name("other_exam_marks_obtained")).sendKeys("80");
	driver.findElement(By.name("other_exam_percentile_obtained")).sendKeys("75");
	driver.findElement(By.name("other_exam_rank_obtained")).sendKeys("3");
	
	Thread.sleep(10000);
	driver.close();
}
}
