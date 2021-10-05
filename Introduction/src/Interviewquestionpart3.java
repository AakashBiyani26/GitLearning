

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Interviewquestionpart3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\workaakashoct\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://itera-qa.azurewebsites.net/home/automation");
		
		
		
		
		//select specific checkbox
		//driver.findElement(By.xpath("//input[@id='monday']")).click();
		
		//select all checkboxes
		List<WebElement> Allcheckboxesdays =driver.findElements(By.xpath("//input[@type='checkbox' and contains(@id,'day')]"));
		System.out.println("Total checkboxes:"+Allcheckboxesdays.size()); //get total no. of checkboxes for days
		//if i want to click on all these checkboxes i will use for loop
		/*for(int i=0;i<Allcheckboxesdays.size();i++) {
			Allcheckboxesdays.get(i).click();
			
			
		}
		*/
		/*for(WebElement chkbox:Allcheckboxesdays) {
			chkbox.click();
			
		}
		*/
		
		//if i want o select checkboxes of only my choice like sunday and monday
		
		/*for (WebElement specchckbox:Allcheckboxesdays) {
			String checkboxname = specchckbox.getAttribute("id"); // we get id value i.e. monday,tuesday etc.
			if(checkboxname.equals("monday") || checkboxname.equals("sunday")) { // we check if the value we got equals monday or sunday
				specchckbox.click();
			}
			
			
			
		}
		*/
		
		//if i want to select last 2 checkboxes
		int checkboxesnumber = Allcheckboxesdays.size();
		/*for(int i=checkboxesnumber-2;i<checkboxesnumber;i++) {
			Allcheckboxesdays.get(i).click();
			
		}
		*/
		
		//if i want to select first 2 checkboxes
		for(int i=0;i<checkboxesnumber;i++) {
			if(i<2) {
				Allcheckboxesdays.get(i).click();
				
			}
		}
		
		

	}

}
