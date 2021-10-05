
public class MissingNumberinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//Array should not have duplicates
		//Array no need to be in sorted order
		//Values should be in range
		int a[]= {1,2,4,5}; //3 is missing in this array
		int sum1=0;
		for(int i=0;i<a.length;i++) {
			sum1= sum1+a[i];
			
			
		}
		
		System.out.println("Sum of the elements in array:"+ sum1);
		
		int sum2=0;
		for(int i=1;i<=5;i++) {
			sum2= sum2+ i;
		}
		
		System.out.println("Sum of range of elements in array"+ sum2);
		System.out.println("Missing number is"+ (sum2-sum1));
		

	}

}
