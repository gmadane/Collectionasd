package ArrayListConcepts;

import java.util.ArrayList;
import java.util.Arrays;

public class listar {

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
		
		System.out.println(studentdList);		
		studentdList.addAll(courseList);
		System.out.println(studentdList);
		System.out.println("Check if StudentList contains Tom :::: " + studentdList.contains("Tom"));
		System.out.println("Check if StudentList contains Jhony :::: " + studentdList.contains("Jhony"));
    System.out.println("Checking the index valude of James :::: " + studentdList.indexOf("James"));
    System.out.println("Removing value at particuler index :::: " + studentdList.remove(3));
	System.out.println("Removing item with value :::: " + studentdList.remove("Jack"));
	System.out.println(studentdList);
	studentdList.clear();
	System.out.println(studentdList);
	
	
	ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(10, 1, 2, 3, 4, 5, 6, 35, 38, 47));
	System.out.println("Creating ArrayList with Integer Array :::: " + numbers);







	}

}
