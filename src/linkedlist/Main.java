package linkedlist;

import linkedlist.MyLinkedList.Node;

public class Main {

	public static void main(String[] args) {
		MyLinkedList<Integer> myList = new MyLinkedList<>();
		myList.add(1);
		myList.add(2);
		myList.add(3);
		//System.out.println("Number of elements->"+myList.size());
		//System.out.println("Element at particular index: "+myList.get(1));
		//showElements(myList);
		//System.out.println("\n");
		//myList.reverse();
		//myList.showElements();
		//myList.addAfter(2,5);
		//showElements(myList);
		MyLinkedList<Integer> loopList = myList.createLoop();
		boolean isLoopPresent = loopList.findLoop();
		System.out.println("Is loop present? :: "+isLoopPresent);
		Node<Integer> nodeLoopFloyd = loopList.findLoopFloydAlgo();
		if(nodeLoopFloyd != null) {
			System.out.println("loop present floyd");
		}
		Node<Integer> firstElementLoopFloyd = loopList.getFirstElementOfLoop();
		if(firstElementLoopFloyd != null) {
			System.out.println("First element of the loop is ::"+firstElementLoopFloyd.data);
		}
		int loopLength = loopList.getLengthOfLoop();
		System.out.println("length of the loop is::"+loopLength);

	}
	static void showElements(MyLinkedList<Integer> list) {
		if(list.size()==0) {
			System.out.println("List is empty");
		}else {
			System.out.print("Elements->");
			for(int i = 0; i<list.size();i++) {
				System.out.print(list.get(i)+"\t");
			}
		}
	}
}
