
public class endtoend {

	
	public void getData()
	{
		// Java point of view, string is one of the pre=Built class in Java
		// Ways to define String
		//1) String literal, 2) by creating objects of string
		//methods are never allowed inside the main block
		System.out.println("I am in method");
		//objects are instances/references of a class
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		endtoend e=new  endtoend();
		e.getData();
		Secondclass s=new Secondclass();
		s.SetData();
		
		String a = " hello"; // String literal defining
		//string index starts from 0. a[0]=a,a[1]=a,a[2]=k
		String ab= new String ("aakash"); // String class defining
		//System.out.println(a.charAt(2)); // prints the character at second index
		//System.out.println(a.indexOf("e")); // prints index of e
		System.out.println(a.substring(1, 4));
		System.out.println(a.concat("aakash"));
		System.out.println(a);
		System.out.println(a.trim());
		
		
		
		
		
		
		
		
		

	}

}
