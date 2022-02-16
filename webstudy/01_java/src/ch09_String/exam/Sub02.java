package ch09_String.exam;

import java.util.Arrays;

public class Sub02 {
	//                  data "홍길동:22:서울특별시 마포구"   comp ":"
	String[] split(String data, String comp) {
		//data의 문자열의 길이만큼 temp에 길이 확보
		String[] temp = new String[data.length()];
		
		//: 콜론을 찾아야한다
		//문자열의 처음부터 콜론의 위치까지.
		int pos = 0;    
		while(true) {  
			    //콜론위치의 값           //콜론의 위치
			int sIndex = data.indexOf(comp);
			//abc:bed:girl
			//마지막에 girl이 남고 :이 없어서 값이 -1
			if(sIndex == -1) {
		     		//1로 변경해줘야해서
				//temp[pos] pos의 갯수가 -1이 되어서 출력하고자 ++을 붙여준다 
				temp[pos++] = data;
				break;
				
			}
			temp[pos++] = data.substring(0, sIndex);
			//substring (인덱스의 위치부터 끝까지 잘라라)
			data = data.substring(sIndex + 1);
		}
		
		//index번호부터 pos 길이만큼 복사
		return Arrays.copyOfRange(temp , 0, pos);
	}

}
