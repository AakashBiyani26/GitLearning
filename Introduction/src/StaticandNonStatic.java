
public class StaticandNonStatic {
	
	String name = "tom"; //non static global variable
	static int age = 26; // static global variable
	
	//global variable - scrope of global variable across all the functions with some conditions.
	
	//how to call static methods and variables
	

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		//two ways for calling static methods - 1) direct call, 2) calling by class name
		sum();
		StaticandNonStatic.sum();
		System.out.println(age);
		System.out.println(StaticandNonStatic.age);
		
		StaticandNonStatic obj = new StaticandNonStatic();
		
		
		//how to call non static methods and variables 
		//static methods and static variables are not part of a Java object
		//static methods and variables are stored in seperate memory allocation. these are freely
		//available inside a memory but not through an object
		
		
		//can i access static methods by using object reference? yes
		//obj.sum()// warning given by yellow line beneath - not a good practice
		
		

	}
	
	public void sendmail() { //non static method
	System.out.println("cricket is good");
	
	}
   
	public static void sum() { //static method
		System.out.println("bowling is great");
	}
}
