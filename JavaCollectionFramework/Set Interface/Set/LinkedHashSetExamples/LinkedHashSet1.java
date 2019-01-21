//FIFO Principle 

package Set.LinkedHashSetExamples;

import java.util.*;

public class LinkedHashSet1 {
	public static void main(String[] args) {
		LinkedHashSet<String> lhs = new LinkedHashSet<String>();
		lhs.add("Zakir");
		lhs.add("Vinit");
		lhs.add("Varun");
		
		Iterator<String> itr = lhs.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
