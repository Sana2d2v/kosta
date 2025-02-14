package day0214;

import java.util.Scanner;
//
public class D03ConditionOperaor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b;
		//max =(a>b)?a:b;
		
		 System.out.println("첫번째 수를 입력");
		 a = sc.nextInt();
		 System.out.println("두번째 수를 입력");
		 b = sc.nextInt();
		 if(a>b) {
			 System.out.printf("큰수는%d입니다",a);
			 //이프문에 바로 출력문 넣어도 됨
		 }else {
			 System.out.printf("큰수는%d입니다",b);
		 }
		 

	}

}
