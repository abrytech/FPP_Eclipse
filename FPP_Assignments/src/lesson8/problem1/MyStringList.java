package lesson8.problem1;

import java.util.Arrays;
import java.util.Collections;

public class MyStringList {

	private static final int INTIAL_LENGTH = 10;
	private int size;
	private String[] typeArr;

	public MyStringList() {
		typeArr = new String[INTIAL_LENGTH];
		size = 0;
	}

	public void add(String value) {
		if (size == typeArr.length)
			resize();
		typeArr[size++] = value;
	}

	public String get(int index) {
		if (index < 0 || index > size)
			return null;
		else
			return typeArr[index];
	}

	public boolean find(String word) {
		for (String words : typeArr) {
			if (words.equals(word))
				return true;
		}
		return false;
	}

	public void insert(String word, int index) {

		if (index > size || index < 0)
			return;
		if (index >= typeArr.length || size + 1 > typeArr.length) {
			resize();
		} else {
			int length = typeArr.length;
			String[] temp = new String[length + 1];

			for (int i = 0; i < index; i++) {
				temp[i] = typeArr[i];
			}

			temp[index] = word;

			for (int i = index + 1; i <= size; i++) {
				temp[i] = typeArr[i - 1];
			}

			typeArr = temp;
			size++;
		}
	}

	public boolean remove(String word) {
		if (size == 0)
			return false;
		int length = typeArr.length;
		String[] temp = new String[length + 1];
		int index = -1;

		for (int i = 0; i < size; i++) {
			if (word.equals(typeArr[i])) {
				index = i;
				break;
			}
		}
		if (index == -1)
			return false;
		System.arraycopy(typeArr, 0, temp, 0, index);
		System.arraycopy(typeArr, index + 1, temp, index, size - (index + 1));
		typeArr = temp;
		--size;
		return true;
	}

	private void resize() {
		int length = typeArr.length;
		int newLength = 2 * length;
		String[] temp = new String[newLength];
		typeArr = Arrays.copyOf(typeArr, newLength);
		System.arraycopy(typeArr, 0, temp, 0, length);
	}

	public String toString() {
		StringBuilder sb = new StringBuilder("[");
		for (int i = 0; i < size - 1; ++i) {
			sb.append(typeArr[i] + ", ");
		}
		sb.append(typeArr[size - 1] + "]");
		return sb.toString();
	}

	public int size() {
		return size;
	}

	public void sort() {
		if (typeArr == null || typeArr.length <= 1)
			return;
		int len = size;
		int temp = 0;
		for (int i = 0; i < len; i++) {
			int nextMinPos = minpos(i, len - 1);
			swap(i, nextMinPos);
		}
	}

	private void swap(int i, int j) {
		String temp = typeArr[i];
		typeArr[i] = typeArr[j];
		typeArr[j] = temp;
	}

	public int minpos(int bottom, int top) {
		String m = typeArr[bottom];
		int index = bottom;
		for (int i = bottom + 1; i <= top; i++) {
			if (typeArr[i].compareTo(m) < 0) {
				m = typeArr[i];
				index = i;
			}
		}
		// return location of min, not the min itself
		return index;
	}

	public boolean search(String word) {
		boolean b = recurse(0, size - 1, word);
		return b;
	}

	private boolean recurse(int a, int b, String val) {
		int mid = (a + b) / 2;
		if (a > b) return false;
		if (typeArr[mid].equals(val)) return true;
		else if (val.compareTo(typeArr[mid]) > 0)
			return recurse(mid + 1, b, val);
		return recurse(a, mid - 1, val);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyStringList l = new MyStringList();
		l.add("Bob");
		l.add("Steve");
		l.add("Susan");
		l.add("Mark");
		l.add("Dave");
		System.out.println("The list of size " + l.size() + " is " + l);
		l.remove("Mark");
		l.remove("Bob");
		System.out.println("The list of size " + l.size() + " is " + l);
		l.insert("Richard", 3);
		System.out.println("The list of size " + l.size() + " after inserting Richard into pos 3 is " + l);
		l.insert("Tonya", 0);
		System.out.println("The list of size " + l.size() + " after inserting Tonya into pos 0 is " + l);
		//l.sort();
		//System.out.println("The list of size " + l.size() + " after sorting is " + l);
		System.out.println("Searching Meron = " + l.search("Meron"));
		System.out.println("Searching Tonya = " + l.search("Tonya"));

		
		MyStringList lists = new MyStringList();
		lists.add("big"); lists.add("small"); lists.add("tall"); lists.add("short"); lists.add("round"); lists.add("square");
		lists.add("enormous"); lists.add("tiny"); lists.add("gargantuan"); lists.add("lilliputian");
		lists.add("numberless"); lists.add("none"); lists.add("vast"); lists.add("miniscule");
		
		System.out.println("The list of size " + lists.size() + " is " + lists);
		lists.sort();
		System.out.println("Searching number = " + lists.search("number"));
		System.out.println("Searching tiny = "  + lists.search("tiny"));
	}

}
