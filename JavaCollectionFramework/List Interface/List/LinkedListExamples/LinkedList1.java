package List.LinkedListExamples;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedList1 {
	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();
		list.add("Zakir");
		list.add("Vinit");
		Iterator <String> itr = list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
