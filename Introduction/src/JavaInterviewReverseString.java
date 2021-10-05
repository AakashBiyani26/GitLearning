
public class JavaInterviewReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1) Using string concatenation operator
		String str = "ABCD";
		String rev="";
		/*int len=str.length();
		str.charAt(0); //to extract a specific character from string we need to specific charAt(index). if index 
		//is zero it will give first character
		
		for(int i=len-1;i>=0;i--) {
			rev = rev + str.charAt(i);
			
			
		}
		*/
		
		//System.out.println("Reversed string is:"+rev);
		
		//2) Using character array
		
		char a[]=str.toCharArray(); //each and every character is seperated and stored into character array
		//ABCD will be stored inside this character array. from this character array i need to read values
		//from the end
		int len=a.length;
		for(int i=len-1;i>=0;i--) {
			rev=rev+a[i];
			
		}
		System.out.println("Reversed string is:"+rev);

	}

}
