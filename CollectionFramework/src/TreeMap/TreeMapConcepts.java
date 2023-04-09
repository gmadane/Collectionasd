package TreeMap;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapConcepts {
	public static void main(String[] args) {

		TreeMap<Integer, String> map = new TreeMap<Integer, String>();
		map.put(1000, "Kuldeep");
		map.put(6000, "Raj");
		map.put(500, "Akash");
		map.put(4000, "Tom");
		map.put(2000, "Jhon");
		System.out.println("TreeMap values :: " + map); // It will return valaues in order

		// To get the highest number in TreeMap
		System.out.println("Highest value :: " + map.lastKey());

		// To get the lowest number in TreeMap
		System.out.println("Lowest value :: " + map.firstKey());

		// To get the values less then 3000
		Set<Integer> keyslessthen3k = map.headMap(3000).keySet();
		System.out.println("Keys less then 3k :: " + keyslessthen3k);

		// To get the values more then 3000
		Set<Integer> keysgreaterthen3k = map.tailMap(3000).keySet();
		System.out.println("Keys less then 3k :: " + keysgreaterthen3k);
					
		TreeMap<String, Integer> userMap = new TreeMap<String, Integer>();
		userMap.put("Jamnes", 1000);
		userMap.put("Brad", 50000);
		userMap.put("Albert", 6000);
		userMap.put("George", 50);
		userMap.put("Larry",900);
		userMap.put("Ted",800);
		userMap.put("Paul",900);
		
		// If we print out the values the it will be displayed in sorted order
		userMap.forEach((k,v)->System.out.println("Keys :: " + k + " Values :: " + v));
		
		TreeMap<String, Integer> userMap1 = new TreeMap<>(Comparator.reverseOrder());
		userMap1.put("Jamnes", 1000);
		userMap1.put("Brad", 50000);
		userMap1.put("Albert", 6000);
		userMap1.put("George", 50);
		userMap1.put("Larry",900);
		userMap1.put("Ted",800);
		userMap1.put("Paul",900);
		// Printing in reverse order
		System.out.println("Reverse order :: " + userMap1);
	
	}

}
