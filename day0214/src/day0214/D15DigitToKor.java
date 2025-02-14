package day0214;

import java.util.Scanner;

public class D15DigitToKor {
//사용자에게 0~9사이의 정수를 입력받아 한글 표기식 출력하는 프로그램을 다중if문 사용해서
	//실행 예  
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a;
		
		System.out.print("0~9사이의 정수를 입력해");
		a = sc.nextInt();
		
		if(a == 0) {
			System.out.printf("%d 는 한글표기식으로 영 입니다", a);
		}else if(a ==1) {
			System.out.printf("%d 는 한글표기식으로 일 입니다", a);
		}else if(a ==2) {
			System.out.printf("%d 는 한글표기식으로 이 입니다", a);
		}else if(a ==3) {
			System.out.printf("%d 는 한글표기식으로 삼 입니다", a);
		}else if(a ==4) {
			System.out.printf("%d 는 한글표기식으로 사 입니다", a);
		}else if(a ==5) {
			System.out.printf("%d 는 한글표기식으로 오 입니다", a);
		}else if(a ==6) {
			System.out.printf("%d 는 한글표기식으로 육 입니다", a);
		}else if(a ==7) {
			System.out.printf("%d 는 한글표기식으로 칠 입니다", a);
		}else if(a ==8) {
			System.out.printf("%d 는 한글표기식으로 팔 입니다", a);
		}else if(a ==9) {
			System.out.printf("%d 는 한글표기식으로 구 입니다", a);
		}
		
	}

}
