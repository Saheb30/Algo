package linkedlist;

import java.util.HashSet;
import java.util.Set;


public class MyLinkedList<T> {
	Node<T> head;
	private static int count = 0;
	private static boolean isLoopPresnt = false;

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
	boolean findLoop() {
		Set<Node<T>> set = new HashSet<>();
		if (head == null) {
			System.out.println("No elements"); 
		}else {
			Node<T> tempNode = head;
			while(tempNode.next != null) {
				if(set.contains(tempNode)) {
					isLoopPresnt = true;
					return true;
				}
				set.add(tempNode);
				tempNode = tempNode.next;
			}
		}
		return false;
	}
	public MyLinkedList<Integer> createLoop(){
		MyLinkedList<Integer> myLinkedList = new MyLinkedList<>();
		myLinkedList.head = new Node<>(1);
        myLinkedList.head.next = new Node<>(2);
        Node<Integer> node = myLinkedList.head.next.next = new Node<>(3);
        myLinkedList.head.next.next.next = new Node<>(4);
        myLinkedList.head.next.next.next.next = new Node<>(5);
        myLinkedList.head.next.next.next.next.next = new Node<>(6);
        myLinkedList.head.next.next.next.next.next.next = node;
        return myLinkedList;
	}
	public Node<T> findLoopFloydAlgo(){
		if (head == null) {
			System.out.println("No elements");
		} else {
			Node<T> slow = head;
			Node<T> fast = head;
			while (slow != null && fast != null && fast.next != null) {
				slow = slow.next;
				fast = fast.next.next;
				if (slow == fast) {
					return fast;
				}
			}
		}
		return null;
	}
	public Node<T> getFirstElementOfLoop(){
		if(isLoopPresnt) {
			Node<T> slow = head;
			Node<T> fast = findLoopFloydAlgo();
			while(slow != fast) {
				slow = slow.next;
				fast = fast.next;
			}
			return slow;
		}
		return null;
	}
	public int getLengthOfLoop(){
		int length = 0;
		if(isLoopPresnt) {
			Node<T> slow = head;
			Node<T> fast = findLoopFloydAlgo();
			while(slow != fast) {
				slow = slow.next;
				fast = fast.next;
			}
			/*fast = fast.next;
			length++;
			while(fast != slow) {
				length++;
				fast = fast.next;
			}*/
			do {
				length++;
				fast = fast.next;
			}while(fast != slow);
		}
		return length;
	}
	public void rotate(int rotateBy) {
		Node<T> currentNode = head;
		Node<T> kthNode = head;
		Node<T> lastNode = null;
		for(int i =1;i<rotateBy;i++) {
			currentNode = currentNode.next;
		}
		kthNode = currentNode;
		while(currentNode.next != null) {
			currentNode = currentNode.next;
		}
		currentNode.next = head;
		head = kthNode.next;
		kthNode.next = null;
	}
	
}
