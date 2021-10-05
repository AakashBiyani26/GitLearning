
public class InterviewSortarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {5,6,4,1,9};
		
		for(int i=0;i<5;i++) {
			
			for(int j=i+1;j<5;j++) {
				if(a[i]>a[j]) {
					//swapping logic
					int temp= a[i];
					a[i]=a[j];
					a[j]=temp;
					
				}
				
			}
		}
		
		for (int i=0;i<5;i++) {
			System.out.println(a[i]);
		}
		
    
		
		
	}

}
