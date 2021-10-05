
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {1,3,5,9,15};
		
		
		
		
   
	}
	
	public static int[][]  Returnsmallestnumber(int array[]) {
		
		int sum=0;
		int b;
		
		int min= array[0];
		int max=0;
		for(int i=0;i<array.length-1;i++) {
			sum= sum+array[i];
			
			if(min>array[i] ) {
				min = array[i];
			}
			if(max<array[i]) {
				max= array[i];
			}
			
			   for(int j=i+1;j<array.length-1;j++) {
				   //int a[]= {1,3,5,9,15};
					
				   b=array[i]%array[j];
				   if(b==0) {
					   int lcm= 
				   }
				   
			   }
			
			
			
		}
		
		
		
		List a = new ArrayList<int>;
		a.add(min);
		a.add(sum);
		a.add(max);
		
	}

}
