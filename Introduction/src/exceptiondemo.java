
public class exceptiondemo {
	
	int b=7;
	int c=0;
	int k=b/c;
	
	public void getdata() {
		System.out.println(k);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//if i am not sure whether particular lines of code will give error or not. if they throw an error i need to
		//catch them and throw a message without failing the code.if people suspect code might throw an error then
		//they try to catch an error.
		int b=7;
		int c=0;
		try
		{
			//int k=b/c;
			//System.out.println(k);
			
			int arr[]= new int[5];
			System.out.println(arr[7]);
		}// one try can be followed by multiple catch blocks
		//catch block should always be followed by try block. In between no code should be written
		
		catch(ArithmeticException et) {
			System.out.println("i catched Arithmetic Exception");
		}
		
		catch(IndexOutOfBoundsException ets)
		{
			System.out.println("i catched Index Out of Bound Exception");
		}
		catch(Exception e) // this is general exception which catches every exception
		{
			//System.out.println("i catched exception");
			System.out.println(e);
		}
		
		//automation perspective : lets say on a ecommerce website, a pop up comes up only during christmas (saying 
		//its a special day. but when christmas ends and pop up doesnot comes for normal automation code with catching 
		//exception the script will fail but if we write an exception saying it is not a special day the script will skip
		// and we will catch that exception as it is not a special day so that script will not fail. to skip that
		//failure write try catch exception.
		
		//one try can be followed by multiple catch blocks. catch should be an immediate block after try.
		
		finally
		{
			//even if the script fails or passes this block will always get executed even if the try block passes
			//and even if try block fails
			
			//Application : Once the test is done you fails or passes you may want to delete cookies or close the browser
			//once the test passes or fails
			
			
			//only when i stop jvm or terminate the program in between then only finally block wont execute
			
		}
		
		
		
				

	}

}
