import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InterviewPractice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\workaakashoct\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.cleartrip.com/flights");
		driver.manage().window().maximize();
		
		//the current date in datepicker is highlighted with Blue text
		driver.findElement(By.xpath("//input[@id='DepartDate']")).click();
		driver.findElement(By.xpath("//a[@class='ui-state-default ui-state-highlight ui-state-active ']")).click();
		//the active, highlight in class in above xpath are css to highlight the current date. if we look at other
		//dates we donot see highlight and active. they are highlighting the current date with such class
		
	}

}
