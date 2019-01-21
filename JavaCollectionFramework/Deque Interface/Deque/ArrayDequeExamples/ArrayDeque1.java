package Deque.ArrayDequeExamples;

import java.util.*;

public class ArrayDeque1 {
	public static void main(String[] args) {
		//Creating deque and adding elements
		Deque<String> deque = new ArrayDeque<String>();
		//Or
		//ArrayDeque<String> deque = new ArrayDeque<String>();
		deque.add("Zakir Ansari");
		deque.add("Vinit");
		
		//Traversing elements
		for(String str: deque) {
			System.out.println(str);
		}
	}
}
