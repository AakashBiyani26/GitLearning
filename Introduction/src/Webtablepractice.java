import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Webtablepractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\workaakashoct\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://money.rediff.com/gainers");
		
		
		
		List<WebElement> rownum= driver.findElements(By.xpath("//table[@class='dataTable']//tbody/tr"));
		List<WebElement> colnum= driver.findElements(By.xpath("//table[@class='dataTable']//tbody/tr[1]/td"));
		int noofrows= rownum.size();
		int noofcolumns = colnum.size();
		System.out.println("Total columns are:"+ colnum.size());
		System.out.println("Total rows are:"+ rownum.size());
		
		
		//this one is to print maximum current price value
		/*double a[]= new double[rownum.size()];
		
		List<WebElement> Percentchange= driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[4]"));
		for(int i=0;i<rownum.size();i++) {
			a[i]= Double.parseDouble(Percentchange.get(i).getText()); 
			
			
		}
		
		double max = a[0];
		for(int i=0;i<rownum.size();i++) {
			if(a[i]>max) {
				max= a[i];
			}
			
		}
		
		System.out.println("Max number is:"+ max);
		*/
		
		/*for(int rows=1;rows<=rownum.size();rows++) {
			for (int cols=1; cols< colnum.size();cols++) {
				System.out.print(driver.findElement(By.xpath("//table[@class='dataTable']/tbody/tr["+rows+"]/td["+cols+"]")).getText()+"  ");
				
			}
			
		}
		*/
		
		
		
		
		//write a test case to check column heading
		
		
		String a[]= {"Compan","Group","Prev Close (Rs)","Current Price (Rs)","% Change"};
		for(int i=0;i<a.length;i++) {
			List<WebElement> Columnheaders = driver.findElements(By.xpath("//table[@class='dataTable']//tr/th"));
			String Columnheadersvalue = Columnheaders.get(i).getText();
			//Assert.assertEquals(Columnheadersvalue, a[i]);
			boolean Columnresult= false;
			if(Columnheadersvalue.equals(a[i])) {
				Columnresult=true;
				Assert.assertEquals(Columnresult, true);
				System.out.println("Test case passed");
				
			} 
			else {
				
				Assert.assertEquals(Columnresult, true);
				System.out.println("Test case failed");
				
			}
			
			
		}
		
		
		
	
		
		
		
		

	}

}
