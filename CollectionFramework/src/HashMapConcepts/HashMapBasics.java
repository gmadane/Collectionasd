package HashMapConcepts;

import java.util.HashMap;
import java.util.Iterator;

public class HashMapBasics {

	public static void main(String[] args) {
		// No oder / indexing
		// Stores the values in form of Keys,Values - <K,V>
		// Can store n number of NULL values, but only one NULL key
		// If we store more then one NULL Keys, then latest will be returned 
		// HashMap is not thread safe
		HashMap<String, String> capitalMap = new HashMap<String, String>();
		capitalMap.put("India", "Delhi");
		capitalMap.put("UK", "London");
		capitalMap.put("US", "WashsingDC");
		capitalMap.put(null, "Berlin");
		capitalMap.put(null,"Sydney");
		capitalMap.put("US", "WashsingDC");
		capitalMap.put("Russia", null);
		capitalMap.put("France", null);

		// As HashMap can not have duplicate values, so lets add values with same key say as:
		capitalMap.put("UK", "London111");
		System.out.println("Returing values based on key :::: " + capitalMap.get("India"));
		
		// If you don't have the key then NULL will be returned
		System.out.println("O/P when there is no key present :::: " + capitalMap.get("SouthAfrica"));
		
		// In case if we have duplicate values, then latest value will be returned
		System.out.println("O/P when there are duplicate keys in HashMap :::: " + capitalMap.get("UK"));
		
		// We can have only one NULL key, if there are many then their values will be overridden (latest values will be retrieved) 
		System.out.println("O/P when there Key is Null in HashMap :::: " + capitalMap.get(null));
		System.out.println("O/P when there Value is Null in HashMap :::: " + capitalMap.get("Russia"));
		
		// Removing an entry from HashSet  
				System.out.println("Removing an entry from HashSet  :::: " + capitalMap.remove("France"));
						
		// Iterator : Over the keys : by Using Keyset()
		Iterator<String> it= capitalMap.keySet().iterator();
		while(it.hasNext())
		{
			String key= it.next();
			String value = capitalMap.get(key);
			System.out.println("key  = " + key  + "Value = " + value);
		}
		
		// Iterator using java 8 for each and lambda
		capitalMap.forEach((k,v)->System.out.println("Key = " + k + "and value = " + v));
		
		
	}
}
