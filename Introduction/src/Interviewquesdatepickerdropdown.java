import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Interviewquesdatepickerdropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		System.setProperty("webdriver.chrome.driver","C:\\workaakashoct\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.dummyticket.com/dummy-ticket-for-visa-application/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='dob']")).click();
		WebElement Monthdrpdown= driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
		Select month = new Select(Monthdrpdown);
		month.selectByVisibleText("Jul");
		WebElement Yeardrpdown = driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
		Select year = new Select(Yeardrpdown);
		year.selectByVisibleText("2022");
		String selectdate= "15";
		List<WebElement> dates= driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody/tr/td"));
		
		for(WebElement date:dates) {
			String dateval= date.getText();
			if(selectdate.equals(dateval)) {
				date.click();
				break;
				
			}
		}

	}

}
;