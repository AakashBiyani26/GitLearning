
public class CountCharacterOcurence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="Java Programming Java oops";
		
		int originallength=s.length();
		//s.replace("a", "");
		int finallength= s.replace("a", "").length();
		int count = originallength-finallength;
		System.out.println(count);
		

	}

}
