package ch17_interface.exam;

import java.util.Iterator;


	
	
	class MyIterator implements Iterator {
		String[] data = {"a", "b","c"};
		int pos = 3;
		int index = 0;
		public boolean hasNext() {
		 return index < pos; // 0 < 3 true	
		}
		public Object next() {
			return data[index++]; //true 면 data[0]
		}
		
	}
	
public class Quiz02 {
	public static void main(String[] args) {
		Iterator ite = new MyIterator();
		while (ite.hasNext()) {
			System.out.println(ite.next());
		}

	}

}
