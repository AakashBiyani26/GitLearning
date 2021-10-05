import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Interviewquestionspart2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\workaakashoct\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.hdfcbank.com/");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class='drp1']//a[@data-toggle='dropdown']")).click();
	    //System.out.println(driver.findElement(By.xpath("//div[@class='drp1']//a[@data-toggle='dropdown']//span")).getText());
		
		
		
		
		List<WebElement> dropdownlist1= driver.findElements(By.xpath("//div[@class='dropdown open']//ul/li"));
       //test case - validate the number of options in the dropdown.
		int n = dropdownlist1.size(); //returns no. of elements in dropdownlist1
		System.out.println(n);
		
		/*for(WebElement Loansdrplist:dropdownlist1 ) {
			if(Loansdrplist.getText().equals("Vehical Insurance")) {
				Loansdrplist.click();
			}
			
		}
		*/
		
		
		
		
		
		
		
		
		
		
		selectoptionfromdropdown(dropdownlist1,"Accounts");
		driver.findElement(By.xpath("//div[@class='drp2']//a[@data-toggle='dropdown']")).click();
		List<WebElement> dropdownlist2= driver.findElements(By.xpath("//ul[@class='dropdown2 dropdown-menu']//li"));
		selectoptionfromdropdown(dropdownlist2,"Salary Accounts");
		/*for(WebElement ptype:dropdownlist) {
			if(ptype.getText().equals("Accounts")) {
				ptype.click();
				break;
			}
			
		}
		*/
		
		//if we have multiple dropdowns we should just write generic method on how we should do it and use
		//that method
		
		
	}
	
	public static void selectoptionfromdropdown(List<WebElement> options, String dropdownvalue) {
		
		for(WebElement ptype:options) {
			if(ptype.getText().equals(dropdownvalue)) {
				ptype.click();
				break;
			}
		}
		
	}
	
	

}
