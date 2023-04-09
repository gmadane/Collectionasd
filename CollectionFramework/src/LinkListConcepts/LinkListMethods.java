package LinkListConcepts;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkListMethods {

	public static void main(String[] args) {

		LinkedList<String> names = new LinkedList<String>();
		System.out.println("Size of linkedlist :: " + names.size());
		names.add("Tom"); // 0
		names.add("Kuldeep"); // 1
		names.add("James"); // 2
		System.out.println("Size of linkedlist :: " + names.size());
		System.out.println("Prininf the LinkedList :: " + names);
		System.out.println("Getiing the items pressent on particuler index :: " + names.get(0));

		// How to iterate the LinkedList
		Iterator<String> it = names.iterator();
		while (it.hasNext()) {
			System.out.println("Accessing LinkedList via iterator :: " + it.next());
		}

		// Adding element at particular position
		names.add(3, "Steve");
		System.out.println(names);

		// Adding names in b/w the nodes
		names.add(1, "Harrry");
		System.out.println(names); // Here names on the index 1 will be shifted to next index

		// Creating new LL and adding to existing one
		LinkedList<String> users = new LinkedList<String>();
		users.add("Peter");
		users.add("Kat");
		names.addAll(users);
		System.out.println(names);
		// Adding name at 1st position
		names.addFirst("Krish");

		// Adding name at last position
		names.addLast("Dhruv");

		// Removing the values from particular index
		names.remove(2);
		System.out.println(names);
		// Removing the 1st name
		names.removeFirst();
		System.out.println("Removing the firest name :: " + names);
		// Removing the last name
		names.removeLast();
		System.out.println("Removing the last name :: " + names);
		// Removing the complete list
		names.clear();
		System.out.println("Removing the complete list :: " + names);

		// Printing the LL items in reverse order
		LinkedList<String> lang = new LinkedList<String>();
		lang.add("Java"); // 0
		lang.add("C"); // 1
		lang.add("Ruby"); // 2
		lang.add("Python"); // 3

		Iterator<String> itr = lang.descendingIterator();
		while (itr.hasNext()) {
			System.out.println("Accessing LinkedList in reverse order :: " + itr.next());
		}
		
		// Printing in sorted order
		Collections.sort(lang);
		System.out.println("Printing in sorted order :: " + lang);
	}

}
