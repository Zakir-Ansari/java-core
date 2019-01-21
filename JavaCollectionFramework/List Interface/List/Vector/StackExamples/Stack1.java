package List.Vector.StackExamples;

import java.util.Iterator;
import java.util.Stack;

public class Stack1 {
	public static void main(String[] args) {
		Stack <String> stk = new Stack<String>();
		stk.add("Zakir");
		stk.add("Vinit");
		stk.add("Unknown");
		stk.pop();
		Iterator <String> itr = stk.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
