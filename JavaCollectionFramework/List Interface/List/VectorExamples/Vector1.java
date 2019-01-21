package List.VectorExamples;

import java.util.Iterator;
import java.util.Vector;

public class Vector1 {
	public static void main(String[] args) {
		Vector <String> v = new Vector<String>();
		v.add("Zakir");
		v.add("Varun");
		Iterator <String> itr = v.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
