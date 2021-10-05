
public class SearchElementArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int a[]= {10,20,30,40,50};
		int search_ele=50;
		
		for(int i=0;i<a.length;i++) {
			if(search_ele==a[i]) {
				System.out.println("Element found at "+ i);
				break;
			}
		}

	}

}
