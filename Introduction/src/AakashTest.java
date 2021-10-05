public class AakashTest{
	
	
	public static void main (String[] args) {
		String atos = "ABCD1234abcd-1234abcd2";
		int n = atos.length();
		//String firstnumber="";
		
		//String a= atos.replaceAll("A", "0");
		 //a= atos.replace("B", "0");
		
		int count=0;
		 
		
		
		for(int i=0;i<n-1;i++) {
			
			     for (int j=i+1;j<n-1;j++) {
			    	 if(atos.charAt(i)==atos.charAt(j)) {
			    	 count++;
			    	 }
			    	 
			    	 
			    	 
			     }
			     
			     System.out.println(atos.charAt(i) +" is present for :" + count);
			     
			
		
		//1234   -1234  2
		
		}
		
		
		Set<String>  a= dri
		
		
		
	
	}
}
			
			/*for(int i=0;i<a.length-1;i++) {
				System.out.println(a[i]);
			}*/