package QueueImplementation_SinglyLinkedList;

public interface Queue <E>{

	int size();
	boolean isEmpty();
	E firt();
	void enqueue(E val);
	E dequeue();
}
