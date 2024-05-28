package QueueImplementation_SinglyLinkedList.Application;

import QueueImplementation_SinglyLinkedList.SinglyQueue;

public class App {

	public static void main(String[] args) {
		SinglyQueue <Integer> queue = new SinglyQueue <>();
		Integer a=2,b=3,c=4,d=5;
		System.out.println(queue.size());
		System.out.println(queue.isEmpty());
		queue.enqueue(a);
		queue.enqueue(b);
		queue.enqueue(c);
		queue.enqueue(d);
		System.out.println(queue.size());
		System.out.println(queue.isEmpty());
		System.out.println("first element :  "+queue.firt());
		System.out.println("removed   element :  "+queue.dequeue());
		System.out.println("current size is  : "+queue.size());
		System.out.println("first element :  "+queue.firt());
		
		
	}
}
