
public class ExceptionHandlingRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}
	
	public static void method1() {
		method2();
		System.out.println("Method1 ended");
		
	}
	
	public static void method2() {
		try {
			String str= null;
			str.length();
			System.out.println("Method2 Ended");
			
		} catch (Exception ex){
			//Exception is one of the classes present in Java
			ex.printStackTrace(); 
			
		}
	}

}
