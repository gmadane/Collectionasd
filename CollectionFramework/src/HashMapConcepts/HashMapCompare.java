package HashMapConcepts;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map.Entry;

public class HashMapCompare {

	public static void main(String[] args) {
		HashMap<Integer, String> map1 = new HashMap<Integer, String>();
		map1.put(1, "A");
		map1.put(2, "B");
		map1.put(3, "C");

		HashMap<Integer, String> map2 = new HashMap<Integer, String>();
		map2.put(3, "A");
		map2.put(2, "B");
		map2.put(1, "C");

		// As Hashmap does not contain duplicate values to 3 will be stored only once and map1 key set equals to map3
		HashMap<Integer, String> map3 = new HashMap<Integer, String>();
		map3.put(3, "C");
		map3.put(2, "B");
		map3.put(1, "A");
		map3.put(1, "D");
		map3.put(3, "E");
		
		HashMap<Integer, String> map4 = new HashMap<Integer, String>();
		map4.put(3, "C");
		map4.put(2, "B");
		map4.put(1, "A");
		map4.put(1, "D");
		map4.put(10, "E");

		// 1. Compare on the key-values : use equal method
		System.out.println("Comparing map1 and map2  :::: " + map1.equals(map2));
		System.out.println("********************************************************************");
		System.out.println("Comparing map1 and map3  :::: " + map1.equals(map3));
		System.out.println("********************************************************************");
		
		// 2. Compare HashMap by Keys: using keys set
		System.out.println("Comparing map1 and map2 on key basis  :::: " + map1.keySet().equals(map2.keySet()));
		System.out.println("********************************************************************");
		System.out.println("Comparing map1 and map3 on key basis  :::: " + map1.keySet().equals(map3.keySet()));
		System.out.println("********************************************************************");
		System.out.println("Comparing map1 and map3 on key basis  :::: " + map1.keySet().equals(map4.keySet()));
		
		// 3. Find the extra keys in set
		// Combine the keys from both set using HashSet
		HashSet<Integer> combineKeys = new HashSet<>(map1.keySet());
		
		// Add the keys from map4
		combineKeys.addAll(map4.keySet());
		combineKeys.removeAll(map1.keySet());
		System.out.println("********************************************************************");
		System.out.println("Extra keys are :::: " + combineKeys);	
		
		// 4. Compare HashMap by Values
		// Duplicate are not allowed : using ArrayList
		System.out.println("********************************************************************");
		System.out.println("Comparing map1 and map2 on value basis  :::: " + new ArrayList<>(map1.values()).equals(map2.values()));
		System.out.println("Comparing map1 and map4 on value basis  :::: " + new ArrayList<>(map1.values()).equals(map4.values()));
		
		// Duplicate are allowed : using HashSet
		System.out.println("********************************************************************");
		System.out.println("Comparing map1 and map2 on value basis  :::: " + new HashSet<>(map1.values()).equals(new HashSet<>(map2.values())));
		System.out.println("Comparing map1 and map2 on value basis  :::: " + new HashSet<>(map1.values()).equals(new HashSet<>(map4.values())));
		
	}
}
