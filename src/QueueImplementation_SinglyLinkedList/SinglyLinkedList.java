package QueueImplementation_SinglyLinkedList;

public class SinglyLinkedList<E> {
	private static class Node<E>{
		private E element;
		private Node<E>next;
		//constructs an element and its next reference node
		public Node(E element, Node<E>next) {
			this.element = element;
			this.next = next;
		}
		//gets element
		public E getElement() {
			return element;
		}
		public void setNext(Node<E> n) {
			this.next = n;
		}
		public Node<E> getNext(){
			return next;
		}
	}//end node class
	
	private Node<E>head = null;
	private Node<E>tail = null;
	private int size = 0;
	
	public int size() {
		return size;
	}
	//
	public boolean isEmpty() {
		return (size == 0);
	}
	//retrieves first element
	public E first() {
		return head.getElement();
	}
	//adds element
	public void add(E val) {
		Node<E>newnode = new Node<E>(val,tail);
		if(isEmpty())
			tail = head = newnode;
		newnode.setNext(null);
		tail.setNext(newnode);
		tail = newnode;
		size++;
	}
	//removes first element
	public E remove() {
		E val = head.getElement();
		head = head.getNext();
		size--;
		return val;
	}

}
