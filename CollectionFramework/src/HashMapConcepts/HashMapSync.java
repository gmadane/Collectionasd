package HashMapConcepts;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class HashMapSync {

	// How to make HashMap thread safe
	// Synchronized Map method in Collection class
	public static void main(String[] args) {
		Map<Integer, String> map1 = new HashMap<Integer, String>();
		map1.put(1, "Tom");
		map1.put(2, "Dick");
		map1.put(3, "Harry");

		// Create Synchronized Map
		Map<Integer, String> syncMap = Collections.synchronizedMap(map1);
		System.out.println("Synchronized Map :::: " + syncMap);
		
		
		System.out.println("********************************************************************");
		
		// Concurrent HashMap
		// Concurrent HashMap : It does not throw any ConcurrentModifictaionExceptions
		
		ConcurrentHashMap<Integer, String> conMap = new ConcurrentHashMap<Integer, String>();
		conMap.put(1, "Java");
		conMap.put(1, "Phthon");
		conMap.put(1, "Ruby");
		System.out.println("Concurrent HashMap :::: " + conMap.get(1));
		
	}
}
