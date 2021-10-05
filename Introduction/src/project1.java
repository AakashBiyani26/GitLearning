import java.util.Iterator;
import java.util.Set;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class project1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","C:\\workaakashoct\\chromedriver.exe");
WebDriver driver= new ChromeDriver();
driver.get("https://support.google.com/accounts/answer/27441?hl=en");

//By default Selenium is on Parent window only. we have to switch control to child window in order to perform tasks there.
driver.findElement(By.xpath("//h1[text()='Create a Google Account']//following::li[text()='Go to the '][1]/a[1]")).click();
//we need to ask selenium to get all the windows available. for that there is below command. all windows id need to be stored in set data structure (set of strings)
Set<String> ids= driver.getWindowHandles();
//in the first set parent window id is there, second set the child window opened got stored. as per the sequence the ids are stored.

// in orfder to traverse to child windows id in the Set, we use iterator method
Iterator<String> it = ids.iterator();
String parentid=it.next(); //it.text grabs the string from set strring data structure.
String childid=it.next();
driver.switchTo().window(childid);
System.out.println(driver.getTitle());
driver.close();
driver.switchTo().window(parentid);
System.out.println(driver.getTitle());




	}

}
