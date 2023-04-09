package HashMapConcepts;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class HashMapToArrayList {

	public static void main(String[] args) {
		Map<String, Integer> ComMap = new HashMap<String, Integer>();
		ComMap.put("Cisco", 10000);
		ComMap.put("Wallmart", 2000);
		ComMap.put("Amzon", 3000);
		System.out.println("Company map size :::: " + ComMap.size());
		System.out.println("********************************************************************");
		Iterator it = ComMap.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry pairs = (Map.Entry) it.next();
			System.out.println("Company name :::: " + pairs.getKey() + " Size :::: " + pairs.getValue());
		}

		System.out.println("*********************Using java streams*********************************");
		// Using java streams
		ComMap.forEach((k, v) -> System.out.println("Keys = " + k + "Values" + v));

		// Convert HashMap keys to ArrayList
		System.out.println("*********************Convert HashMap keys to ArrayList*********************************");

		List<String> CompanyNameList = new ArrayList<String>(ComMap.keySet());
		System.out.println("Total company list count :::: " + CompanyNameList.size());
		// OR
		for (String t : CompanyNameList) {
			System.out.println("Company name list :::: " + t);
		}
		System.out.println("*********************Convert HashMap Values to ArrayList*********************************");

		// Convert HashMap Values to ArrayList
		List<Integer> CompanySize = new ArrayList<Integer>(ComMap.values());
		System.out.println("Total employee number count :::: " + CompanySize.size());
		// OR
		for (Integer e : CompanySize) {
			System.out.println("Company name list :::: " + e);
		}

	}
}
