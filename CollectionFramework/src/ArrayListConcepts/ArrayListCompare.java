package ArrayListConcepts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListCompare {

	public static void main(String[] args) {
		
		// 1. Using sorting and equals
		ArrayList<String> l1 = new ArrayList<String>();
		l1.add("Tom");
		l1.add("Peter");
		l1.add("Jhon");

		ArrayList<String> l2 = new ArrayList<String>();
		l2.add("Tom");
		l2.add("Peter");
		l2.add("Jhon");
		l2.add("Jack");

		ArrayList<String> l3 = new ArrayList<String>();
		l3.add("Tom");
		l3.add("Peter");
		l3.add("Jhon");
		
		// Sorting using Collection class
		Collections.sort(l1);
		Collections.sort(l2);
		Collections.sort(l3);

		// Checking if these are equals
		System.out.println("Checking that l1 and l2 are equals using sorting and equals :::: " + l1.equals(l2));
		System.out.println("Checking that l1 and l3 are equals using sorting and equals:::: " + l1.equals(l3));

		System.out.println("***************************************************************************");

		// 2. Compare two list - find out the additional elements 
		ArrayList<String> l4 = new ArrayList<String>(Arrays.asList("Tom", "Jakcy", "James","Peter"));
		ArrayList<String> l5 = new ArrayList<String>(Arrays.asList("Tom", "James","Jackson"));
		l4.removeAll(l5);
		System.out.println("Compare two list - find out the additional elements :::: " + l4);
		
		System.out.println("***************************************************************************");
	
		// 3. Compare two list - find out the common elements 		
		ArrayList<String> l6 = new ArrayList<String>(Arrays.asList("QA", "Dev", "IT","HR"));
		ArrayList<String> l7 = new ArrayList<String>(Arrays.asList("QA", "Dev", "IT","HR","Finance","Admin"));	
		l6.retainAll(l7);
		System.out.println("Compare two list - find out the common elements :::: " + l6);
		
	}
}
