package ArrayListConcepts;

import java.util.ArrayList;
import java.util.Arrays;
public class ArrayListDemo {

	public static void main(String[] args) {
		// All the collections will store only the Objects not the primitive date types.
		// Default class
		// Dynamic Array
		// Default generic means we can store any kind of data in ArrayList i.e String, Integer, Float
		// if we write like :: ArrayList ar= new ArrayList(), then warning message comes :ArrayList is a raw type. References to generic type ArrayList<E> should be parameterized
		// Good to use in this way
		// Indexing start from 0
		// Negative indexing is not allowed in Java
		ArrayList<Object> ar = new ArrayList<Object>();
		ar.add("100");
		ar.add("KK");
		ar.add("QA");
		ar.add("25.50");
		ar.add(true);
		System.out.println("Size of ArrayList :::: " + ar.size());
		System.out.println("Values in ArrayList :::: " + ar);
		System.out.println("Value at second index :::: " + ar.get(0));
		ar.add("5000");
		ar.add("Testing");
		System.out.println("Size of ArrayList after adding few more items :::: " + ar.size());

		System.out.println("***************************************************************************");

		// List with other collection say as Integer 
		ArrayList<Integer> arInt = new ArrayList<Integer>(Arrays.asList(10, 20, 30, 40));
		System.out.println("Creating ArrayList with Integer Array :::: " + arInt);
		
		System.out.println("***************************************************************************");

		// List with other collection say as String 
		ArrayList<String> arStr = new ArrayList<String>(Arrays.asList("C", "C++","Java"));
		System.out.println("Creating ArrayList with String Array :::: " + arStr);
	}

}
