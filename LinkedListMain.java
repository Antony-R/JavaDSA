
public class LinkedListMain {

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.insert(1);
		list.insert(2);
		list.insert(3);
		list.insert(4);
		
		list.show();
		System.out.println("=".repeat(20));
		list.showReverse();
		
		System.out.println("=".repeat(20));
		
		list.insertAt(2, 99);
		list.deleteAt(0);
		
		list.show();
		System.out.println("=".repeat(20));
		list.showReverse();
		
		System.out.println("size: " + list.size);
		
		list.reverse(list.head);
		System.out.println("=".repeat(20));
		list.show();
		
		System.out.println("=".repeat(20));
		list.showReverse();
	}

}
