package ch08_method.exam;

public class Sub04 {
	/**
	 * 0~5세까지 요금이 0원
	 * 6~12세까지는 요금 1200원
	 * 13세이상 요금 3000원
	 * 
	 * @param age
	 * @return
	 */
	int calFee(int age) {
		if(age >= 13) return 3000;
		if (age >= 6) return 1200;
		return 0;	
	}
	
	
	//너무 어렵다리..
	int totFee(People[] arr ) {
		int fee = 0;
       // 뭐야 ;;; 	
		for(People p : arr) {
			fee += calFee(p.age);		
		}
		return fee;
	}
	
	
	
	
	

}
