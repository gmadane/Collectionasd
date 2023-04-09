package ArrayListConcepts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicateElements {

	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(10, 10, 20, 3, 4, 5, 60, 60, 10));

		// 1. Using LinkedHashSet
		// LinkedHashSet is coming from Set family, LinkedHashSet is class which is implementing the set interface.
		// Property of Set is that they can not have duplicate elements 

		LinkedHashSet<Integer> linkSet = new LinkedHashSet<Integer>(numbers);
		ArrayList<Integer> numbersListWithoutDuplicate = new ArrayList<Integer>(linkSet);
		System.out.println("Duplicate numbers removed using LinkedHashSet :::: " + numbersListWithoutDuplicate);

		System.out.println("***************************************************************************");

		// 2. Using JDK 8 onwards use Stream

		ArrayList<Integer> marks = new ArrayList<Integer>(Arrays.asList(100, 100, 220, 32, 344, 54, 60, 60, 100));
		List<Integer> marksListUnique = marks.stream().distinct().collect(Collectors.toList());
		System.out.println("Duplicate numbers removed using Java Streams :::: " + marksListUnique);

		ArrayList<String> names = new ArrayList<String>(Arrays.asList("Tom", "Tom", "Jakcy", "James", "Tom", "Jack"));
		List<String> namesListUnique = names.stream().distinct().collect(Collectors.toList());
		System.out.println("Duplicate numbers removed using Java Streams :::: " + namesListUnique);

	}

}
