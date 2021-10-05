
public class localvsglobal {
	
	
	// Global Variables (Class Variables)
	String name ="tuhin";
	int age = 25; // this variable age is available throughout the program since it is a global variable
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 4;
		//if i have to access the global variable inside the method i cannot access it directly, i will have 
		// to call it through object
		localvsglobal obj = new localvsglobal();
		System.out.println(obj.age);
		

	}
	
	public void sum() {
		int i = 10;
		int j=20;
		int age=25;
		//this age is available only inside this method - local variables
		
	}

}
