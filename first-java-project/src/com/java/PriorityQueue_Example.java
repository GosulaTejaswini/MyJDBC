package com.java;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueue_Example {

	public static void main(String[] args) {
		
		PriorityQueue<String>queue=new PriorityQueue<>();
		
		queue.add("India");
		queue.add("Srilanka");
		queue.add("China");
		queue.add("Pakistan");
		queue.add("Bangladesh");
		System.out.println(queue);  // It does not follow FIFO but insert based on the Priority value
		
		//queue.remove();
		//System.out.println(queue);
		
		PriorityQueue<Integer>queue1=new PriorityQueue<>();
		
		queue1.add(23);
		queue1.add(150);
		queue1.add(15);
		queue1.add(66);
		queue1.add(3);
		
		System.out.println(queue1);
		
		System.out.println(queue1.contains(150));
		System.out.println(queue1.offer(67)); // insert the element into the queue
		System.out.println(queue1.peek());
		System.out.println(queue1.poll());
		System.out.println(queue1);
	}

}
