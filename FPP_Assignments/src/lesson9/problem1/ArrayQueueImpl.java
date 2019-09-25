package lesson9.problem1;

public class ArrayQueueImpl {

	private int[] arr = new int[10];
	private int front = -1;
	private int rear = 0;

	public int peek() throws Exception {
		// implement
		if (isEmpty()) throw  new Exception();
		return arr[front];
	}

	public void enqueue(int obj) {
		// implement
		if(isFull()) resize();
		if(isEmpty())
		{ 
			arr[++front] = obj;
			rear++;
		}
		else
		arr[rear++] = obj;		
	}

	public int dequeue() throws Exception {
		// implement
		if (isEmpty()) throw new Exception();
		int first = arr[front];
		front++;
		return first;
	}

	public boolean isEmpty() {
		// implement
		return (front == -1 || front >= rear);
	}
	
	public boolean isFull() {
		// implement
		return (rear == arr.length);
	}

	public int size() {
		// implement
		if (isEmpty()) return 0;
		return rear - front;
	}

	private void resize() {
		// implement
		System.out.println("Array has been resized");
		int[] temp = new int[arr.length * 2];
		System.arraycopy(arr, 0, temp, 0, arr.length);
		arr = temp;
	}
	
	public static void main(String[] args) throws Exception {
		ArrayQueueImpl queueA = new ArrayQueueImpl();
		
		for(int i = 0; i < 20; i++)
		{
			queueA.enqueue(i);
			System.out.println("rear = " + queueA.rear);
		}
		for(int i = 0; i < 17; i++)
		{
			queueA.dequeue();
			System.out.println("top = " + queueA.front);
		}
		System.out.println("First element in queue " + queueA.peek());
		System.out.println("Size of queue " + queueA.size());
	}

}
