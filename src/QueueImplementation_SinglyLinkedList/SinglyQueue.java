package QueueImplementation_SinglyLinkedList;

public class SinglyQueue <E> implements Queue<E>{

	SinglyLinkedList<E> queuelist =  new SinglyLinkedList<E>();
	@Override
	public int size() {
		return queuelist.size();
	}

	@Override
	public boolean isEmpty() {
		return queuelist.isEmpty();
	}

	@Override
	public E firt() {
		return queuelist.first();
	}

	@Override
	public void enqueue(E val) {
		queuelist.add(val);
	}

	@Override
	public E dequeue() {
		return queuelist.remove();
	}

}
