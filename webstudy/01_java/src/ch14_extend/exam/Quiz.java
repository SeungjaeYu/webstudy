package ch14_extend.exam;

class QParent {
	QParent()      {  System.out.println(1); }  //2
	QParent(int i) {  System.out.println(2); }
}
class QChild extends QParent {
	public QChild() { 
		//super(); 생략
		System.out.println(3);  //3
	}
	public QChild(int i) { 
		this(); 
		System.out.println(5);  //4
	}
}

public class Quiz {
	public static void main(String[] args) {
		System.out.println(4); // 1 
		new QChild(100);
	}
}





