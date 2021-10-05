import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class StaticDropdown {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\workaakashoct\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
	


//if any dropdowns has tag called select, then there is a class in Selenium to handle the dropdown
//static dropdown would always have tag name as Select
	
	

WebElement staticdropdown = driver.findElement(By.xpath("//select[@id='ctl00_mainContent_DropDownListCurrency']"));

Select dropdown = new Select(staticdropdown); //Webelement needs to be passed as an argument here
dropdown.selectByIndex(3);// indexes start from 0. 0 is the first option and so on next options.
//if i want to check what is selected, then the below command can be used (methods of select class are used). if i want to confirm what is selected option 
//through script



//if i want to get all options/values in the dropdown i can use beelow line of code
List<WebElement> dropdownoptions = dropdown.getOptions();

for(int i=0;i<dropdownoptions.size();i++) {
	System.out.println(dropdownoptions.get(i).getText());
}

String selectedvalue= dropdown.getFirstSelectedOption().getText();
//System.out.println(selectedvalue);
String ActualValue="USD";
if (selectedvalue=="USD") {
	System.out.println("Pass");
}
else {
	System.out.println("Fail");
}




	



}
}
