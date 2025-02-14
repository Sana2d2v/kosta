package day0213;

import java.util.Scanner;

public class D032StringEquls {
//
	public static void main(String[] args) {
		String pwd, cHsckpwd;
		Scanner sc = new Scanner(System.in);
		System.out.println("암호를 입력하시오");
		pwd = sc.next();
		System.out.println("암호확인를 입력하시오");
		cHsckpwd = sc.next();
		
		if(pwd==cHsckpwd) {
			System.out.println("암호와 암호 확인이 같아요");
		}else {
			System.out.println("암호와 암호 확인이 달라요");
		}
		/*
		 * 암호를 입력하시오
123
암호확인를 입력하시오
123
암호와 암호 확인이 달라요

참조자료형인 string은 ==  연산자로 서로 같은 값인지 판별할 수 없다.
equals 써야함 

		 */
		
	}

}
