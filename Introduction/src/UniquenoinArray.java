import java.util.ArrayList;

public class UniquenoinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {4,5,5,5,4,6,6,9,4};
		ArrayList<Integer> ab= new ArrayList<Integer>();
		for(int i=0;i<a.length;i++) {
			int k=0;
			if(!ab.contains(a[i])) {
				ab.add(a[i]);
				k++;
				
				
			  for (int j=i+1;j<a.length;j++) {
				  if(a[j]==a[i]) {
					  k++;
					  
				  }
			  }
			  }
			if(k==1) {
				System.out.println(a[i]+ " is Unique number");
			}
		}

	}

}
