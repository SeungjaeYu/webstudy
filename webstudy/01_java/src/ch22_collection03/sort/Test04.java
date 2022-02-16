package ch22_collection03.sort;

import java.util.Arrays;

class Data04{
	private int num;
	
	public Data04(int num) {
		this.num = num;
	}

	protected int getNum() {
		return num;
	}

	protected void setNum(int num) {
		this.num = num;
	}

	@Override
	public String toString() {
		//num을 문자열로 바꿔준다
		return String.valueOf(this.num);
	}
	
	
}


public class Test04 {
	public static void main(String[] args) {
		Data04 d1 = new Data04(5);
		Data04 d2 = new Data04(3);
		Data04 d3 = new Data04(9);
		
		
        //Data04 의 배열 선언
		Data04[] arr = {d1, d2, d3};
	
		//주소값이 찍힌다 Object의 toString이 찍힘
		//Data04 클래스에 toString을 사용
		System.out.println(Arrays.toString(arr));
		
		
		
		//정렬을 처리 직접주기
		for(int i = 0 ; i < arr.length-1 ; i++) {
			System.out.println(arr[i]);
			int minIndex = i;
			for(int j = 1; j < arr.length; j++) {
				if(arr[minIndex].getNum()> arr[j].getNum()) 
					minIndex = j;
			}
			if(arr[minIndex] == arr[i]) continue;
			Data04 temp = arr[minIndex];
			arr[minIndex] = arr[i];
			arr[i] = temp;

			
		}
		System.out.println("정렬직접: "+Arrays.toString(arr));
		
	
		

		
		
	}

}
