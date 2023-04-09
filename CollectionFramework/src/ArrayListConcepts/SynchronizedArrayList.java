package ArrayListConcepts;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class SynchronizedArrayList {

	public static void main(String[] args) {

		// By default ArrayList is not synchronized / not thread safe
		
		// 1. Collections.synchronizedList

		List<String> names = Collections.synchronizedList(new ArrayList<String>());
		names.add("Java");
		names.add("C");
		names.add("C++");

		// For Add/Remove operations we don't need explicit synchronized
		// For Fetch / Traverse we explicit synchronized as below:
		synchronized (names) {
			Iterator<String> it = names.iterator();
			while (it.hasNext()) {
				System.out.println(it.next());
			}
		}
		
		System.out.println("***************************************************************************");
		// 2. CopyOnWriteArrayList - its a class which is Thread safe/synchronized already (Thread safe variant)
		CopyOnWriteArrayList<String> empList = new CopyOnWriteArrayList<String>();
		empList.add("Tom");
		empList.add("Jmaes");
		empList.add("Peter");

		// We don't need explicit synchronization for Add/Remove/Fetch/Traverse as used in previous method
		Iterator<String> it = empList.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
