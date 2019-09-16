package lesson7.problem2;

public class MyTable {
	Entry[] entries = new Entry[26];

	public void add(char c, String s) {
		int index = computeIndex(c);
		entries[index] = new Entry(c, s);
	}

	public String get(char c) {
		Entry e = entries[computeIndex(c)];
		return e.str;
	}

	private int computeIndex(char c) {
		return (int) c - 97;
	}

	public String toString() {
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < 26; ++i) {
			if (entries[i] != null) {
				sb.append(entries[i].toString());
				sb.append(System.getProperty("line.separator"));
			}
		}
		return sb.toString();
	}

	class Entry {
		
		char chars;
		String str;

		Entry(char chars, String str){
			this.chars = chars;
			this.str = str;
		}
		public String toString(){
			return("" + chars + " -> " + str);
		}	
		
	}
	
	public static void main(String[] args) {
		MyTable table = new MyTable();
		table.add('a', "Andrew");
		table.add('b', "Billy");
		table.add('w', "Willie");
		System.out.println(table.get('w'));
		System.out.println(table);

	}
}
