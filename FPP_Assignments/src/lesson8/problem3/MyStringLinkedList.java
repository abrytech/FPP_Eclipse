package lesson8.problem3;

public class MyStringLinkedList {
	Node header;

	MyStringLinkedList() {
		header = new Node(null, null, null);
	}

	public void addSort(String item) {
		// Implement
		if(item == null) return;
		if(isEmpty()) addAtFirst(item);
		else {
		Node temp = header;
		while(temp.next != null)
		{			
			if(item.compareTo(temp.next.value) > 0)	temp = temp.next;
			else break;
		}
		if(temp != null) insertAfter(temp, item);
		}
		
	} // insert in a Sorted Order

	public int size() {
		// Implement
		int count = 0;
		Node temp = header;
		while(temp.next != null)
		{
			count ++;
			temp = temp.next;
		}
		return count;
	}

	public boolean isEmpty() {
		// Implement
		return header.next == null;
	}

	public Node getFirst() {
		// Implement
		return header.next;
	}

	public Node getLast() {
		Node temp = header;
		while(temp.next != null)
		{
			temp = temp.next;
		}
		return temp;
	}

	public boolean contains(String item) {
		// Implement
		if(item == null || isEmpty()) return false;
		Node temp = header;
		while(temp.next != null)
		{
			temp = temp.next;
			if(temp.value.equals(item)) return true;
		}
		//if(temp.value.equals(item)) return true;
		return false;
	}

	public void removeFirst() {
		// Implement
		if(isEmpty()) return;
		Node first = getFirst();
		if(first.next != null)
		{
			first.next.previous = header;
			header.next = first.next;
		}
		else header = null;		
		first = null;
	}

	void removeLast() {
		// Implement
		if(isEmpty()) return;
		Node last = getLast();
		last.previous.next = null;
		last = null;
	}

	public void print() {
		print(header);
	}
	
	public void printReverse() {
		printReverse(getLast());
	}

	// Write a recursive print method to display the elements in the list.
	void print(Node n) {
		if(n.next == null) return;
		//System.out.println("pre = " + n.next.previous+ " value = "+ n.next + " next = " + n.next.next);
		System.out.println(n.next);
		print(n.next);
	}
	void printReverse(Node n) {
		if(n.previous == null) return;	
		System.out.println(n);
		printReverse(n.previous);
			
	}

	public String toString() {
		StringBuilder str = new StringBuilder();
		Node temp = header.next;
		while (temp != null) {
			str.append("-->[" + temp.value.toString() + "]");
			temp = temp.next;
		}
		str.append("-->[" + "NULL" + "]");
		return str.toString();
	}
	
	private void addAtFirst(String word)
	{
		insertAfter(header, word);
	}
	
	private void insertAfter(Node pos, String word)
	{		
		Node temp = new Node(pos, word, pos.next);
		if(pos.next != null) pos.next.previous = temp;
		pos.next = temp;
		
	}

	public class Node {
		String value;
		Node next;
		Node previous;

		Node(Node previous, String value, Node next) {
			this.previous = previous;
			this.value = value;
			this.next = next;
		}

		public String toString() {
			return value;
		}
	}

	public static void main(String[] args) {
		MyStringLinkedList mySL = new MyStringLinkedList();
		// Make use of the implemented methods

		System.out.println("Firstly is empty? " + mySL.isEmpty());
		System.out.println("Size = " + mySL.size());
		mySL.addSort("d");
		mySL.addSort("d");
		mySL.addSort("e");
		System.out.println("Size = " + mySL.size());
		mySL.addSort("o");
		mySL.addSort("c");
		mySL.addSort("b");
		mySL.addSort("a");
		mySL.addSort("10");
		mySL.addSort("20");
		mySL.addSort("15");
		mySL.addSort("13");
		mySL.addSort("3");
		mySL.addSort("5");
		mySL.addSort("2");
		mySL.addSort("1");
		System.out.println(mySL);
		System.out.println("First element = " + mySL.getFirst());
		System.out.println("Last element = " + mySL.getLast());
		System.out.println("Size = " + mySL.size());
		System.out.println("Lastly is empty? " + mySL.isEmpty());
		System.out.println("Find 10 is in the List  : " + mySL.contains("10"));
		System.out.println("Find z is in the List  : " + mySL.contains("z"));
		System.out.println("Find o is in the List  : " + mySL.contains("o"));
		System.out.println("Fist item " + mySL.getFirst() + " removed" );mySL.removeFirst();
		System.out.println(mySL);
		System.out.println("Last item " + mySL.getLast() + " removed" );mySL.removeLast();
		System.out.println(mySL);
		System.out.println("Displaying list");
		mySL.print();
		System.out.println("Displaying list in reverse oreder");
		mySL.printReverse();
		
	}

}
