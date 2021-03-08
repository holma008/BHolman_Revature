package march4_queue;

import java.util.LinkedList;
import java.util.Queue;

public class CRUDOperations {
	
	public static void main(String[] args) {
		
		Queue<String> q = new LinkedList();
		
		q.add("Ironman");
		q.add("Thor");
		q.add("Captain America");
		q.add("Scarlet Witch");
		
		System.out.println("Initial queue size : " + q.size());
		
		String firstElement = q.peek();
		System.out.println("Removing " + firstElement);
		q.remove();
		System.out.println("current queue size : " + q.size());
		for(String name : q){
			System.out.print(name + " ");
		}
		
		q.add("Vision");
		q.add("Ant Man");
		q.add("Hulk");
		firstElement = q.peek();
		System.out.println("\nRemoving " + firstElement);
		q.remove();
		System.out.println("current queue size : " + q.size());
		for(String name : q){
			System.out.print(name + " ");
		}
	}
}
