package day0213;

import java.util.Scanner;

public class D033StringEquls {
//
	public static void main(String[] args) {
		String pwd, cHsckpwd;
		Scanner sc = new Scanner(System.in);
		System.out.println("암호를 입력하시오");
		pwd = sc.next();
		System.out.println("암호확인를 입력하시오");
		cHsckpwd = sc.next();
		
		//if(pwd==cHsckpwd) 이부분을 이퀄즈 써서 바꿔줌
		if(pwd.equals(cHsckpwd)) {
			System.out.println("암호와 암호 확인이 같아요");
		}else {
			System.out.println("암호와 암호 확인이 달라요");
		}
		

		
	}

}
