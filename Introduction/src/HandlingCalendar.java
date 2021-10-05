import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingCalendar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\workaakashoct\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
		driver.findElement(By.xpath("//input[@class='hasDatepicker']")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String monthyearval =  driver.findElement(By.xpath("//div[@class='ui-datepicker-title']")).getText();
		System.out.println(monthyearval); // i need to seperate out March 2021 as March
		String month= monthyearval.split(" ")[0].trim();
		String year=monthyearval.split(" ")[1].trim();
		System.out.println(month);
		while(!(month.equals("June") && year.equals("2021"))) {
			driver.findElement(By.xpath("//a[@title='Next']")).click();
			 monthyearval =  driver.findElement(By.xpath("//div[@class='ui-datepicker-title']")).getText();
			
			System.out.println(monthyearval); // i need to seperate out March 2021 as March
			 month= monthyearval.split(" ")[0].trim();
			 year=monthyearval.split(" ")[1].trim();
			
		}
		driver.findElement(By.xpath("//a[text()='24']")).click();
		
		

	}

}
