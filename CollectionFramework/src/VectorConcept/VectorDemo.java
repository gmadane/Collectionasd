package VectorConcept;

import java.util.Collections;
import java.util.Iterator;
import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		Vector<Integer> MyVect = new Vector<Integer>();
		MyVect.add(1);
		MyVect.add(4);
		MyVect.add(55);
		MyVect.add(89);
		MyVect.add(33);
		MyVect.add(73);
	//	MyVect.add(100);
		System.out.println(MyVect);
		System.out.println(MyVect.get(3));
		MyVect.remove(4);
		System.out.println(MyVect);

		Vector<Integer> YourVect = new Vector<Integer>();
		YourVect.add(100);
		YourVect.add(400);
		YourVect.add(550);

		// Adding two Vectors
		MyVect.addAll(YourVect);
		System.out.println(MyVect);

		for (Integer e : MyVect) {
			System.out.println(e);
		}
		for (int p = 0; p < MyVect.size(); p++) {
			System.out.println(MyVect.get(p));
		}

		Iterator<Integer> it = MyVect.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}	
		Collections.sort(MyVect);
		System.out.println("Printing in Vector in sorted order :: " + MyVect);
	}
	
}
