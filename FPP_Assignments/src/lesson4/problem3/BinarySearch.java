package lesson4.problem3;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BinarySearch search = new BinarySearch();
		int[] numbers = new int[]{12, 3, 4,324, 231, 345, 7, 9, 1, 24, 6};
		System.out.println("Look for " + search.Search(numbers, 12));
		System.out.println("Look for " + search.Search(numbers, 4));
	}
	
	public int Search(int[] obj, int lookfor)
	{
		int start = 0;
		int end = obj.length;
		int answer = binarySearch(obj, lookfor, start, end);
		
		return answer;
	}

	private int binarySearch(int[] obj, int look4, int start, int end) {
		// TODO Auto-generated method stub
		int mid = (start + end)/2;
		if(obj[mid] == look4)
			return obj[mid];
		
		if((end == mid) || (mid == start)) return -1;
		
		if(obj[mid] > look4)
			return binarySearch(obj, look4,start,mid);
		else 
			return binarySearch(obj, look4, mid,end);


	}

}
