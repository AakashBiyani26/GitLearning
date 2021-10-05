import java.util.ArrayList;

public class arraylistexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> a = new ArrayList<String>();
		a.add("Rahul");
		a.add("java");
		//in array once we define size and we cannot again increase/decrease the size wheras in arraylist
		//we can increase/decrease the size by adding or removing.Array list is dynamic
		System.out.println(a);
		
		//here i get the result in console as [Rahul, java] but if i have to print it in an array
		//i have to run a for loop and print each of the value
		a.add(0, "student");
		System.out.println(a);
		//a.remove(0); //removing with help of index
		System.out.println(a);
		//a.remove("java"); //removing with string
		System.out.println(a);
		System.out.println(a.get(0)); //this will help us get the value through index
		System.out.println(a.contains("testing")); //this returns if we have a testing value inside the arraylist
		//the return type is boolean. if it contains testing it returns true 
		System.out.println(a.contains("java"));
		System.out.println(a.indexOf("Rahul")); // if i want to know at what index Rahul string is stored
		System.out.println(a.isEmpty()); //this will check if an array is empty.boolean return type
		System.out.println(a.size());
		//all the arraylist accepts duplicate values
		a.add("java");
		System.out.println(a);
		
		//Arrays have fixed size whereas ArrayList can grow/shrink dynamically
		//you can access and insert any value in array list
		
		
		
		
		
		
		

	}

}
