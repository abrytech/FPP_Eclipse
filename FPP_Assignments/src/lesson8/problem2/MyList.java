package lesson8.problem2;

import java.util.Arrays;

class Person {
	
	private String lastName;
	private String firstName;
	private int age;
	// --------------------------------------------------------------
	public Person(String last, String first, int a) { // constructor
	lastName = last;
	firstName = first;
	age = a;
	}
	// --------------------------------------------------------------
	public String getLast() // get last name
	{
	return lastName;
	}
	
	@Override
	public String toString() {
	return "\nPerson -> [Last Name = " + lastName + " -- First Name = " + firstName + " -- Age = " + age + "]";
	}

}

public class MyList {

	private static final int INTIAL_LENGTH = 10;
	private int size;
	private Person[] typeArr;

	public MyList() {
		typeArr = new Person[INTIAL_LENGTH];
		size = 0;
	}

	public void add(Person value) {
		if (size == typeArr.length)
			resize();
		typeArr[size++] = value;
	}

	public Person get(int index) {
		if (index < 0 || index > size)
			return null;
		else
			return typeArr[index];
	}

	public boolean find(String word) {
		for (Person words : typeArr) {
			if (words != null) {
			if (words.getLast().equals(word))
				return true;
			}
		}
		return false;
	}

	public void insert(Person word, int index) {

		if (index > size || index < 0)
			return;
		if (index >= typeArr.length || size + 1 > typeArr.length)
			resize();
		
			int length = typeArr.length;
			Person[] temp = new Person[length + 1];

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

	public boolean remove(String word) {
		if (size == 0)
			return false;
		int length = typeArr.length;
		Person[] temp = new Person[length];
		int index = -1;

		for (int i = 0; i < size; i++) {
			if (word.equals(typeArr[i].getLast())) {
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
		Person[] temp = new Person[newLength];
		typeArr = Arrays.copyOf(typeArr, newLength);
		System.arraycopy(typeArr, 0, temp, 0, length);
	}

	public String toString() {
		StringBuilder sb = new StringBuilder("[");
		for (int i = 0; i < size - 1; ++i) {
			sb.append(typeArr[i] + ", ");
		}
		sb.append(typeArr[size - 1] + "\n]");
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
		Person temp = typeArr[i];
		typeArr[i] = typeArr[j];
		typeArr[j] = temp;
	}

	public int minpos(int bottom, int top) {
		Person m = typeArr[bottom];
		int index = bottom;
		for (int i = bottom + 1; i <= top; i++) {
			if (typeArr[i].getLast().compareTo(m.getLast()) < 0) {
				m = typeArr[i];
				index = i;
			}
		}
		// return location of min, not the min itself
		return index;
	}

	public boolean search(String word) {
		MyList temp = this;
		temp.sort();
		boolean b = recurse(temp, 0, size - 1, word);
		return b;
	}

	private boolean recurse(MyList temp, int a, int b, String val) {
		int mid = (a + b) / 2;
		if (a > b) return false;
		if (typeArr[mid].getLast().equals(val)) return true;
		else if (val.compareTo(typeArr[mid].getLast()) > 0)
			return recurse(temp, mid + 1, b, val);
		return recurse(temp, a, mid - 1, val);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyList persons = new MyList();
		persons.add(new Person("Endris", "Meron", 26));
		persons.add(new Person("Tesfaye", "Meron", 22));
		persons.add(new Person("Tesfahun", "Saron", 23));
		persons.add(new Person("Habte", "Yitay", 23));
		System.out.println("\n Size() : " + persons.size() + " is\n" + persons);
		System.out.println("\nRemoving Meron -> " + persons.remove("Meron"));
		System.out.println("\n Size() : " + persons.size() + " is \n" + persons);
		System.out.println("\nRemoving Tesfaye ->" + persons.remove("Tesfaye"));
		System.out.println("\n Size() : " + persons.size() + " is \n" + persons);
		persons.insert(new Person("Yimer", "Betty", 32), 2);
		System.out.println(persons.get(2));
		System.out.println("\nSearching of Yitay: " + persons.search("Yitay"));
		System.out.println("\nSearching of Habte: " + persons.search("Habte"));
		System.out.println("\nSearching of Meron: " + persons.search("Meron"));
		System.out.println("\nSearching of Endris: " + persons.search("Endris"));
		persons.sort();
		System.out.println("\nSorted: \n" + persons);		
		}

}

