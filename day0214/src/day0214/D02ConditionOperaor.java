package day0214;

import java.util.Scanner;
//
public class D01ConditionOperaor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b;
		max =(a>b)?a:b;
		//a가b보다 큽니까? > 참이라면a를 max에 저장하고 거짓이면 b를max에 저장하ㅅ시오
		 System.out.println("첫번째 수를 입력");
		 a = sc.nextInt();
		 System.out.println("두번째 수를 입력");
		 b = sc.nextInt();
		 
	
		 System.out.println("큰수는:"+max);
		 //큰수를 출력
	}

}
