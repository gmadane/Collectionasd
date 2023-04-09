package ArrayListConcepts;

import java.util.ArrayList;
import java.util.Arrays;

public class ArraryListMethods {

	public static void main(String[] args) {

		ArrayList<String> studentdList = new ArrayList<String>();
		studentdList.add("Tom");
		studentdList.add("Peter");
		studentdList.add("Jhon");
		studentdList.add("James");
		studentdList.add("Rosy");
		studentdList.add("Jack");

		ArrayList<String> courseList = new ArrayList<String>();
		courseList.add("C");
		courseList.add("C++");
		courseList.add("java");

		// Adding studentdList and courseList
		System.out.println("***************Adding studentdList and courseList***************");
		studentdList.addAll(courseList);
		System.out.println("Adding studentdList and courseList :::: " + studentdList);

		// Contains method is used to check if particular object is present or not
		System.out.println("***************Contains method is used to check if particular object is present or not***************");
		System.out.println("Check if StudentList contains Tom :::: " + studentdList.contains("Tom"));
		System.out.println("Check if StudentList contains Jhony :::: " + studentdList.contains("Jhony"));

		// Checking the index of object
		System.out.println("***************Checking the index of object***************");
		System.out.println("Checking the index valude of James :::: " + studentdList.indexOf("James"));

		// Removing the items from list
		System.out.println("***************Removing the items from list***************");
		System.out.println("Removing value at particuler index :::: " + studentdList.remove(3));
		System.out.println("Removing item with value :::: " + studentdList.remove("Jack"));
		System.out.println("StudentdList after removing value :::: " + studentdList);

		// Clear the ArraryList
		System.out.println("***************Clear the ArraryList***************");
		studentdList.clear();
		System.out.println("Cleraing the ArrayList :::: " + studentdList);

		// List with other collection say as Integer, this is another way to declare the ArryList : Arrays.asList
		System.out.println("***************List with other collection say as Integer***************");
		ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(10, 1, 2, 3, 4, 5, 6, 35, 38, 47));
		System.out.println("Creating ArrayList with Integer Array :::: " + numbers);

		// Using lambda function check the numbers which are divided by 2
		System.out.println("***************Using lambda function check the numbers which are divided by 2***************");
		numbers.removeIf(num -> num % 2 == 1);
		System.out.println("Even numbers in the list (divided by 2) are :::: " + numbers);

		// Using lambda function check the numbers which are not divided by 2
		System.out.println("***************Using lambda function check the numbers which are not divided by 2***************");
		numbers.removeIf(num -> num % 2 == 0);
		System.out.println("Odd numbers in the list (not divided by 2) are :::: " + numbers);

		// Creating sublist from numbersList
		System.out.println("***************Creating sublist from numbersList***************");
		ArrayList<Integer> numbersList = new ArrayList<Integer>(
				Arrays.asList(10, 1, 2, 3, 4, 5, 6, 35, 38, 47, 3, 4, 44, 4, 4, 4354, 545, 4, 545));
		ArrayList<Integer> subList = new ArrayList<Integer>(numbersList.subList(2, 6));
		System.out.println("Creating sublist from numbersList :::: " + subList);

		// Convert ArrayList to Array
		System.out.println("***************Convert ArrayList to Array***************");
		ArrayList<String> names = new ArrayList<String>(Arrays.asList("C", "C++", "Java", "XML"));
		// With the help of toArray one dimensional Array will be returned
		Object arrName[] = names.toArray();
		System.out.println(Arrays.toString(arrName));
		for (Object o : arrName) {
			System.out.println(o);
		}
	}

}