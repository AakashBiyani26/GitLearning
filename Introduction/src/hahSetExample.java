import java.util.HashSet;
import java.util.Iterator;

public class hahSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//HashSet treeset LinkedHashSet implements the Set Interface
		//diff between list and set - Set interface doesnot accept duplicate values.
		//in set Interface there is no guarantee elements are stored in sequential order. they are stored in
		//random order
		//we can use hashset when we donot want duplicate elements 
		
		HashSet<String> hs = new HashSet<String>();
		//we cannot pick or retrieve objects based on Index like we could do in Arraylist
		hs.add("USA");
		hs.add("UK");
		hs.add("India");
		hs.add("India");
		System.out.println(hs);
		//only one time India is added
		hs.remove("UK");
		System.out.println(hs.isEmpty());
		System.out.println(hs.size());
		hs.add("he");
		hs.add("goa");
		
		//An Iterator is an object that can be used to loop through collections, like ArrayList and HashSet.
		//It is called an "iterator" because "iterating" is the technical term for looping.

//To use an Iterator, you must import it from the java.util package.

//The iterator() method can be used to get an Iterator for any collection
		//hs.iterator();  //this iterator method will start and iterate through each and every object present 
		//in the string. the return type is iterator string
		Iterator<String>  i = hs.iterator();
		i.next(); //for every i.next the control will move down in that data set
		while(i.hasNext()) {  //i.hasNext() checks if there is an element present
			System.out.println(i.next());
		}
		
	//List accepts duplicate value but set doesnot accept duplicate values
		//List guarantees order but set doesnot guarantee order
		
		
		
		
		
		

	}

}
