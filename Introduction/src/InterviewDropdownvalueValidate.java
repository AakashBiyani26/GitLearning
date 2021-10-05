import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class InterviewDropdownvalueValidate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		public void ValidateDropdownValues() {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\workaakashoct\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement dropdown = driver.findElement(By.xpath("//select[contains(@name,'DropDownListCurrency')]"));
		Select exval = new Select(dropdown);
		List ActualDropdownvalues = new ArrayList();
	    List<WebElement> actdrpval= exval.getOptions();
	    for(WebElement val: actdrpval) {
	    	ActualDropdownvalues.add(val.getText());
	    	
	    }

        List ExpectedDropdownvalues = new ArrayList();
        ExpectedDropdownvalues.add("Select");
        ExpectedDropdownvalues.add("INR");
        ExpectedDropdownvalues.add("AE");
        ExpectedDropdownvalues.add("USD");
        
        
        
        for(int i=0;i<ActualDropdownvalues.size();i++) {
        	//Assert.assertEquals(ActualDropdownvalues.get(i), ExpectedDropdownvalues.get(i));
        	Assert.assertTrue(ActualDropdownvalues.get(i).equals(ExpectedDropdownvalues.get(i)));
        }
        
	    
		

	}

}
