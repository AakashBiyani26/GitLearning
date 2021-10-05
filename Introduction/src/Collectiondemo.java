import java.util.ArrayList;

public class Collectiondemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {4,5,5,5,4,6,6,9};
		// i want to print how many times these nos repeat . For eg 4 repeats 2 times, 5 repeats 3 times
		
		ArrayList<Integer>al = new ArrayList<Integer>();
		for(int i=0;i<a.length;i++) {
			int k=0;
			if(!al.contains(a[i])) {
				al.add(a[i]);
				k++;
				
				for(int j=i+1;j<a.length;j++) {
					if(a[i]==a[j]) {
						k++;
						
					}
					
				}
				System.out.println(a[i]+ " is repeated "+ k);
				
				
			}
		}

	}

}
