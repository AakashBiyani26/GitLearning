

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class AutomationPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//Automation Example : if i have to add Multiple vegetables and Add it to Cart

			// create object for Chrome browser
		System.setProperty("webdriver.chrome.driver","C:\\workaakashoct\\chromedriver.exe");
			WebDriver driver= new ChromeDriver();
			String[] itemsNeeded= {"Cucumber","Brocolli"};
			driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
	         List<WebElement> products=driver.findElements(By.cssSelector("h4.product-name"));
	         
	         for (int i=0;i<products.size();i++)
	         {
	         String[] name = products.get(i).getText().split("-"); 
	         String formattedname= name[0].trim();//get method will pull values out of those 30 values.
	         // convert array into arraylist for easy search
	         //check whether name you extracted is present in arraylist or not
	         // arrays take less memory that is why array was declared as Items needed. at run time it is 
	         //converted into array list
	         
	         List itemsNeededlist=Arrays.asList(itemsNeeded);
	         int j=0;
	         if (itemsNeededlist.contains(formattedname))
	         {
	        //j++;
	        	 //click on Add to cart
	       driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
	       
	       /*if(j==3)
	       {
	    	   break;
	       }
	       */
	        
	      
	         }
	         }
	}
	         
	       

}





