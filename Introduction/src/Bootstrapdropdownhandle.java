import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bootstrapdropdownhandle {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\workaakashoct\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		/*driver.get("http://www.jquery-az.com/boots/demo.php?ex=63.0_2");
		Thread.sleep(4000);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[contains(@class,'multiselect')]//span")).click();
		Thread.sleep(3000);
		List<WebElement> list=driver.findElements(By.xpath("//ul[contains(@class,'multiselect')]//li//a//label"));
		int n = list.size();
		System.out.println(n);
		
		/*for (int i=0;i<n;i++) {
			System.out.println(list.get(i).getText());
			if(list.get(i).getText().contains("Angular")) { //if i want to select only Angular
				list.get(i).click();
			}
		}
		*/
		
		//if i want to select all dropdown values then below code
		/*for (int i=0;i<n;i++) {
			

				list.get(i).click();
			}
		*/
		
	driver.get("https://v4-alpha.getbootstrap.com/components/dropdowns/");
	driver.manage().window().maximize();
	Thread.sleep(3000);
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("window.scrollBy(0,1000)");
	Thread.sleep(3000);
 driver.findElement(By.xpath("//button[@id='dropdownMenuButton']")).click();
 Thread.sleep(3000);
 List<WebElement> list= driver.findElements(By.xpath("//div[@class='dropdown show']//div/a"));
 System.out.println(list.size());
 for(WebElement ele : list) {
	 
	 if(ele.getAttribute("innerHTML").contains("Another action")) {
		 ele.click(); 
		 break;
	 }
 }
	 
	 
	 
 }
}
 
  
	
	
	
		

	


