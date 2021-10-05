import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;

public class Javascriptutil {
	//JavaScriptExecutor is an Interface that helps to execute JavaScript through Selenium Webdriver. 
	//JavaScriptExecutor provides two methods "executescript" & "executeAsyncScript" to run 
	//javascript on the selected window or current page.
	

	
		// TODO Auto-generated method stub
		
		public static void drawBorder(WebElement element, WebDriver driver) {
			JavascriptExecutor js = ((JavascriptExecutor)driver);
			js.executeScript("arguments[0].style.border='3px solid red'", element); //px is pixels and 3px is 
			//thickness of the border
		}  
		
		public static String getTitleByJS(WebDriver driver) {
			JavascriptExecutor js = ((JavascriptExecutor)driver);
			String title=js.executeScript("return document.title;").toString();
			//If you want to represent any object as a string, toString() method comes into existence.

//The toString() method returns the string representation of the object.
			return title;
			
		}
		
		//how to perform click action by Javascript executor
		public static void clickElementbyJS(WebElement element, WebDriver driver) {
			JavascriptExecutor js = ((JavascriptExecutor)driver);
			js.executeScript("arguments[0].click", element);
			
		}

	}


