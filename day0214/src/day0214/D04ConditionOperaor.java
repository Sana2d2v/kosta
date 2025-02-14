package day0214;

import java.util.Scanner;
//
public class D04ConditionOperaor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b;
		//max =(a>b)?a:b;
		
		 System.out.println("첫번째 수를 입력");
		 a = sc.nextInt();
		 System.out.println("두번째 수를 입력");
		 b = sc.nextInt();
		 
		 System.out.printf("큰수는 %d입니다",(a>b)?a:b);

	}

}
