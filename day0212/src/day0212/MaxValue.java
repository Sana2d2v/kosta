package day0212;

import java.util.Scanner;

public class MaxValue {

	public static void main(String[] args) {
		int n ;
		Scanner sc = new Scanner(System.in);
		String result;
		System.out.println("***홀 짝 판별 ***");
		System.out.print("정수 입력");
		n = sc.nextInt();

		if(n % 2 == 0){
			result = "짝수";
		}else {
			result = "홀수";
			}
		System.out.println("입력한 숫자"+n+"은(는)"+result+"입니다.");

		}

}
