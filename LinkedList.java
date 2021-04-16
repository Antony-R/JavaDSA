
public class LinkedList {
	Node head;
	Node tail;
	int size;

	public void insert(int data) {
		Node node = new Node();
		node.data = data;
		node.next = null;
		node.prev = null;

		if (head == null) {
			head = node;
			size++;
		} else {
			Node n = head;
			while (n.next != null) {
				n = n.next;
			}
			n.next = node;
			node.prev = n;
			tail = node;
			size++;
		}
	}

	public void insertAt(int index, int data) {

		if (index >= size) {
			System.out.println("Index out of range");
			return;
		}

		Node n = head;

		if (index == 0) {
			Node node = new Node();
			node.data = data;
			node.next = null;
			node.prev = null;

			n.prev = node;
			node.next = n;
			head = node;
			size++;
			return;
		}

		for (int i = 0; i < index - 1; i++) {
			n = n.next;
		}
		Node node = new Node();
		node.data = data;
		node.next = null;
		node.prev = null;

		node.prev = n;
		node.next = n.next;
		n.next.prev = node;
		n.next = node;
		size++;

	}

	public void deleteAt(int index) {

		if (index >= size) {
			System.out.println("Index out of range");
			return;
		}

		Node n = head;

		if (index == 0) {
			n.next.prev = n.prev;
			head = n.next;
			size--;
			return;
		}

		for (int i = 0; i < index; i++) {
			n = n.next;
		}

		n.next.prev = n.prev;
		n.prev.next = n.next;
		size--;
	}

	public void show() {
		Node n = head;
		while (n.next != null) {
			System.out.println(n.data);
			n = n.next;
		}
		System.out.println(n.data);
	}

	public void showReverse() {
		Node n = tail;
		while (n.prev != null) {
			System.out.println(n.data);
			n = n.prev;
		}
		System.out.println(n.data);
	}

	public void reverse(Node headNode) {

		Node prevNode = headNode.prev;
		tail = headNode;
		
		while (headNode != null) {
			Node nextNode = headNode.next;
			headNode.next = prevNode;
			headNode.prev = nextNode;
			prevNode = headNode;
			headNode = nextNode;
		}

		head = prevNode;

	}
}
