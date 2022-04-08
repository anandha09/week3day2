package week3day2assi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.TreeSet;

public class Intersection {

	@SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Collection<String> list1 = new TreeSet<String>(Arrays.asList("A", "B", "C"));
		Collection<String> list2 = new TreeSet<String>(Arrays.asList("B", "C", "D", "E", "F"));

	/*	Collection<String> col1 = new ArrayList<String>(); // {a, b, c}
		// Collection<String> col1 = new TreeSet<String>();
		col1.add("a");
		col1.add("b");
		col1.add("c");

		Collection<String> col2 = new ArrayList<String>(); // {b, c, d, e}
		// Collection<String> col2 = new TreeSet<String>();
		col2.add("b");
		col2.add("c");
		col2.add("d");
		col2.add("e");*/

        list1.contains(list2);
		System.out.println(list1); 
		//output for ArrayList: [a, b, c, b, c, d, e]
		//output for TreeSet: [a, b, c, d, e]

	}

}
