package HashMapConcepts;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class HashMapIterator {

	public static void main(String[] args) {
		// No oder / indexing
		// Stores the values in form of Keys,Values - <K,V>
		// Can store n number of NULL values, but only one NULL key
		// HashMap is not thread safe
		HashMap<String, String> capitalMap = new HashMap<String, String>();
		capitalMap.put("India", "Delhi");
		capitalMap.put("UK", "London");
		capitalMap.put("US", "WashsingDC");
		capitalMap.put(null, "Berlin");
		capitalMap.put(null, "Sydney");
		capitalMap.put("US", "WashsingDC");
		capitalMap.put("Russia", null);
		capitalMap.put("France", null);
		capitalMap.remove("France");
		// As HashMap does not maintain order, so we can not use for loops
		// Iterator : Over the keys : by using ketSet
		Iterator<String> it = capitalMap.keySet().iterator();
		while (it.hasNext()) {
			String key = it.next();
			String value = capitalMap.get(key);
			System.out.println("Key :::: " + key + " Value :::: " + value);
		}

		System.out.println("********************************************************************");

		// Iterator : Over the set (pair) : by using entrySet
		Iterator<Entry<String, String>> it1 = capitalMap.entrySet().iterator();
		while (it1.hasNext()) {
			Entry<String, String> entry = it1.next();
			System.out.println("Key :::: " + entry.getKey() + " Value :::: " + entry.getValue());
		}
		
		System.out.println("********************************************************************");
	
		// Iterate HashMap using java8, for each and lambda
		capitalMap.forEach((k,v)->System.out.println("Key :::: " + k + " Value :::: " + v));
		
	}
}
