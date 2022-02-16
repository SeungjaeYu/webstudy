package ch07_class;

public class Bread {
	//빵을 소개할 때 정보의 값이 있어야한다
	String name; //브래드 이름을 쓸 거. 클래스 이름이 빵이라 굳이 줄 필요 없다. 참조형. 자동초기화 null
	
	int price; //데이터가 두 개 이상 연관성을 갖고있으면 클래스로 같이 묶어서 관리하는게 좋다.
	//프로퍼티property(필드field, 멤버변수member variable, 속성attribute)
	//: 메소드포함 X , 클래스변수에 포함한다
	
	
	//배열에 접근하기 위해 이름을 사용.
	//배열이 아닌 이상 공간은 하나. []사용X b.name .은 b의 안의 name으로 들어가게해준다
    //b.name 변수의 이름  . 값을 바꿀떄는 b.name = 
}
