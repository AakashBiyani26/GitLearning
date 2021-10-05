
public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//Array - a container which stores multiple values of data of same data type
		
		
		int a[] = new int[5]; //this indicates i create space for 5 integers. the data type here is integer
		//the [] indicates array 
		//length of array is 5
		a[0]=2;
		a[1]=6;
		a[2]=8;
		a[3]=9;
		a[4]=12;
		for(int i=0;i<a.length;i++) { //a.length returns the length of array
			System.out.println(a[i]);//retrieves values present in array
			
		}
		//another way of declaring array - array literal.
		int b[]= {1,2,3,4}; //
		

	}

}
