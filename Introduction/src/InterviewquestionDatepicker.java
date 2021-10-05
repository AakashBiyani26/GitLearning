
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InterviewquestionDatepicker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\workaakashoct\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		String year="2021";
		String month="July";
		String date = "10";
		driver.findElement(By.xpath("//input[@id='onward_cal']")).click();
		
		while(true) {
			String monthyear= driver.findElement(By.xpath("//td[@class='monthTitle']")).getText();
			//Apr 2021 is a combined string
			String arr[]=monthyear.split(" "); //i have to split and the parameter or on what basis by which i have to split should be
			//given in the argument. here it is space.i get two different values after splitting. to store
			//two values we have to create one string array.
			String mon=arr[0];
			String yr= arr[1];
			
			if(mon.equalsIgnoreCase(month)&& yr.equalsIgnoreCase(yr)) 
				break;
			else 
				driver.findElement(By.xpath("//td[@class='next']//button")).click();
				
			
			
		}
		
		List<WebElement> alldates = driver.findElements(By.xpath("//table[@class='rb-monthTable first last']//tbody//tr/td"));
		for(WebElement selectdate:alldates) {
			
			String selectdatevalue= selectdate.getText();
			if(selectdatevalue.equals(date)) {
				selectdate.click();
				break;
			}
			
			
		}
		

	}

}
