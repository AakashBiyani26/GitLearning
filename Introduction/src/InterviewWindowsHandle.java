import java.util.Iterator;
import java.util.Set;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InterviewWindowsHandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//In Selenium terminology another tab or another seperate window both are treated same
		System.setProperty("webdriver.chrome.driver","C:\\workaakashoct\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/#");
		driver.findElement(By.xpath("//a[@class='blinkingText']")).click();
		//the cope of the driver is in parent page only. the driver object doesnot have knowledge about the new
		//tab or window opened
		Set<String> windows =driver.getWindowHandles(); //we can get the window handle ids of all the windows opened by Selenium
		//return type is set of strings
		//2 windows id are sitting in the windows object defined above (parent id, child id)
		   //our goal is to pull the ids from the set data structure i.e. 
		//in line 20 where windows variable is defined. for pulling ids we can do it from method called Iterator
		Iterator<String>it=windows.iterator();
		String parentid = it.next(); //this method helps to get next index of the set. control goes to zeroth index
		String childid=it.next(); //control goes to 1st index
		driver.switchTo().window(childid);
		String emailid =driver.findElement(By.xpath("//p[@class='im-para red']")).getText().split("at")[1].trim().split(" ")[0]; 
		//trim would trim or remove all the whitespaces
		//split method will return two values one before at and other after at
		System.out.println(emailid);
		driver.switchTo().window(parentid);
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys(emailid);
		
		

	}

}
