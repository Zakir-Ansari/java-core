//LIFO Principle

package Sorted.TreeSetExamples;

import java.util.*;

public class TreeSet1 {
	public static void main(String[] args) {
		TreeSet<String> ts = new TreeSet<String>();
		ts.add("Zakir");
		ts.add("Varun");
		ts.add("Vinit");
		
		Iterator <String> itr = ts.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
