
public class TwoArrayComparisons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a1[]= {1,2,3,4,5,6};
		int a2[]= {1,2,3,4,5};
		
		boolean status = true;
		if(a1.length==a2.length) {
			
			for(int i=0;i<a1.length;i++) {
				if(!(a1[i]  == a2[i])) 
				{
					status=false;
					
					
				}
			}
		}
		else {
			status = false;
			
		}
		
		if(status==true) {
			System.out.println("Both Arrays value match");
		} else {
			System.out.println("Arrays value donot match");
		}
		

	}

}
