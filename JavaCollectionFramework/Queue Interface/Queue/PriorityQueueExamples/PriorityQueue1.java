/*
 * Queue interface maintains the first-in-first-out order.
 * It can be defined as an ordered list that is used to hold the 
 * elements which are about to be processed.
 */

package Queue.PriorityQueueExamples;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueue1 {
	public static void main(String[] args) {
		PriorityQueue<String> queue = new PriorityQueue<String>();
		queue.add("Zakir");
		queue.add("Varun");
		queue.add("Suraj");
		queue.add("Dilshad");
		
		System.out.println("Head:"+queue.element());
		System.out.println("Head:"+queue.peek()); //Retrieves, but does not remove, the head of this queue,or returns null if this queue is empty.
		System.out.println("itrating the queue elements:");
		
		Iterator<String> itr = queue.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		queue.remove(); //Retrieves and removes the head of this queue. This method differs from poll only in that it throws an exception if thisqueue is empty
		queue.poll();	//Retrieves and removes the head of this queue,or returns null if this queue is empty.
		
		System.out.println("after removing two elements: ");
		
		Iterator<String> itr2 = queue.iterator();
		
		while(itr2.hasNext()) {
			System.out.println(itr2.next());
		}
	}
}
