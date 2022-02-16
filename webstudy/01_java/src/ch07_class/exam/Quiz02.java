/**
 * 학생의 정보를 저장할 수 있는 배열을 생성합니다.(2명)
 * 학생 정보를 등록하고 등록한 학생의 정보를 조회합니다.
 * 
 * 조건 : 학생의 정보를 담는 Student 클래스를 만들고 프로그램에 적용합니다.
 * 
 * 출력형식>

	학생정보 관리시스템
	---------------------------
	1. 조회
	2. 등록
	0. 종료
	---------------------------
	선택 : 1
	이름	전공	나이	성별
	---------------------------
	등록된 학생이 존재하지 않습니다.
	---------------------------
	---------------------------
	1. 조회
	2. 등록
	0. 종료
	---------------------------
	선택 : 2
	이름 : 홍
	나이 : 11
	전공 : 자바
	성별(남/여) : 남
	---------------------------
	1. 조회
	2. 등록
	0. 종료
	---------------------------
	선택 : 2
	이름 : 김
	나이 : 22
	전공 : SQL
	성별(남/여) : 여
	---------------------------
	1. 조회
	2. 등록
	0. 종료
	---------------------------
	선택 : 2
	더이상 저장할 공간이 없습니다.
	---------------------------
	1. 조회
	2. 등록
	0. 종료
	---------------------------
	선택 : 1
	이름	전공	나이	성별
	---------------------------
	홍	자바	11	남
	김	SQL	22	여
	---------------------------
	---------------------------
	1. 조회
	2. 등록
	0. 종료
	---------------------------
	선택 : 0
	종료되었습니다.  
  
 */
package ch07_class.exam;

import java.util.Scanner;

public class Quiz02 {
	public static void main(String[] args) {
		//학생정보를 담을 배열
		Student[] sArr = new Student[2]; //2명의 학생을 만들거라
		
		//학생을 배열에 넣어야할 위치와 크기 정보를 표시하는 변수
		int pos = 0;
		
		
		
		System.out.println("학생정보 관리 시스템");
		Scanner sc = new Scanner(System.in);
		int menu;
		
		outer:
		while(true) {
			System.out.println("-------------------");
			System.out.println("1. 조회");
			System.out.println("2. 등록");
			System.out.println("0. 종료");
			System.out.println("-------------------");
			
			System.out.print("선택 : ");
			menu = Integer.parseInt(sc.nextLine());
			switch(menu) {
			case 1:
				System.out.println("이름	전공	나이	성별")    ;
				System.out.println("---------------------------")    ;
				
				for (int i = 0; i < pos ; i++) {
					Student s = sArr[i]; //하나씩 주소를 가르키기 위해
					System.out.print(s.name + "\t");
					System.out.print(s.major + "\t");
					System.out.print(s.age + "\t");
					System.out.print(s.gender + "\n");
				}
				
				if (pos == 0) {
					System.out.println("등록된 학생이 존재하지 않습니다.");
				}
				System.out.println("---------------------------")    ;
				break;
				
			
			case 2: 
				if(pos == sArr.length) {
					System.out.println("더이상 저장할 공간이 없습니다.");
					break;
				}
				
				//학생정보를 입력받아 배열에 저장
				Student s = new Student(); //새로운 스튜던트에 네임 나이 전공 성별이 초기화되어있따
				System.out.print("이름 : ");
				s.name = sc.nextLine();
				
				System.out.print("나이 : ");
				s.age = Integer.parseInt(sc.nextLine());
				
				System.out.print("전공 : ");
				s.major = sc.nextLine();
				
				System.out.print("성별 : ");
				s.gender = sc.nextLine();
			
			
				sArr[pos++] = s; //배열에 저장. 학생객체니까 가능한데.. 몇번째 넣을거냐
				break;
				
			case 0: break outer;
			default:
				System.out.println("다시 선택하세요");
			}
		}
			System.out.print("종료되었습니다");
			
			
			
			
			
			
			
			
			
			
	
		
		
		
		
		
		
		
		
		
	}
}
