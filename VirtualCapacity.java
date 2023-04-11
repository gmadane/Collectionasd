package ArrayListConcepts;

import java.util.ArrayList;

// Concept of Virtual capacity
public class VirtualCapacity {
	public static void main(String[] args) {
		
		ArrayList<Object> ar = new ArrayList<Object>();
		// It will return the physical size of array which is 0 as of now, as no element is stored
		// Default Virtual capacity is 10 for ArrayList in Java, which will not visible to us
		// When we will keep adding the objects in ArrayList with .add then, Virtual capacity will be decreasing and Physical capacity will be increasing 
		// To change the virtual Virtual capacity explicitly : ArrayList<Object> ar = new ArrayList<Object>(20), here passing 20, so Virtual capacity of 20 will be created
		System.out.println("Physical capacity of ArrayList :::: " + ar.size()); // It will return the Physical capacity
		ar.add("100");
		System.out.println("Physical capacity of ArrayList :::: " + ar.size());
		ar.add("200");
		ar.add("300");
		ar.add("400");
		System.out.println("Physical capacity of ArrayList :::: " + ar.size());
	}
	}



