package collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class hashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String>hm=new HashMap<Integer,String>();
		hm.put(0, "man");
		hm.put(1, "women");
		hm.put(2, "girl");
		hm.put(3, "boy");
		System.out.println(hm.get(2));
		hm.put(42, "boy");
		System.out.println(hm.get(3));
		hm.remove(42);
		System.out.println(hm.get(42));// null value print.

		//Entryset() in ths method use to set all key value and pair it in set
		//hashmap are convering set value.
		Set st =  hm.entrySet();
	Iterator<String>it=st.iterator();
	while(it.hasNext()) {
		
		 Map.Entry mp=(Map.Entry)it.next();
		System.out.println( mp.getKey());
		 
		
	}


	}

}
