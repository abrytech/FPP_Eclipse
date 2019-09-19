package lesson9.problem2;
interface Stack1 {
	public void push(Object ob);

	public Object pop();

	public Object peek();

	public boolean isEmpty();

	public int size();
}
public class ArrayStackDemo implements Stack1 {

	private class Node {
		Object value;
		Node next;
		Node previous;

		Node(Node previous, Object item, Node next) {
			this.previous = previous;
			this.value = item;
			this.next = next;
		}

		public String toString() {
			return value + " ";
		}
	}

	private Node top;
	private int size; 

	ArrayStackDemo() 
		{
			top = null; 
			size = 0; 
		}

	public void push(Object item) 
	{
		if (top == null) {
			top = new Node(null, item, null);
			size++;
		} else {
			Node n = new Node(null, item, top);
			top.previous = n;
			top = n;
			size++;
		}

	}

	public Object pop() 
	{
		Object temp = null;
		if (top == null) {
			System.out.println("Stack is Empty");
			return null;
		}
		if (top != null) {
			temp = top.value;
			top.next.previous = null;
			top = top.next;
			size--;
		}
		return temp;
	}

	public Object peek() 
	{
		if (isEmpty())
			return null;
		return top.value;
	}

	public boolean isEmpty() 
	{
		return (top == null);
	}

	public int size() 
	{
		return size;
	}

	public String toString() {
		String str = "";
		Node temp = top;
		while (temp != null) {
			str = str + "-->[" + temp.value.toString() + "]";
			temp = temp.next;
		}
		str = str + "-->[" + "NULL" + "]";
		return str;
	}

	public static void main(String[] args) {
		ArrayStackDemo stack = new ArrayStackDemo(); 
		Object item;
		stack.push('3'); 
		stack.push('4');
		stack.push('5');
		stack.push('6');
		System.out.println("Stack contents = " + stack);
		System.out.println("size(): " + stack.size());
		item = stack.pop(); 
		System.out.println(item + " is deleted");
		stack.push('D'); 
		stack.push('E');
		System.out.println(stack.pop() + " is deleted");
		stack.push('G'); 
		System.out.println("Stack Elements : " + stack);
		item = stack.peek(); // get top item from the stack
		System.out.println(item + " is on top of stack");
		System.out.println("Size of the Stack : " + stack.size());
		ArrayStackDemo stack2 = new ArrayStackDemo();
		stack2.push("Java");
		stack2.push(20);
	}
}
