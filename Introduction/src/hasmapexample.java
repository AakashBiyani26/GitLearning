import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class hasmapexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer,String> hm = new HashMap<Integer,String>();
		hm.put(0, "hello"); //(key,value)
		hm.put(1, "good");
		hm.put(42, "morning");
		System.out.println(hm.get(42));
		Set sn= hm.entrySet();
		Iterator<String> it= sn.iterator();
		for(Map.Entry m : hm.entrySet()){    
		    System.out.println(m.getKey()+" "+m.getValue());    
		   }  
		
		
		//it is like key value pair. we need to pass the key i.e at what place we want to place our value

	}

}
