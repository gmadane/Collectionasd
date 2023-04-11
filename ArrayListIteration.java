package ArrayListConcepts;

import java.util.ArrayList;
import java.util.Iterator;

//Iteration in ArrayList using different ways

public class ArrayListIteration {

	public static void main(String[] args) {
		ArrayList<String> studentList = new ArrayList<String>();
		studentList.add("Tom");
		studentList.add("Peter");
		studentList.add("Jhon");
		studentList.add("James");

		// Typical for loop
		for (int i = 0; i < studentList.size(); i++) {
			System.out.println("Students names in ArrayList using for loop :::: " + studentList.get(i));
		}

		System.out.println("***************************************************************************");

		// For each loop
		for (String s : studentList) {
			System.out.println("Students names in ArrayList using for each loop :::: " + s);
		}

		System.out.println("***************************************************************************");

		// Java streams with Lambda after JDK 8
		studentList.stream().forEach(kk -> System.out.println("Students names in ArrayList using Lambda funcation :::: " + kk));

		System.out.println("***************************************************************************");

		// Using iterator
		Iterator<String> it = studentList.iterator();
		while (it.hasNext()) {
			System.out.println("Students names in ArrayList using iterator :::: " + it.next());
		}
	}
}
