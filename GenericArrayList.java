package ArrayListConcepts;

import java.util.ArrayList;

public class GenericArrayList {

	public static void main(String[] args) {
		// Here generic type is Integer, so only Integer values can be stored
		ArrayList<Integer> ar= new ArrayList<Integer>();
		System.out.println("Adding integer values in ArrayList :::: " + ar.add(100));
	
		ArrayList<Double> dar= new ArrayList<Double>();
		System.out.println("Adding double values in ArrayList :::: " + dar.add(100.30));
		
		ArrayList<String> star= new ArrayList<String>();
		System.out.println("Adding string values in ArrayList :::: " + star.add("Kuldeep"));

	}
}
