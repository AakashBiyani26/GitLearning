import java.util.ArrayList;

public class JavaInterviewquestioncomparearray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//program to compare every index of two arrays and print the equal indexes into a different array
		
		int a[]= {2,4,3,7,9,2};
		int b[]= {1,4,3,7,9,2,5,7};
		// if i compare these two arrays then i donot know how many matching indexes would be there
		// and i cant put them into one array of particular number as i donot know what would be 
		//the length of array
		//if i want to create any array i have to give the memory allocation space or i have to
		//declare how many elements that array is going to have
		//in this case we use array list. when we think array shrinks or grows then we have to rely on
		//Array list which can grow or shrink dynamically.
		ArrayList<Integer> al = new ArrayList<Integer>();
		for(int i=0;i<a.length;i++) {
			if(a[i]==b[i]) {
				al.add(a[i]);  //4 and 7 will be added in Arraylist al
				
				//here the array can be a dynamically growing one depending on number of matching indexes
				
				
				
			}
		}
		Object[] c=al.toArray();
		
		
		//whenever there is a question on array start with for loop and then think about logic to be implemented
		
		for(Object ob: c) //Object is return type for every element present in this array 
		{
			System.out.println(ob);
		}
		
		
		
			
			
		

	}

}
