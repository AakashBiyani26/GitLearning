import java.util.HashSet;

public class DuplicateElementsInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String arr[]= {"Java","C++","Python","Java"};
		
		/*for (int i=0;i<arr.length;i++) {
			for (int j=i+1;j<arr.length;j++) {
				if (arr[i]==arr[j]) {
					System.out.println("Found Duplicate Element"+ arr[i]);
					
				}
			}
			
		} */
		
		HashSet<String> langs = new HashSet();
		for (String l:arr) {
			if(langs.add(l)==false) {
				System.out.println("Found Duplicate Element  " + l);
			}
		}
		
		
		

	}

}
