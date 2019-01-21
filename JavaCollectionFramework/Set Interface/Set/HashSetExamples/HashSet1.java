//Hashing is used to store the elements in the HashSet. It contains unique items.
//LIFO

package Set.HashSetExamples;

import java.util.*;

public class HashSet1 {
	public static void main(String[] args) {
		Set<String> hs = new HashSet<String>();
		hs.add("Zakir Ansari");
		hs.add("Varun");
		
		Iterator<String> itr = hs.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
