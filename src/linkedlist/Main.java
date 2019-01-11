package linkedlist;

public class Main {

	public static void main(String[] args) {
		MyLinkedList<Integer> myList = new MyLinkedList<>();
		myList.add(1);
		myList.add(2);
		myList.add(3);
		System.out.println("Number of elements->"+myList.size());
		System.out.println("Element at particular index: "+myList.get(1));
		showElements(myList);
		System.out.println("\n");
		//myList.reverse();
		//myList.showElements();
		myList.addAfter(2,5);
		showElements(myList);

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
