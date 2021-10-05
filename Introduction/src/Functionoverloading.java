
public class Functionoverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Function overloading is using same method name multiple times but differentiaiting it based upon arguments
//either argument count should be different or data type of arguments should be different
		Functionoverloading a= new Functionoverloading();
		a.getData(1, 2);
		a.getData(3, 4, 5);
		
		
	}
	
	
	public void getData(int a,int b) {
		System.out.println(a+b);
		
	}
	
	public void getData(int a, int b,int c) { // no. of arguments passed/parameters passed are different
		System.out.println(a+b+c);
	}
	
	public void getData(String a) {// here argument data type is different
		
		System.out.println(a);
		
	}

}
