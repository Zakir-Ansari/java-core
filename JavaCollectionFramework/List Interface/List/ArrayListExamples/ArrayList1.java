package List.ArrayListExamples;

import java.util.*;

public class ArrayList1 {
	public static void main(String... args) {
		// Array List of "list" of type String is defined
		ArrayList<String> list= new ArrayList<>();
		
		// Adding objects in ArrayList
		list.add("Ravi");
		list.add("Ajay");
		list.add("Pankaj");
		
		
		Iterator<String> itr = list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		//Invoking arraylist objects
		//System.out.println(list);
	}
}
