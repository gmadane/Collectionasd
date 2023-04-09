package LinkListConcepts;

public class MyLinkList {

	Node head;

	class Node {

		int data;
		Node next;

		Node(int data) {
			this.data = data;
			next = null;
		}

	}

	public void printLinkList() {

		Node n = head;

		while (n != null) {
			System.out.println("Priniting the values from LinkedList :::: " + n.data);
			n=n.next;

		}
	}

	public static void main(String[] args) {

		MyLinkList ll = new MyLinkList();
		Node first = ll.new Node(10);
		ll.head = first;

		Node second = ll.new Node(20);
		first.next = second;

		Node third = ll.new Node(30);
		second.next = third;
		
		ll.printLinkList();

	}
}
