package linkedlist;

public class MyLinkedList<T> {
	Node<T> head;
	private static int count = 0;

	static class Node<T> {
		T data;
		Node<T> next;

		Node(T data) {
			this.data = data;
			next = null;
		}
	}

	public int size() {
		return count;
	}

	public T get(int index) {
		int tempIndex = 0;
		T data = null;
		if (head == null) {
			System.out.println("No elements");
		} else if (index < 0) {
			throw new ArrayIndexOutOfBoundsException("Not a valid index: " + index);
		} else if(index > count-1){
			throw new ArrayIndexOutOfBoundsException("Not a valid index: " + index);
		}else {
			Node<T> tempNode = head;
			while (index != tempIndex) {
				tempNode = tempNode.next;
				tempIndex ++;
			}
			data = tempNode.data;
		}
		return data;
	}

	T add(T data) {
		Node<T> newNode = new Node<>(data);
		if (head == null) {
			head = newNode;
		} else {
			Node<T> tempNode = head;
			while (tempNode.next != null) {
				tempNode = tempNode.next;
			}
			tempNode.next = newNode;
		}
		count++;
		return data;
	}
	boolean addAfter(T after, T data) {
		Node<T> newNode = new Node<>(data);
		if (head == null) {
			System.out.println("No elements");
		}else {
			Node<T> tempNode = head;
			while(!tempNode.data.equals(after)) {
				tempNode = tempNode.next;
			}
			newNode.next = tempNode.next;
			tempNode.next = newNode;
			count++;
			return true;
		}
		return false;
	}
	void reverse() {
		Node<T> prev = null;
		Node<T> current = head;
		Node<T> next = null;
		while(current != null) {
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		head = prev;
	}

	
}
