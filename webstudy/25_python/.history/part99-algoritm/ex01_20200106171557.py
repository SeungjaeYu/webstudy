T = int(input())
# arr = list()
# 여러개의 테스트 케이스가 주어지므로, 각각을 처리합니다.
while()
    result = 0
    val2 = int(input()).split()
    for j in val2:
        if int(j) % 2 != 0:
            result += int(j)
    arr.append(result)
 
idx = 0
for k in arr[0:]:
    idx += 1
    print("#{0} {1}".format(idx,k))



    package ch99.algoritm;

import java.util.Scanner;

public class Solution {	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = Integer.parseInt(sc.nextLine());
		int sum = 0;
		while(num > 0) {
			sum += num % 10;
			num /= 10;
			
		}
		System.out.println(sum);
		sc.close();
	}

}