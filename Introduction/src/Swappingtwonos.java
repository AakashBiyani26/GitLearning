
public class Swappingtwonos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=20,b=10;
		System.out.println("Before swapping the values are.."+a+" "+b);
		
		//Logic 1 : using third variable
		
		int t=a;
		a=b;
		b=t;
		System.out.println("After swapping the values are.."+a+" "+b);
		
		
		//Swapping nos. without using temp or 3rd variable
		a = a+b;
		b=a-b;
		a=a-b;
		
		
		

	}

}
