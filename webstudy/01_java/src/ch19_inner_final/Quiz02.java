package ch19_inner_final;

import java.util.Iterator;

class MyArray{
	String[] arr = {"a","b","c"};
	int pos = 3;
	
	public Iterator iterator() {
		return new MyIterator();
	}
	class MyIterator implements Iterator {
		int index = 0;
		//index와 pos 값을 비교했다..
		public boolean hasNext() {
			return index < pos;
		}
		public Object next() {
			//내부클래스라서 arr을 사용가능
			return arr[index++];
		}
	}
}




public class Quiz02 {
	public static void main(String[] args) {
		MyArray ma = new MyArray();
		Iterator ite = ma.iterator();
		while(ite.hasNext()) {
			System.out.println(ite.next());
		}
		
		
		
	}

}
