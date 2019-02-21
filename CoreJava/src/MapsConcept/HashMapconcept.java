package MapsConcept;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashMapconcept {

	public static void main(String[] args) {
		HashMap<Integer,String> hm = new HashMap<Integer,String>();
		hm.put(1, "Selenium");
		hm.put(2, "TestNg");
		hm.put(3, "POM");
		hm.put(4, "qtp");
		
System.out.println(hm.get(1));

for(Entry m:hm.entrySet()) {
	System.out.println(m.getKey()+ ""+m.getValue());
}
System.out.println(hm);
hm.remove(3);
System.out.println(hm);

	}

}
